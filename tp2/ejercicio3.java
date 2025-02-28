/*Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3 {
    public static void main (String[]args){
        int numero=0;
         try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero mayor a 50: ");
            numero=Integer.valueOf(entrada.readLine());
            if(numero%2==0 && numero%3==0){
                System.out.println(numero);
            }
            else{
                System.out.println("El numero no cumple con las condiciones");
            }
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}
