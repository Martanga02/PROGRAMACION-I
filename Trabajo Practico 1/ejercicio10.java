/*Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima:
a. si el primero es mayor al segundo.
b. si ambos son múltiplos de 2.
 */
public class ejercicio10 {
    public static void main (String[]args){
        int num1=0;
        int num2=0;
        System.out.println("Ingrese dos numeros: ");
        num1=Utils.leerInt();
        num2=Utils.leerInt();
        boolean resultado=true;
        resultado = num1>num2;
        System.out.println("El numero 1 es mayor que el numero 2? " + resultado);
    }
}
