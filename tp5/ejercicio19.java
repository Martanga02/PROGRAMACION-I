/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número). */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio19 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,2,6,7,8,9,10};
        int numero=ObtenerNumero();
        System.out.println("Arreglo original: "); ImprimirArreglo(arr);
        while(EsIgual(arr, numero)){
            CorrimientoIzquierda(arr, numero);
        }
        System.out.println("Arreglo modificado: "); ImprimirArreglo(arr);
    }

    public static boolean EsIgual(int[]arr,int num){
        for(int i=0;i<MAX;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

    public static void CorrimientoIzquierda(int[] arr, int num) {
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == num) {
                for (int j = i; j < MAX - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[MAX - 1] = 0; // Rellenar con 0 o cualquier valor por defecto
                break; // Salir después de un corrimiento para volver a verificar
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
