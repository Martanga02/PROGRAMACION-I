/*Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8 {
    public static void main (String[]args){
        int numero=0;
        int num=0;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero distinto de cero: ");
            numero = Integer.valueOf(entrada.readLine());
            if(numero!=0){
                System.out.println("Ingrese un numero entero: ");
                num = Integer.valueOf(entrada.readLine());
                System.out.println("El numero ingresado es: " + num);
            }
            while(numero!=0);
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
