/*Escribir un programa que mientras que el usuario ingrese un
carácter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número.
 */
public class ejercicio17 {
    public static void main (String[]args){
        char caracter=ObtenerCarcater();
        if(caracter>='a' && caracter<='z'){
            int numero=ObtenerNumero();
            if(numero>=1 && numero<=5){
                Tabla(numero);
            }
        }
       
    }
    public static void Tabla(int numero){
        for(int i=1;i<=10;i++){
            System.out.println("La tabla de multiplicar de " + numero + " es: " + i + " * " + numero + " = " + (i*numero));
        }
    }
    public static int ObtenerNumero(){
        int num=0;
        System.out.println("Ingrese un numero entre 1 y 5");
        num=Utils.leerInt();
        return num;
    }
    public static char ObtenerCarcater(){
        char caracter ='a';
        System.out.println("Ingrese un caracter");
        caracter=Utils.leerChar();
        return caracter;
    }
}
