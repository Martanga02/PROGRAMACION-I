/*Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200).
 */
public class ejercicio7 {
    public static void main (String[]args){
        int suma,numero=0;
        System.out.println("Ingrese un numero: ");
        numero=Utils.leerInt();
        if(numero!=0){
           suma= sumatoria();
           System.out.println("La suma total de la sumatoria de 0 a 200 es: " + suma);
        }
    }
    public static int sumatoria(){
        int suma=0;
        for(int i=0;i<=200;i++){
            suma+=i;
        }
        return suma;
    }
}
