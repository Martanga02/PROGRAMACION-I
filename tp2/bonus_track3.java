/*Implementar un juego de adivinación en el que la computadora
“piense” un número entre 0 y 99 (puede usar la siguiente
sentencia: int numeroSecreto = (int)(Math.random() * 1000) %
100;) y el usuario intente adivinarlo. El usuario deberá ingresar un
número por teclado y el juego deberá responder si acertó o no. En
caso de no acertar, el juego deberá indicar si el número ingresado
es menor o mayor al número secreto. Este proceso continuará
hasta que el usuario acierte. Al finalizar, el juego deberá informar
la cantidad de intentos que le llevó al jugador acertar el número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track3 {
    public static void main(String[]args){
        int numero=0;
        int contador=0;
        try {
            while(numero>=0 && numero<=99){
                BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("¡Juguemos a adivinar el numero!, ingresa un numero del 0 al 99..:" );
                numero= Integer.valueOf(entrada.readLine());
                    int numeroSecreto = (int)(Math.random() * 1000) %100;
                    if(numeroSecreto==numero){
                        System.out.println("Adivinaste!");
                    }
                    else if (numeroSecreto!=numero && numero>numeroSecreto){
                        System.out.println("Numero incorrecto, el numero que ingresaste es mayor");
                        contador++;
                    }
                    else if (numeroSecreto!=numero && numero<numeroSecreto){
                        System.out.println("Numero incorrecto, el numero que ingresaste es menor");
                        contador++;
                    }
            }
            System.out.println("El total de intentos fue: " + contador);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
