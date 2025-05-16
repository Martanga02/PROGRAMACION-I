/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
 */
public class ejercicio17 {
    public static final int MAX=10;
    public static void main (String[]args){
        char[]arr={'a','b','c','d','e','f','g','h','i','j'};
        char letra = ObtenerLetra();
        CorrimientoDerecha(arr,letra);
        ImprimirArreglo(arr);
    }
    public static void CorrimientoDerecha(char[]arr,char letra){
        int i = MAX-1;
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=letra;
    }

    public static char ObtenerLetra(){
        System.out.println("Ingrese una letra para insertar en el arreglo:");
        char letra=Utils.leerChar();
        return letra;
    }

    public static void ImprimirArreglo(char[]arr){
        for(int i = 0; i<MAX; i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
