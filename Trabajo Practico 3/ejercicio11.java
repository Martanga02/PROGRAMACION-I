/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total).
*/
public class ejercicio11{
    public static void main (String[]args){
        for(int i=0;i<20;i++){
            System.out.println("Ingrese dos numeros:");
            int num1=Utils.leerInt();
            int num2=Utils.leerInt();
            Calculo(num1,num2);
        }

    }
    public static void Calculo(int num1,int num2){
       if(num1 > num2){
        System.out.println("El numero" + num1 + " es mas grande que el " + num2);
       }

    }
}