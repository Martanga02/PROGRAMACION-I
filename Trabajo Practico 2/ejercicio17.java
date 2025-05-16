/*Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive.
 */
public class ejercicio17{
    public static void main (String[]args){
        int numero=1;
        while(numero>=1 && numero<=10){
            System.out.println("Ingrese un numero");
            numero=Utils.leerInt();
            for(int i=numero;i>=0;i--){
                System.out.println("Cuenta regresiva: " + i);
            }
        }
    }
}