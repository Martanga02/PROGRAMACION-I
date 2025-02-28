/*1. Escribir un programa completo (declaración de constantes y
variables, carga de datos, procesamiento e impresión de
resultados) para cada caso o ítem que:
a. solicite un número e indique si es positivo o negativo.
b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
c. solicite un número del 1 al 7 e imprima el día de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1 {
    public static void main (String[]args){
        int numero1=0;
        int numero2=0;
        char letra='a';
        int num1,num2,num3;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero:");
            numero1 = Integer.valueOf(entrada.readLine());
            if(numero1 < 0){
                System.out.println("El numero es negativo");
            }
            else{
                System.out.println("El numero es positivo");
            }
            System.out.println("Ingrese un numero del 1 al 7:");
            numero2 = Integer.valueOf(entrada.readLine());
            switch (numero2) {
                case 1: System.out.println("Lunes");
                    break;
                case 2: System.out.println("Martes");
                break;
                case 3: System.out.println("Miercoles");
                break;
                case 4: System.out.println("Jueves");
                break;
                case 5: System.out.println("Viernes");
                break;
                case 6 : System.out.println("Sabado");
                break;
                case 7: System.out.println("Domingo");
            }
            System.out.println("Ingrese una letra:");
            letra = entrada.readLine().charAt(0);
            switch (letra) {
                case 'a','e','i','o','u': System.out.println("Es una vocal");
                    break;
                default: System.out.println("Es una consonante");
                    break;
            }
            System.out.println("Ingrese tres numeros:");
            num1 = Integer.valueOf(entrada.readLine());
            num2 = Integer.valueOf(entrada.readLine());
            num3 = Integer.valueOf(entrada.readLine());
            if(num1>num2 && num2 > num3){
                System.out.println("Decreciente");
            }
            else{
                System.out.println("Creciente");
            }

        } catch (Exception exc) { // Se ejecuta si ocurre algún error de lectura
            System.out.println(exc);
        }
    }
}
