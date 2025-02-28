/*Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el carácter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el carácter es una letra del
abecedario en mayúscula;
iii. “dígito” si el carácter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    public static void main (String[]args){
        int numero=1;
        if(numero%3==0){
            char caracter=ObtenerCracter();
        
            numero=ObtenerNumero();
            desarrollo(numero);
        }
        else if(numero%5==0){
            for(int i=1;i<=10;i++){
                System.out.println("La tabla de multiplicar del 5 es: " + (i*5));
            }
        }
        else{
            System.out.println("El numero ingresado no es multiplo de 3 ni de 5");
        }

    }
    public static void desarrollo(char caracter,int numero){
        
            if(caracter>='a' && caracter<='z'){
                System.out.println("letra minuscula");
            }
            else if (caracter>='A' && caracter<='Z'){
                System.out.println("letra mayuscula");
            }
            if(caracter>='0' && caracter<='9'){
                System.out.println("digito");
            }
            else{
                System.out.println("otro");
            }
    }

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 1 y 10");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static char ObtenerCracter(){
        char caracter=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter");
            caracter= (char)(entrada.readLine().charAt(0));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }
    
}
