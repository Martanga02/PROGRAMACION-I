/*Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes).
 */
public class ejercicio6{
    public static void main (String[]args){
        int numero=0;
        System.out.println("Ingrese un numero");
        numero=Utils.leerInt();
        while(numero>1 && numero<100) {
            if(numero%2==0 && numero%3==0){
                System.out.println("El numero cumple con las condiciones");
            }   
            else{
                System.out.println("El numero no cumple con las condiciones");
            }
        }
    }
}