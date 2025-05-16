/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor
que 10.
 */
public class ejercicio11 {
    public static void main (String[]args){
        int numero=0;
        System.out.println("Ingrese un numero");
        numero=Utils.leerInt();
        boolean resultado=true;
        boolean resultado2=true;
        boolean resultado3=true;
        resultado = (numero%6==0 && numero%7==0);
        resultado2= (numero>30 && numero%2==0);
        resultado3= ((numero/5)>10);
        System.out.println("El numero es múltiplo de 6 y de 7? " + resultado);
        System.out.println("El numero es mayor a 30 y múltiplo de 2, o es menor igual a 30? " + resultado2);
        System.out.println("el cociente de la división de dicho número por 5 es mayorque 10? " + resultado3);

    }
}
