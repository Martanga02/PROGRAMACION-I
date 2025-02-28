/*Pedir por consola un número entero e informar si es un número
primo. Un número es primo si solo es divisible por 1 y por sí
mismo. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio21 {
    public static void main(String[]args){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero: ");
            numero= Integer.valueOf(entrada.readLine());
            for (int i = 2; i * i <= numero; i++) { // Iteramos hasta la raíz cuadrada del número
                if (numero % i == 0 ) {
                    // Si es divisible por otro número, no es primo
                    System.out.println("No es un numero primo");
                }
                else{
                    System.out.println("Es un numero primo");
                }
            }
        }   
        catch (Exception exc) {
                System.out.println(exc);
        } 
    }
}

