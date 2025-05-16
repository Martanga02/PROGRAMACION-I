/*Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
 */
public class ejercicio4 {
    public static void main (String[]args){
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int numero4=0;
        int numero5=0;
        System.out.println("Ingrese un numero");
        numero1=Utils.leerInt();
        numero2=Utils.leerInt();
        numero3=Utils.leerInt();
        numero4=Utils.leerInt();
        numero5=Utils.leerInt();
        System.out.println("Los numero en orden inverso son: " + numero5 + " " + numero4 + " "+ numero3 + " " + numero2 + " " + numero1);
    }
}
