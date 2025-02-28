/* Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6 {
    public static void main (String[]args){
        char caracter='a';
        ObtenerCarcter(caracter);
        if(caracter>='a' && caracter<='z'){
            System.out.println("La tabla de multiplicar del 9 es: "); ImprimirTabla();
        }

    }
    public static char ObtenerCarcter(char caracter){
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter letra minuscula: ");
            caracter=  (char)(entrada.readLine().charAt(0));
            if(caracter>='a' && caracter<='z'){
                return caracter;
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }

    public static void ImprimirTabla(){
        for(int i =0;i<=10;i++){
            System.out.println(" 9 * " + i + " = " + (i*9));
        }
    }
}
