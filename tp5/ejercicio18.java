/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición). */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio18 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int numero=ObtenerNumero();
        System.out.println("Arreglo original: "); ImprimirArreglo(arr);
        CorrimientoIzquierda(arr, numero);
        System.out.println("Arreglo modificado: "); ImprimirArreglo(arr);
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
