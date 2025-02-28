/*Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main (String[]args){
        char caracter=0;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            if(caracter!='*'){
                if(caracter>='1' && caracter<='9'){
                    System.out.println("el caracter ingresado es caracter digito: " + caracter);
                }
                else if (caracter>='a' && caracter<='z'){
                    System.out.println("Caracter letra minuscula");
                    switch (caracter) {
                        case 'a','e','i','o','u':
                        System.out.println("caracter vocal");
                            break;
                    
                        default: System.out.println("caracter consonante");
                            break;
                    }
                }
                else{
                    System.out.println("es otro caracter, o es consonante");
                }
            }
            else{
                System.out.println("termino");
            }
            while(caracter!='*');
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}

