/*Pedir por consola un número entero e informar si es un número
primo. Un número es primo si solo es divisible por 1 y por sí
mismo. */
public class ejercicio21 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Ingrese un número: ");
        numero = Utils.leerInt();

        if (numero <= 1) {
            System.out.println("No es primo");
            return;
        }

        boolean esPrimo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
