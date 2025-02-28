/*Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main(String[]args){
        int numero=0;
        Ingresarnumero(numero);

    }
    public static void Ingresarnumero (int numero){
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero distinto de cero: ");
            numero=Integer.valueOf(entrada.readLine());
           if(numero!=0){
                Sumatoria();
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void Sumatoria(){
        int suma=0;
        for(int i=1;i<=200;i++){
            suma +=i;
        }
        System.out.println("El resultado de la sumatoria es: " + suma);
    }
}
