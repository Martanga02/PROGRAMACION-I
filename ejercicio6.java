/*. Productos de regalo
Un reconocido supermercado de venta online ha decidido regalar productos a modo de promoción
en todos sus pedidos. Cada producto está identificado con un valor numérico mayor a 0. 
Los pedidos recibidos se almacenan en un arreglo P de tamaño MAXP que comienza y finaliza 
con uno o más 0. Cada pedido está compuesto por una serie de productos y separados entre sí 
también por uno o más 0. Dentro de cada pedido, los productos están ordenados de forma 
ascendente.A modo de ejemplo, en el siguiente arreglo P, el primer pedido está compuesto
por los productos 9, 12 y 18. En total hay 4 pedidos. 
|0 |0 |9 |12| 18| 0| 1| 5| 43| 73| 88| 0| 8| 9| 52| 0| 1| 10| 90| 0| 0| 0| 0| 0| 0| 0| 0| 0|
Se pide realizar un programa en Java que permita incorporar a cada pedido los productos 
promocionados que están almacenados en un arreglo R de tamaño MAXR. La incorporación de los
productos se deberá realizar respetando el orden ascendente de los productos de cada pedido.
Se pide además informar la cantidad de productos regalados en total.
Continuando con el ejemplo, dado un arreglo R = {44, 6} con MAXR = 2 el arreglo resultante será:
0| 0| 6| 9| 12| 18| 44| 0| 1| 5| 6| 43| 44| 73| 88| 0| 6| 8| 9| 44| 52| 0| 1| 6| 10| 44| 90| 0
En el ejemplo, la cantidad total de productos regalados fue 8. */
public class ejercicio6 {
    public static final int MAX = 28, SEPARADOR = 0, MAXR = 2;

    public static void main(String[] args) {
        int[] arr = {0, 0, 9, 12, 18, 0, 1, 5, 43, 73, 88, 0, 8, 9, 52, 0, 1, 10, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] R = {44, 6};
        ImprimirArreglo(arr);
        ProcesarSecuencias(arr, R);
        ImprimirArreglo(arr);
    }

    public static void ProcesarSecuencias(int[] arr, int[] R) {
        int inicio = 0, fin = -1, total_regalados = 0;
        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                for (int i = 0; i < MAXR; i++) {
                    int posInsercion = BuscarPosInsercion(arr, inicio, fin, R[i]);
                    if (posInsercion != -1) {
                        CorrimientoDerecha(arr, posInsercion);
                        arr[posInsercion] = R[i];
                        fin++; // actualizamos el fin de la secuencia
                        total_regalados++;
                    }
                }
            }
        }
        System.out.println("Total de productos regalados: " + total_regalados);
    }

    public static int BuscarPosInsercion(int[] arr, int inicio, int fin, int valor) {
        int i = inicio;
        while (i <= fin && arr[i] < valor) {
            i++;
        }
        if (fin + 1 < MAX && arr[MAX - 1] == SEPARADOR) {
            return i;
        }
        return -1;
    }

    public static void CorrimientoDerecha(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static int BuscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void ImprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
