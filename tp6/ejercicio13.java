/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, y un número entero ingresado por
el usuario, elimine de cada fila las secuencias de tamaño igual al
número ingresado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio13 {
    static final int MAXC = 20, MAXF = 5;

    public static void main(String[] args) {
        int[][] mat = {
            {0, 5, 12, -3, 8, 0, 14, 7, 22, 0, 3, 9, 0, 16, -4, 11, 0, 25, 6, 0},
            {0, 2, 19, 5, -7, 0, 8, 33, 15, 0, 4, -1, 0, 12, 20, 9, 0, 17, 8, 0},
            {0, 9, 3, -5, 14, 0, 21, 6, 18, 0, 2, 11, 0, -8, 30, 7, 0, 19, 5, 0},
            {0, -4, 23, 8, 3, 0, 15, 5, -6, 0, 10, 14, 0, 11, 7, 22, 0, 13, 4, 0},
            {0, 7, 25, -2, 9, 0, 18, 6, 14, 0, 3, 12, 0, 19, 8, 5, 0, 21, -1, 0}
        };

        int numero = obtenerNumero();

        for (int fila = 0; fila < MAXF; fila++) {
            int inicio = 0, fin = -1;
            while (inicio < MAXC) {
                inicio = buscarInicio(mat[fila], fin + 1);
                if (inicio < MAXC) {
                    fin = buscarFin(mat[fila], inicio);
                    if (esIgual(mat[fila], inicio, fin, numero)) {
                        corrimientoIzquierda(mat[fila], inicio, fin);
                        fin = inicio - 1; // Reajustar búsqueda después de eliminación
                    }
                }
            }
        }

        System.out.println("Matriz final:");
        imprimirMatriz(mat);
    }

    public static int obtenerNumero() {
        int numero = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese un número: ");
            numero = Integer.parseInt(entrada.readLine());
        } catch (Exception exc) {
            System.out.println("Error en la entrada. Intente nuevamente.");
        }
        return numero;
    }

    public static void corrimientoIzquierda(int[] fila, int inicio, int fin) {
        int cantidad = fin - inicio + 1;
        for (int i = inicio; i < MAXC - cantidad; i++) {
            fila[i] = fila[i + cantidad];
        }
        // Llenar con ceros los espacios sobrantes
        for (int i = MAXC - cantidad; i < MAXC; i++) {
            fila[i] = 0;
        }
    }

    public static boolean esIgual(int[] fila, int inicio, int fin, int numero) {
        return (fin - inicio + 1) == numero;
    }

    public static int buscarInicio(int[] fila, int ini) {
        while (ini < MAXC && fila[ini] == 0) {
            ini++;
        }
        return ini;
    }

    public static int buscarFin(int[] fila, int ini) {
        while (ini < MAXC && fila[ini] != 0) {
            ini++;
        }
        return ini - 1;
    }

    public static void imprimirMatriz(int[][] mat) {
        for (int i = 0; i < MAXF; i++) {
            for (int j = 0; j < MAXC; j++) {
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println();
        }
    }
}
