/* Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
 */
public class ejercicio2 {
    public static int MAX=10;
    public static void main (String[]args){
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.print("El promedio del arreglo : "); ImprimirArreglo(arr);
        double promedio= CalcularPromedio(arr);
        System.out.print(" es: " + promedio);
        
    }
    public static double CalcularPromedio(int[]arr){
        double aux=0;
        for(int i=0;i<MAX;i++){
            aux += arr[i];
        }
        return aux/MAX;
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
