/*Escribir un programa que solicite nombre, edad, altura y ocupación,
los imprima por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5 {
    public static void main (String[]args){
        String nombre;
        int edad;
        double altura;
        String ocupacion;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su Nombre");
            nombre=entrada.readLine();
            System.out.println("Ingrese su edad");
            edad=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su altura");
            altura=Double.valueOf(entrada.readLine());
            System.out.println("Ingresesu ocupacion ");
            ocupacion=entrada.readLine();
            System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura + " Ocupacion: " + ocupacion);
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
