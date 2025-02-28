/*Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2024 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio19{
    public static void main (String[]args){
        int mes=0;
        int anio=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero de mes(del 1 al 12)");
            mes = Integer.valueOf(entrada.readLine());
            if(mes>=1 && mes<=12){
                switch (mes) {
                    case 1,3,5,7,8,10,12:
                    System.out.println("El mes tiene 31 dias");
                        break;
                    case 4,6,9,11:
                    System.out.println("El mes tiene 30 dias");
                    break;
                    case 2:
                    System.out.println("Ingrese un numero de año entre 2000 y 2024");
                    anio = Integer.valueOf(entrada.readLine());
                    if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                        System.out.println("Año bisiesto,28 dias");
                    }
                    else{
                        System.out.println("29 dias");
                    }
                    break;
                }
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}