/*Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3 {
    public static void main (String[]args){
        final int numero=9;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            //numero=Integer.valueOf(entrada.readLine());
            System.out.println("El entero ingresado es:");
            }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
//No se puede asignar un nuevo valor a una constante.