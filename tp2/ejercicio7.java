/*Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main (String[]args){
        char caracter=0;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            if(caracter!='*'){
                if(caracter>='1' && caracter<='9'){
                    System.out.println("el caracter ingresado es caracter digito: " + caracter);
                }
                else if (caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                    System.out.println("el caracter ingresado es caracter vocal minuscula: " + caracter);
                }
                else{
                    System.out.println("es otro caracter, o es consonante");
                }
            }
            else{
                System.out.println("termino");
            }
            while(caracter!='*');
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}
