/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número.
 */
public class ejercicio15 {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int contador = 0;
        int mayor = 1;
        int menor = 1;

        do {
            System.out.println("Ingrese un número entero (0 para terminar):");
            numero = Utils.leerInt();

            if (numero != 0) {
                suma += numero;
                contador++;

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

        } while (numero != 0);

        if (contador == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
            System.out.println("El mayor número ingresado fue: " + mayor);
            System.out.println("El menor número ingresado fue: " + menor);
        }
    }
}
