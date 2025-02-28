/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio16{
    public static void main (String[]args){
        char caracter='a';
        int contador=0;
        final int MAX =15;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<=MAX;i++){
                System.out.println("Ingrese una letra: ");
                caracter= entrada.readLine().charAt(0);
                if(caracter=='a'){
                    contador++;
                }
            }
            System.out.println("se ingresaron en total :" + contador + " letras 'a'" );
            
        } catch (Exception exc) {
            System.out.println(exc);
    }
}
}