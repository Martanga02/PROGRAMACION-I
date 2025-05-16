/*Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es.
 */
public class ejercicio4 {
    public static void main (String[]args){
        int num=0;
        System.out.println("Ingrese un numero: ");
        num=Utils.leerInt();
        if(num>=0 && num<=9){
            System.out.println("Un digito");
        }
        else if(num>=10 && num<=99){
            System.out.println("2 digitos");
        }
        else{
            System.out.println("Tres digitos");
        }
    }
}
