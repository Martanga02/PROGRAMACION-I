/*Escribir un programa que permita ingresar 5 números de a uno p
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4 {
    public static void main(String[]args){
        int numero1,numero2,numero3,numero4,numero5;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            numero1=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un entero");
            numero2=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un entero");
            numero3=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un entero");
            numero4=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un entero");
            numero5=Integer.valueOf(entrada.readLine());
            System.out.println("Los numeros ingresados en orden inverso son: " + numero5 + numero4 + numero3 + numero2 + numero1);
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
}
}
