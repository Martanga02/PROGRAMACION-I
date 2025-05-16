/*Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
 */
public class ejercicio3 {
    public static void main (String[]args){
        int num=0;
        System.out.println("Ingrese un numero mayor a 50: ");
        num=Utils.leerInt();
        if(num>=50 && num%2==0 && num%3==0){
            System.out.println(num);

        }
        else{
            System.out.println("El numero no cumple con los requisitos");
        }
    }
}
