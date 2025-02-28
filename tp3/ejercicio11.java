/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {
    public static void main (String[]args){
        calcular();
    }
    public static void calcular(){
        int numero=0;
        int aux=0;
        int aux2=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            for(int i=1;i<=20;i++){
                System.out.println("Ingrese un numero");
                numero= Integer.valueOf(entrada.readLine());
                if(numero>aux){
                    aux=numero;
                }
                if(numero<aux2){
                    aux2=numero;
                }
            }
           
            System.out.println("El numero mayor es: " + aux + " , y el menor es: " + aux2);
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
}
