/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado. */
public class ejercicio3 {
    final static int MAX=10;
    public static void main (String[]args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        double promedio= CalcularPromedio(arr);
        ImprimirArr(arr);
        System.out.println("El promedio es: " + promedio);
        int encima=EncimaPromedio(arr, promedio);
        System.out.println("En total " + encima + " elementos estan encima del promedio");
    }
    public static double CalcularPromedio(int[]arr){
        int acumulador=0;
        double promedio=0;
        for(int i=0;i<MAX;i++){
            acumulador+=arr[i];
        }
        promedio=acumulador/MAX;
        return promedio;
    }
    public static int EncimaPromedio(int[]arr,double promedio){
        int encima=0;
        for(int i=0;i<MAX;i++){
            if(arr[i]>=promedio){
                encima++;
            }
        }
        return encima;
    }
    public static void ImprimirArr(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.println("|" + arr[i] + "|");
        }
    }
}
