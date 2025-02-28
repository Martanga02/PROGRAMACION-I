/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main (String[]args){
        int numero=0;
        double division1=0;
        double division2=0;
        double division3=0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            numero=Integer.valueOf(entrada.readLine());
            division1=(numero/2);
            division2=(numero/3);
            division3=(numero/4);
            System.out.println("El resulrado de las divisiones es: " + " por 2: " + division1 + " por 3: " + division2 + " por 4: " + division3);

        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
        
        
    }
    
}
