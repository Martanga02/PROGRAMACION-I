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
multiplicar del número ingresado.
 */
public class ejercicio10 {
    public static void main (String[]args){
        int num=ObtenerNumero();
        char caracter='a';
        if(num>=1 && num <=10){
            if(num%3==0){
                System.out.println("Ingrese un caracter");
                caracter=Utils.leerChar();
                verificar(caracter);
            }
            else{
                System.out.println("No es multiplo");
            }
        }
    }
    public static void verificar(char caracter){
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
    public static int ObtenerNumero(){
        int num=0;
        System.out.println("Ingrese un numero");
        num=Utils.leerInt();
        return num;
    }
   
}
