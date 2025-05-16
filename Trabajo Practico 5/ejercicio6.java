/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.
 */
public class ejercicio6 {
    public static int MAX=10;
    public static void main (String[]args){
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int pares=BuscarPares(arr);
        System.out.println("La cantidad de pares es: " + pares);
    }
    public static int BuscarPares(int[]arr){
        int contador=0;
        for(int i=0; i<MAX; i++){
            if(arr[i]%2==0){
                contador++;
            }
        }
        return contador;
    }
}
