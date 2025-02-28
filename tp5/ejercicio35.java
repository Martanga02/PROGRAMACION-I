/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y lo inserte en el arreglo manteniendo
su orden. Para ello tendrá que realizar un corrimiento a derecha
(se pierde el último valor del arreglo) y colocar el número en el
arreglo en la posición indicada. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio35 {
    static final int MAX = 10;

    public static void main(String[] args) {
        int[] arr = {12, 21, 22, 65, 4, 1, 76, 89, 10, 34};

        System.out.println("Arreglo desordenado:");
        ImprimirArreglo(arr);

        // Ordenar el arreglo antes de la inserción
        OrdenarArreglo(arr);

        System.out.println("Arreglo ordenado:");
        ImprimirArreglo(arr);

        int numero = ObtenerNumero();

        // Insertar el número manteniendo el orden
        InsertarOrdenado(arr, numero);

        System.out.println("Arreglo modificado:");
        ImprimirArreglo(arr);
    }

    public static void OrdenarArreglo(int arr[]) {
        for (int i = 1; i < MAX; i++) {
            int aux = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > aux) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }
    }

    public static void InsertarOrdenado(int[] arr, int num) {
        int pos = 0;
        
        // Encontrar la posición donde insertar
        while (pos < MAX - 1 && arr[pos] < num) {
            pos++;
        }

        // Corrimiento a la derecha
        for (int i = MAX - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insertar el número en la posición correcta
        arr[pos] = num;
    }

    public static int ObtenerNumero() {
        int numero = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(entrada.readLine());
        } catch (Exception exc) {
            System.out.println("Error: " + exc.getMessage());
        }
        return numero;
    }

    public static void ImprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
