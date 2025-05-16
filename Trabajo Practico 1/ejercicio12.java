/*Escribir un programa que permita ingresar dos números enteros,
incremente el primero y decremente el segundo, para luego
mostrar por pantalla en ambos casos, el valor original y el
modificado. */
public class ejercicio12 {
    public static void main (String[]args){
        int num1=0;
        int num2=0;
        System.out.println("Ingrese dos numeros: ");
        num1=Utils.leerInt();
        num2=Utils.leerInt();
        System.out.println("El numero 1 es " + num1);
        System.out.println("El numero 2 es " + num2);
        num1++;
        num2--;
        System.out.println("El numero 1 incrementado es " + num1);
        System.out.println("El numero 2 decrementado es " + num2);
    }
}
