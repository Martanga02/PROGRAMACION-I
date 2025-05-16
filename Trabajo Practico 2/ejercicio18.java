/*Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división?
 */
public class ejercicio18 {
    public static void main (String[]args){
        int numero=0;
        int num1,num2=0;
        double división=0;
        System.out.println("Ingrese un numero mayor a 0");
        numero=Utils.leerInt();
        while(numero>0){
            System.out.println("Ingrese dos numeros");
            num1=Utils.leerInt();
            num2=Utils.leerInt();
            división=num1/num2;
            System.out.println("La division es: "+ división);

        }
    }
}
