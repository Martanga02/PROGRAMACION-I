/*Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {
    public static void main (String[]args){
        char caracter='a';
        char carac='0';
        try {
            while(caracter>='a' && caracter<='z'){
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra: ");
            caracter = entrada.readLine().charAt(0);
                if(caracter>='a' && caracter<='z'){
                    if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                        carac++;
                     System.out.println("La suma es: " + carac);
                    }
            }
            }
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
