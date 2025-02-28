/*Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main (String[]args){
       int numero=1;
        while(numero>=1 && numero<=10){
            numero= ObtenerNumero();
            char caracter= ObtenerCaracter();
            Impresiones(caracter);
        }
        
    }
    public static void Impresiones(char caracter){
        if(caracter>='a' && caracter<='z'){
            System.out.println("Letra minuscula");
        }
        else if(caracter>='A' && caracter<='Z'){
            System.out.println("Letra mayusucla");
        }
        else if(caracter>='0' && caracter<='9'){
            System.out.println("Caracter digito");
        }
        else{
            System.out.println("Otro");
        }

    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader((System.in)));
            System.out.println("Ingrese un numero entre 1 y 10: ");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static char ObtenerCaracter(){
        char caracter=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader((System.in)));
            System.out.println("Ingrese un caracter: ");
            caracter= (char)(entrada.readLine().charAt(0));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }
}
