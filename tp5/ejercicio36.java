/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y elimine la primera ocurrencia de
número (un número igual) en el arreglo (si existe). Informar si no
existe en el arreglo. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio36 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={2,4,1,8,5,7,9,10,2,5};
        System.out.println("Arreglo desordenado:");
        ImprimirArreglo(arr);

        // Ordenar el arreglo antes de la inserción
        OrdenarArreglo(arr);

        System.out.println("Arreglo ordenado:");
        ImprimirArreglo(arr);

        int numero = ObtenerNumero();

        // Insertar el número manteniendo el orden
        CorrimientoIzquierda(arr, numero);

        System.out.println("Arreglo modificado:");
        ImprimirArreglo(arr);
    }

    public static void OrdenarArreglo(int arr[]) {
        for (int i = 1; i < MAX; i++) {
            int aux = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > aux) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }
    }


    public static boolean EsIgual(int[]arr,int num){
        for(int i=0;i<MAX;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return true;
    }

    public static void CorrimientoIzquierda(int[]arr,int num){
        if(EsIgual(arr, num)){
            while (num-1 < MAX - 1) {
                arr[num-1] = arr[num-1 + 1];
                num++;
            }
        }
        
    }

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {

            System.out.println(exc);
        }
        return numero;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
