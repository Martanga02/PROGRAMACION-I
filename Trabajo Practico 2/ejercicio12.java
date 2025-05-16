/*Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras.
 */
public class ejercicio12 {
    public static void main(String[] args) {
        char caracter;
        char menor = 'z'; // Inicializo con el valor más alto posible
        char mayor = 'a'; // Inicializo con el valor más bajo posible
        boolean huboMinuscula = false;

        System.out.println("Ingrese caracter letra minuscula");
        caracter = Utils.leerChar();

        while (caracter >= 'a' && caracter <= 'z') {
            huboMinuscula = true;

            if (caracter < menor) {
                menor = caracter;
            }

            if (caracter > mayor) {
                mayor = caracter;
            }

            System.out.println("Ingrese caracter letra minuscula");
            caracter = Utils.leerChar();
        }

        if (huboMinuscula) {
            System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
        } else {
            System.out.println("No se ingresó ninguna letra minúscula.");
        }
    }
}
