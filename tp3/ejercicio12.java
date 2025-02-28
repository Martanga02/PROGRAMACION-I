/*Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {
    public static void main (String[]args){
        int numero=ObtenerNumero();
        System.out.println("el numero que eligio el usuario es: " + numero);
        Lanzamiento(numero);
    }

    public static int Lanzamiento(int numero){
        int dado=0;
        int contador=0;
        for(int i=0;i<=1000;i++){
            dado = (int) (6*Math.random() + 1);
            System.out.println(i + " lanzamiento , salio el..." + dado );
            if(dado==numero){
                contador++;
            }
        }
        System.out.println("La cantidad de veces que el salio el numero "+ numero + " fueron " + contador);
        
        return dado;

    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 1 y 6 (valores de un dado de 6 caras)");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
