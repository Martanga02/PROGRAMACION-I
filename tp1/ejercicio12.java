import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {
    public static void main (String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        int resultado2 = 0;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero:");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero entero:");
            numero2 = Integer.valueOf(entrada.readLine());

            resultado = numero1 + 1;  // Incremento
            resultado2 = numero2 - 1; // Decremento
            numero1++;  // Incremento real
            numero2--;  // Decremento real

            System.out.println("El numero 1 original es: " + (numero1 - 1) + " y el incrementado es: " + resultado);
            System.out.println("El numero 2 original es: " + (numero2 + 1) + " y el decrementado es: " + resultado2);

        } catch (Exception exc) { // Se ejecuta si ocurre algún error de lectura
            System.out.println(exc);
        }
    }
}
