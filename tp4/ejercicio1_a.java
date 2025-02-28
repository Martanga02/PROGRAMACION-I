/*Seleccionar 3 ejercicios al azar de los resueltos de cada una de
las prácticas 1, 2 y 3 y realizar una prueba de escritorio para cada
uno. */
/*Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_a {
    public static void main (String[]args){
        final int numero=9; System.out.println("El numero vale 9");
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero"); System.out.println("Se ingresa un numero entero");
            //numero=Integer.valueOf(entrada.readLine());
            System.out.println("El entero ingresado es:");
            }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
            System.out.println("No se cambia el valor de la variable ya que es una constante, numero sigue valiendo " + numero);
    }
    
}
//Prueba de escritorio:  Paso        Variable numero
//                       Inicio             9
//                       Iteracion 1        9 -----> como es una constante no se incrementa ni cambia