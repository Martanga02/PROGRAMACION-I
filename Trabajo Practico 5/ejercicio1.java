/*Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
 */

public class ejercicio1{
    public static int MAX=15;
    public static void main (String[]args){
        int[]arr=new int [MAX];
        CargarArreglo(arr);
        ImprmirArreglo(arr);
    }
    public static void CargarArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.println("Ingrese un numero del 1 al 12");
            arr[i]=Utils.leerInt();
        }
    }
    public static void ImprmirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}