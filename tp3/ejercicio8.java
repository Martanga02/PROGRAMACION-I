/*Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8 {
    public static void main (String[]args){
        
        int numero=ObtenerNumero();
        int numero2=ObtenerNumero();
        char caracter='e';
        while(caracter!='a'&&caracter!='b'&&caracter!='c'&&caracter!='d'){
            caracter= ObtenerCaracter();
            switch (caracter) {
                case 'a':
                System.out.println(numero + numero2);
                    break;
                case 'b':
                System.out.println(numero - numero2);
                    break;
                case 'c':
                System.out.println(numero * numero2);
                    break;
                case 'd':
                System.out.println(numero / numero2);
                    break;
                default:
                System.out.println("La letra ingresada no es correcta, vuelva a ingresar.");
                    break;
            }
        }
    }
    public static char ObtenerCaracter(){
        char caracter='a';
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter, 'a', 'b', 'c', 'd' ");
            caracter=(char)(entrada.readLine().charAt(0));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
