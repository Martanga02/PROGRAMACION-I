/*Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.
 */
public class ejercicio7 {
    public static void main (String[]args){
        char caracter='a';
        System.out.println("Ingrese un caracter distinto de '*'");
        caracter=Utils.leerChar();
        while(caracter !='*'){
            if(caracter >='1' && caracter <='9'){
                System.out.println("Es caracter digito");
            }
            else if(caracter >='a' && caracter <='z'){
                System.out.println("Es caracter letra minuscula");
            }
        }
    }
}
