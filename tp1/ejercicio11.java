/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor
que 10. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {
    public static void main (String[]args){
        int numero=0;
        boolean resultado=false;
        boolean resultado2=false;
        boolean resultado3=false;
           try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            numero=Integer.valueOf(entrada.readLine());
            resultado=((numero%6==0) && (numero%7==0));
            resultado2=((numero>30 && numero%2==0) || (numero <=30));
            resultado3=((numero/5)>10);
            System.out.println("El numero es multiplo de 6 y 7?: " + resultado);
            System.out.println("El numero es mayor a 30 y multiplo de 2 o menor igual a 30?:" + resultado2);
            System.out.println("El cociente de la division de dicho numero por 5 es mayor que 10?:" + resultado3);

        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
