/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio15 {
    public static void main(String[]args){
        int numero=1;
        int acumulador=0;
        int contador=0;
        try {
            while(numero!=0){
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            numero= Integer.valueOf(entrada.readLine());
            contador++;
            acumulador+=numero;
            }
            System.out.println("se ingresaron en total :" + contador + "numeros, y el promedio de los numeros ingresados es: " + (acumulador/contador));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
