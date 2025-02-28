/*Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6 {
    public static void main (String[]args){
        int numero=0;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 1  el 100: ");
            numero=Integer.valueOf(entrada.readLine());
            if(numero>=1 && numero<=100){
                if(numero%2==0 && numero %3==0){
                    System.out.println("El numero " + numero + " es multiplo de 2 y 3 simultaneamente");
                }
                else{
                    System.out.println("el numero no es multiplo de 2 y 3 simultaneamente");
                }
            }
            while(numero>=1 && numero<=100);
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}
