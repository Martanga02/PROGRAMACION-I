/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    public static void main (String[]args){
        int numero=1;
        int num=0;
        try { while(numero>=1 && numero<=10){
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 1 y 10: ");
            numero = Integer.valueOf(entrada.readLine());
            if(numero>=1 && numero<=10){
                num+=numero;
                System.out.println("La suma es: " + num);
            }
            }
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}
