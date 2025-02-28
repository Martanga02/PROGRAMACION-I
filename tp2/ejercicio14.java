/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio14 {
    public static void main (String[]args){
        int numero=0;
        final int MAX=10;
        int contador=0;
        try { 
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<=MAX;i++){
                System.out.println("Ingrese un numero : ");
                numero = Integer.valueOf(entrada.readLine());
                if(numero%2==0){
                    contador++;
                }
            }
            System.out.println("la cantidad de numeros pares ingresados fue: " + contador);

        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}
