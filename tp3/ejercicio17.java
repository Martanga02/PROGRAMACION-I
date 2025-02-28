/*Escribir un programa que mientras que el usuario ingrese un
carácter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio17 {
    public static void main (String[]args){
        char caracter=ObtenerCaracter();
        if(caracter>='a' && caracter<='z'){
            int numero=ObtenerNumero();
            if(numero>=1 && numero<=5){
                Tabla(numero);
            }
        }
    }
    public static void Tabla(int numero){
        for(int i=1;i<=10;i++){
            System.out.println("La tabla de multiplicar del numero: " + numero + " es " + i*numero);
        }
    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static char ObtenerCaracter(){
        char caracter='a';
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter ");
            caracter=(char)(entrada.readLine().charAt(0));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }
}
