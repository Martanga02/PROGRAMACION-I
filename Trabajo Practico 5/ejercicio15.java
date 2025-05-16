/*Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición */
public class ejercicio15 {
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int posicion=ObtenerPosicion();
        CorrimientoDerecha(arr, posicion);
        ImprimirArreglo(arr);
    }
    public static int ObtenerPosicion(){
        System.out.println("Ingrese una posicion");
        int num=Utils.leerInt();
        return num;
    }
    public static void CorrimientoDerecha(int[]arr,int posicion){
        int i = MAX-1;
        while(i >= posicion){
            arr[i]=arr[i-1];
            i--;
        }
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
