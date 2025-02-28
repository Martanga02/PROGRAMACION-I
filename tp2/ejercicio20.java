/*Pedir números enteros positivos por teclado. En cada iteración
el usuario puede ingresar 0 para salir del programa. Si ingresa un
número distinto de 0 se debe pedir el ingreso de un carácter.
a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.
b. Si es ‘b’ se deben pedir 5 números positivos e informar si
fueron ingresados en orden ascendente.
c. Si es ‘c’ se deben pedir dos números enteros negativos e
imprimir la raíz cuadrada de su multiplicación. La raíz
cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).
d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio20 {
    public static void main (String[]args){
        int numero=1;
        char caracter='a';
        String texto= "a";
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            while(numero!=0){
                System.out.println("Ingrese numeros");
                numero= Integer.valueOf(entrada.readLine());
                if(numero==0){
                    System.out.println("Ingrese un caracter 'a', 'b', 'c'");
                    caracter=entrada.readLine().charAt(0);
                    while (caracter != 'a' && caracter != 'b' && caracter != 'c') {
                        System.out.println("Carácter incorrecto, intente nuevamente:");
                        caracter = entrada.readLine().charAt(0);
                    }
                    switch (caracter) {
                        case 'a':
                            System.out.println("Ingrese un texto cualquiera: ");
                            texto = entrada.readLine();
                            System.out.println(texto);
                        break;
                        case 'b':
                            System.out.println("Ingrese 5 numeros positivos");
                            int num1=Integer.valueOf(entrada.readLine());
                            int num2=Integer.valueOf(entrada.readLine());
                            int num3=Integer.valueOf(entrada.readLine());
                            int num4=Integer.valueOf(entrada.readLine());
                            int num5=Integer.valueOf(entrada.readLine());
                            if(num1<num2 && num2<num3 && num3<num4 && num4<num5){
                                System.out.println("Los numeros fueron ingresados en orden ascendente");
                            }
                            else{
                                System.out.println("Los numeros no fueron ingresados en orden ascendente");
                            }
                        break;
                        case 'c':
                            System.out.println("Ingrese dos numeros negativos");
                            int numerazo=Integer.valueOf(entrada.readLine());
                            int numerazo2=Integer.valueOf(entrada.readLine());
                            int multiplicación=(numerazo*numerazo2);
                            double raiz = (Math.sqrt(multiplicación));
                            System.out.println("El resultado de la raiz cuadrada de la multiplicacion entre " + numerazo + " y " + numerazo2 + " es igual a : " + raiz);
                        break;  
                    }
                }
            }
            
           

            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
