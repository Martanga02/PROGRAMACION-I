/*7. Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7{
    public static void main (String[]args){
        int numero1=0;
        int numero2=0;
        int numero3=0;
        double resultado=0;
        double resultado2=0;
         try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero real");
            numero1=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero real");
            numero2=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero real");
            numero3=Integer.valueOf(entrada.readLine());

            //divido el primer numero por el segundo
            resultado=(numero1/numero2);
            //le resto a la division el numero 3
            resultado2=(resultado-numero3);

            System.out.println("el resultado de la division es: " + resultado + " y el de la resta es : " + resultado2);

        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
}