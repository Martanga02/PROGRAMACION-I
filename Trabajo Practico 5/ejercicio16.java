/*Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.
 */
public class ejercicio16 {
    public static final int MAX=10;
    public static void main (String[]args){
       char[]arr={'a','b','c','d','e','f','g','h','i','j'};
       int posicion=ObtenerPosicion();
       CorrimientoIzquierda(arr, posicion);
       ImprimirArreglo(arr);

    }
    public static int ObtenerPosicion(){
        System.out.println("Ingrese una posicion");
        int num=Utils.leerInt();
        return num;
    }
    public static void CorrimientoIzquierda(char[]arr,int posicion){
        while(posicion < MAX-1){
            arr[posicion]=arr[posicion+1];
            posicion ++;
        }
    }
    public static void ImprimirArreglo(char[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
