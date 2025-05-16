/*Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número.
 */
public class ejercicio13 {
    public static void main (String[]args){
        char caracter;
        int numero=0;
        System.out.println("Ingrese un caracter letra minuscula");
        caracter=Utils.leerChar();
        while(caracter>='a' && caracter<= 'z'){
            System.out.println("Ingrese un numero entero");
            numero=Utils.leerInt();
            if(numero>=1 && numero<=5){
                for(int i=1;i<=10;i++){
                    System.out.println(numero + " * " + i + " = " + (numero*i));
                }
            }
        }
    }
}
