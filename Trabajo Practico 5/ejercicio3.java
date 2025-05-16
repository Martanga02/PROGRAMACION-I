/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.
 */
public class ejercicio3 {
    public static int MAX=10;
    public static void main (String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print("El promedio del arreglo : "); ImprimirArreglo(arr);
        double promedio= CalcularPromedio(arr);
        System.out.println(" es: " + promedio);
        int encima = PorEncima(arr, promedio);
        System.out.println("la cantidad de elementos del mismo que están por encima del promedio calculado es: " + encima );
    }

    public static int PorEncima(int[]arr,double promedio){
        int contador=0;
        for(int i=0;i<MAX;i++){
            if(arr[i]>promedio){    
                contador++;
            }   
        }
        return contador;
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