/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola. */
public class ejercicio2 {
    final static int MAX=10;
    public static void main (String[]args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        double promedio= CalcularPromedio(arr);
        ImprimirArr(arr);
        System.out.println("El promedio es: " + promedio);
    }
    public static double CalcularPromedio(int[]arr){
        int acumulador=0;
        double promedio=acumulador/MAX;
        for(int i=0;i<MAX;i++){
            acumulador+=arr[i];
        }
        return promedio;
    }
    public static void ImprimirArr(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.println("|" + arr[i] + "|");
        }
    }
}
