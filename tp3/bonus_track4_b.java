/*Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es.
MODULARIZAR */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track4_b {
    public static void main (String[]args){
        int numero=ObtenerNumero();
        Digitos(numero);

    }
    public static int ObtenerNumero(){
        int numero=0;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 0 y 999: ");
            numero=Integer.valueOf(entrada.readLine());
            
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
            return numero;
    }
    public static void Digitos(int numero){
        if(numero>=0 && numero<=9){
            System.out.println("numero de un digito");
        }
        else if(numero>=10 && numero<=99){
            System.out.println("numero de dos digitos");
        }
        else if (numero>=99 && numero<=999 ){
            System.out.println("numero de tres cifras");
        }
        else{
            System.out.println("el numero supera el rango o es negativo");
        }
    }
    
}