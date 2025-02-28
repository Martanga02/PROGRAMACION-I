/*Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_f {
    public static void main(String[]args){
        int numero=0;
        try {
                BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese un numero del 1 al 10: ");
                numero= Integer.valueOf(entrada.readLine());
                if(numero>=1 && numero<=10){
                    for(int i=numero;i>=0;i--){
                        System.out.println("La cuenta regresiva es: " + i );
                     }
                }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
//ejemplo con valores ilustrativos
// Paso        Variable numero|
// Inicio             0                       
// Iteracion 1        2            
// Iteracion 2        1                 
// Iteracion 3        0          
// Valor final        0                 