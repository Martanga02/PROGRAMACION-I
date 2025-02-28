/*Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7{
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,3,8,9,10};
        int N = ObtenerNum();
        Generar_arreglo(arr, N);

        int M = ObtenerNum();
        ModificarArregloOriginal(arr, M);
    }
    public static int ObtenerNum(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader( new InputStreamReader(System.in));
            System.out.println(" Ingrese un numero");
            numero=Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
           System.out.println(exc);
        }
        return numero;
    }
    public static void Generar_arreglo(int[] arr, int N) {
        int[] irr = new int[MAX];
        int contador = 0; // Para llevar la cuenta de las posiciones encontradas
    
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == N) {
                irr[contador] = i; // Guarda el índice donde se encuentra N
                contador++;
            }
        }
    
        if (contador == 0) {
            System.out.println("El número " + N + " no se encontró en el arreglo.");
        } else {
            System.out.println("El número " + N + " se encontró en las posiciones:");
            for (int i = 0; i < contador; i++) {
                System.out.print("|" + irr[i] + "|");
            }
        }
    }

    public static void ModificarArregloOriginal(int[]arr, int M){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + (arr[i]=arr[i]*M) + "|");
        }
    }
    
}