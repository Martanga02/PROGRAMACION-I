/*Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {
    public static void main (String[]args){
        char caracter='a';
        char menor='a';
        char mayor ='a';
        try {
            while(caracter>='a' && caracter<='z'){
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra: ");
            caracter = entrada.readLine().charAt(0);
                if(caracter>='a' && caracter<='z'){
                    menor=caracter;
                    System.out.println("Ingrese una letra: ");
                    caracter = entrada.readLine().charAt(0);
                    if(caracter > menor){
                        mayor=caracter;
                    }
                    else if(caracter < menor){
                        mayor=menor;
                        menor=caracter;
                    }
                    System.out.println("el menor es: " + menor + " y el mayor es: " + mayor);
                }
            }
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}
