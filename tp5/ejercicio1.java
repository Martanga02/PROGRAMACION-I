/*1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1{
    final static int MAX=15;
    public static void main (String[]args){
        int[] arr=new int[MAX];
        CargarArreglo(arr);
        ImprimirArr(arr);

    }
    public static void CargarArreglo(int[]arr){
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            for(int i =0;i<=MAX;i++){
                System.out.println("Ingrese numeros del 1 al 12");
                arr[i]=Integer.valueOf(entrada.readLine());
            }
    
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void ImprimirArr(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.println("|" + arr[i] +"|");
        }
    }
}