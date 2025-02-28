/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_e {
    public static void main(String[]args){
        int numero=1;
        int acumulador=0;
        int contador=0;
        try {
            while(numero!=0){
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            numero= Integer.valueOf(entrada.readLine());
            contador++;
            acumulador+=numero;
            }
            System.out.println("se ingresaron en total :" + contador + "numeros, y el promedio de los numeros ingresados es: " + (acumulador/contador));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
//ejemplo con valores ilustrativos
// Paso        Variable numero| Variable acumulador|  Variable contador|
// Inicio             1                  0                   0               
// Iteracion 1        9                  9                   1    
// Iteracion 2        2                  19                  3         
// Iteracion 3        8                  25                  4  
// Valor final        8                  25                  4             