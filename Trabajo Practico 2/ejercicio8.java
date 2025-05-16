/*Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima.
 */
public class ejercicio8{
    public static void main (String[]args){
        int numero=0;
        System.out.println("Ingrese un numero disinto de 0");
        numero=Utils.leerInt();
        while(numero!=0){
            System.out.println("Ingrese otro numero: ");
            int num=Utils.leerInt();
            System.out.println("El numero es: " + num);
        }
    }
}