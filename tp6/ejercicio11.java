/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor. */
public class ejercicio11 {
    static int MAXC = 20, MAXF = 5;

    public static void main(String[] args) {
        int[][] mat = {
            {0, 5, 12, -3, 8, 0, 14, 7, 22, 0, 3, 9, 0, 16, -4, 11, 0, 25, 6, 0},
            {0, 2, 19, 5, -7, 0, 8, 33, 15, 0, 4, -1, 0, 12, 20, 9, 0, 17, 8, 0},
            {0, 9, 3, -5, 14, 0, 21, 6, 18, 0, 2, 11, 0, -8, 30, 7, 0, 19, 5, 0},
            {0, -4, 23, 8, 3, 0, 15, 5, -6, 0, 10, 14, 0, 11, 7, 22, 0, 13, 4, 0},
            {0, 7, 25, -2, 9, 0, 18, 6, 14, 0, 3, 12, 0, 19, 8, 5, 0, 21, -1, 0}
        };

        // Recorremos cada fila de la matriz
        for (int fila = 0; fila < MAXF; fila++) {
            int inicio = 0, fin = -1;
            int sumaMax = Integer.MIN_VALUE, inicioMax = -1, finMax = -1;

            // Buscamos las secuencias en la fila actual
            while (inicio < MAXC) {
                inicio = BuscarInicio(mat[fila], fin + 1);
                if (inicio < MAXC) {
                    fin = BuscarFin(mat[fila], inicio);
                    int suma = SumarSecuencia(mat[fila], inicio, fin);

                    // Si encontramos una suma mayor, actualizamos los valores
                    if (suma > sumaMax) {
                        sumaMax = suma;
                        inicioMax = inicio;
                        finMax = fin;
                    }
                }
            }

            // Imprimimos la mejor secuencia encontrada para la fila actual
            if (inicioMax != -1) {
                System.out.println("Fila " + fila + ": La secuencia con la mayor suma inicia en " + inicioMax +
                                   ", termina en " + finMax + " y su suma es " + sumaMax);
            } else {
                System.out.println("Fila " + fila + ": No hay secuencias válidas.");
            }
        }
    }

    public static int SumarSecuencia(int[] fila, int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) { // Se incluye `fin`
            suma += fila[i];
        }
        return suma;
    }

    public static int BuscarInicio(int[] fila, int ini) {
        while (ini < MAXC && fila[ini] == 0) {
            ini++;
        }
        return ini;
    }

    public static int BuscarFin(int[] fila, int ini) {
        while (ini < MAXC && fila[ini] != 0) {
            ini++;
        }
        return ini - 1;
    }
}
