/*Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima:
a. si el primero es mayor al segundo.
b. si ambos son múltiplos de 2. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_c {
    public static void main (String[]args){
        int numero=0;
        int numero2=0;
        boolean resultado=false;
        boolean resultado2=false;
         try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            numero=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero entero");
            numero2=Integer.valueOf(entrada.readLine());

            resultado=(numero>numero2);
            resultado2=((numero  %2 ==0) && (numero2 % 2 ==0));
           System.out.println("El primer numero es mayor al segundo?: " + resultado);
           System.out.println("Los dos numeros son multiplo de 2?: " + resultado2);

        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
// Paso        Variable numero| Variable numero2|  Variable resultado| Variable resultado2
// Inicio             0                  0                false                false      
// Iteracion 1        n                  n                  n                    n    