/*. Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
 */
public class ejercicio7 {
    public static void main (String[]args){
        int num1,num2,num3=0;
        System.out.println("Ingrese un numero: ");
        num1=Utils.leerInt();
        num2=Utils.leerInt();
        num3=Utils.leerInt();
        System.out.println("El resultado de dividir el primero por el segundo y al resultado obtenido le reste el tercero es: " + ((num1/num2)-num3));
    }
}
