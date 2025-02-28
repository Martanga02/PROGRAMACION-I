/*Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio13 {
    public static void main (String[]args){
       Calculos();
    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static void Calculos(){
        System.out.println("Ingrese un numero del 1 al 4"); int numero= ObtenerNumero();
        System.out.println("Ingrese un numero"); int numero1= ObtenerNumero();
        System.out.println("Ingrese un numero"); int numero2= ObtenerNumero();
        System.out.println("Ingrese un numero"); int numero3= ObtenerNumero();
        int resultado=0;
        if(numero==1){
            System.out.println("La raiz cuadra de " + numero1+  " - " + numero3 + " es: " + Math.sqrt(numero1 - numero3));
        }
        else if(numero==2){
            resultado= ((numero1 + numero2 + numero3)/3);
            System.out.println("El promedio de los numeros: " + numero1 + " + " + numero2 + " + " + numero3 + " es: " + resultado);
        }
        else if(numero==3){
            System.out.println("El cociente de la raiz cuadra de " + numero3+  " - " + numero2 + " dividida por : " + numero1 + " es : " + ((Math.sqrt(numero3 - numero2))/numero1));
        }
        else if(numero==4){
            System.out.println("El cociente del promedio de los tres valores dividido la raiz cuadra de  " + numero2 + " es de: " + resultado/Math.sqrt(numero2 ));
        }
    }
}
