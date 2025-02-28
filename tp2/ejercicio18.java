/*Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio18 {
    public static void main(String[]args){
        int numero=1;
        int num1=0;
        int num2=0;
        double division=0;
         try {
            while(numero!=0){
                BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese un numero distinto de 0: ");
                numero= Integer.valueOf(entrada.readLine());
                if(numero!=0){
                    System.out.println("Ingrese dos numeros: ");
                    num1= Integer.valueOf(entrada.readLine());
                    num2= Integer.valueOf(entrada.readLine());
                    division=(num1/num2);
                    System.out.println("el resultado de la division es: " + division );
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
