/*Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año y,
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2 {
    public static void main (String[]args){
        int mes=0;
        int anio=0;

         try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un mes(del 1 al 12)");
            mes=Integer.valueOf(entrada.readLine());
            switch (mes) {
                case 1,3,5,6,8,10,12: System.out.println("31 dias");
                    break;
                case 4,7,9,11: System.out.println("30 dias");
                break;
                case 2 : System.out.println("Ingrese un año: ");
                anio=Integer.valueOf(entrada.readLine());
                if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                    System.out.println("Biciesto, 28 dias");
                }
                else{
                    System.out.println("29 dias");
                }
            }
            
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}
