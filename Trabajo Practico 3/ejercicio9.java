/*Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres.
 */
public class ejercicio9 {
    public static void main (String[]args){
        int num1=SolicitarNumero();
        if(num1>=1 && num1<=10){
            char caracter=SolicitarCarcater();
            Verificar(caracter);
        }
    }
    public static void Verificar(char caracter){
        if(caracter>='a'&& caracter<='z'){
            System.out.println("Letra minuscula");
        }
        else if(caracter>='A'&& caracter<='Z'){
            System.out.println("Letra mayuscula");
        }
        else if(caracter>='0'&& caracter<='9'){
            System.out.println("digito");
        }
        else
            System.out.println("otro");
    }

    public static int SolicitarNumero(){
        int num=0;
        System.out.println("Ingrese un numero entre 1 y 10");
        num=Utils.leerInt();
        return num;
    }

    public static char SolicitarCarcater(){
        char caracter='a';
        System.out.println("Ingrese una letra del abecedario");
        caracter=Utils.leerChar();
        return caracter;
    }
}
