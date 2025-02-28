/*Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio14 {
    public static void main (String[]args){
        char caracter=ObtenerCarcter();
        if(caracter!='*'){
            Verificar(caracter);
        }
        else{
            System.out.println("Termino.");
        }
    }

    public static char ObtenerCarcter(){
        char caracter='a';
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter distinto a '*'' ");
            caracter=(char)(entrada.readLine().charAt(0));
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }
    public static void Verificar(char caracter){
        if(caracter>='0' && caracter<= '9'){
            System.out.println("Carcater digito");
        }
        else if(caracter>='a' && caracter <= 'z'){
            System.out.println("caracter letra minuscula");
        }
        else{
            System.out.println("Carcter letra mayuscula");
        }
    }

}
