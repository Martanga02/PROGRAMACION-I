/*5. Casa de empanadas
Los pedidos que recibe una casa de empanadas se almacenan en un arreglo E de tamaño MAXE. Cada tipo de empanada se almacena con un número 
diferente, por ejemplo, el 5 representa la empanada de carne cortada a cuchillo mientras que el 7 representa la empanada de roquefort. 
Cada pedido está separado por uno o más números negativos (ya que los códigos son todos valores positivos incluyendo el 0). Para facilitar
el proceso de producción los códigos de las empanadas están almacenadas en forma ascendente. En el siguiente ejemplo, tenemos 3 pedidos. 
El primero incluye 2 empanadas de carne cortada a cuchillo (5) y 2 de roquefort (7).
|-1| 5| 5| 7| 7| -6| 4| 9| 10| -4| 1| 1| 2| 7| -9| -8|
Si un cliente se olvida de alguna empanada, puede agregarla luego de realizado el pedido. Para ellos debe indicar el número de pedido 
(es el orden del pedido dentro del arreglo) y el gusto de la empanada que quiere agregar. Se pide implementar un programa en Java que 
permita incorporar la empanada faltante al pedido del cliente. Siguiendo con el ejemplo, si el cliente quiere agregar una empanada de 
roquefort en el pedido 2. El arreglo resultante debería ser: |-1| 5| 5| 7| 7| -6| 4| 7| 9| 10| -4| 1| 1| 2| 7| -9| */
public class ejercicio5 {
    public static final int MAX=16;
    public static void main (String[]args){
        int[]arr={-1 ,5, 5, 7, 7, -6, 4, 9, 10, -4, 1, 1, 2 ,7 ,-9, -8};
        ImprimirArreglo(arr);
        ProcesarSecuencias(arr);
        ImprimirArreglo(arr);

    }
    
    public static void ProcesarSecuencias(int[] arr) {
        int inicio = 0, fin = -1;
        int numero_pedido = 0, empanada = 0, numero_secuencia = 0;

        System.out.println("Ingrese un numero de pedido (1,2,3..):");
        numero_pedido = SolicitarNumero();
        System.out.println("Ingrese un numero de empanada (5 carne, 7 roquefort..):");
        empanada = SolicitarNumero();

        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                numero_secuencia++;
                if (numero_secuencia == numero_pedido) {
                    InsertarOrdenado(arr, inicio, fin, empanada);
                }
            }
        }
    }

    public static void InsertarOrdenado(int[] arr, int inicio, int fin, int empanada) {
        int pos = inicio;
        boolean insertado = false;
        while (pos <= fin && !insertado) {
            if (arr[pos] > empanada) {
                CorrimientoDerecha(arr, pos);
                arr[pos] = empanada;
                insertado = true;
            }
            pos++;
        }
        if (!insertado && fin + 1 < MAX) {
            CorrimientoDerecha(arr, fin + 1);
            arr[fin + 1] = empanada;
        }
    }

    public static void CorrimientoDerecha(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }
    public static int SolicitarNumero(){
        int numero=0;
        numero=Utils.leerInt();
        return numero;
    }

    public static int BuscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] < 0) {
            pos++;
        }
        return pos;
    }
    public static int BuscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] >= 0) {
            pos++;
        }
        return pos - 1;
    }
    
    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
    

}
