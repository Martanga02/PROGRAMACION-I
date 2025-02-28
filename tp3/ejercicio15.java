/*Escribir un programa que mientras que el usuario ingrese un
número entero natural, llame a un método que calcule la
sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
1+2+3+4+5=15) y retorne el resultado */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio15 {
    public static void main (String[]args){
        int numero=ObtenerNumero();
        if(numero>=0){
            Calcular(numero);
        }
    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static void Calcular( int numero){
        int suma=0;
        for(int i=1;i<=numero;i++){
            suma +=i;
        }
        System.out.println("El resultado de la sumatoria es: " + suma);
    }
}
