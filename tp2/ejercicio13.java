/*Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio13 {
    public static void main(String[]args){
        int numero=0;
        int tabla=0;
        final int MAX=10;
        try { 
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 1 y 10: ");
            numero = Integer.valueOf(entrada.readLine());
            if(numero>=1 && numero<=5){
                for(int i=1;i<=MAX;i++){
                    tabla=i*numero;
                    System.out.println("La tabla de multiplicar del numero " + numero + " es: " + i + " * " + numero + " = " + tabla);
                }
            }
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
        }
}
