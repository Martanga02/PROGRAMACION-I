/*Escribir un programa que mientras el usuario ingresa un
número de mes (entero) entre 1 y 12 inclusive, muestre por
pantalla la cantidad de días del mes ingresado (suponer febrero
de 28 días) (Mostrar por pantalla la cantidad de días del mes
debería realizarse con un método).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio16 {
    public static void main (String[]args){
        int numero=ObtenerNumero();
        if(numero>=1 && numero<=12){
            Meses(numero);
        }
    }
    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero del 1 al 12(mes)");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static void Meses(int numero){
        switch (numero) {
            case 1,3,5,7,8,10,12:
            System.out.println("31 dias");
                break;
            case 2:
            System.out.println("28 dias");
                break;
            case 4,6,9,11:
            System.out.println("30 dias");
            default:
                break;
        }
    }
}
