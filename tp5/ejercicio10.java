/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    static int MAX = 10;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ImprimirArreglo(arr);

        int N = ObtenerN(); // Obtener N desde el usuario
        int primos = ContarPrimos(arr); // Contar primos en el arreglo

        System.out.println("En total " + primos + " números son primos.");

        if (primos >= N) {
            System.out.println("El arreglo tiene al menos " + N + " números primos.");
        } else {
            System.out.println("El arreglo NO tiene al menos " + N + " números primos.");
        }
    }

    // Método para contar números primos en el arreglo
    public static int ContarPrimos(int[] arr) {
        int acumulador = 0;
        for (int i = 0; i < arr.length; i++) {
            if (EsPrimo(arr[i])) {
                acumulador++;
            }
        }
        return acumulador;
    }

    // Método para verificar si un número es primo
    public static boolean EsPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para imprimir el arreglo
    public static void ImprimirArreglo(int[] arr) {
        System.out.println("Arreglo:");
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "| ");
        }
        System.out.println();
    }

    // Método para obtener N desde el usuario
    public static int ObtenerN() {
        int numero = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese el número N (cantidad mínima de números primos): ");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
