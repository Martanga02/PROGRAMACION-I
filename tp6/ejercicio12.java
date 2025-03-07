/*Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada, permita encontrar por cada fila
la posición de inicio y fin de la anteúltima secuencia (considerar
comenzar a buscarla a partir de la última posición de la fila). */
public class ejercicio12 {
    static int MAXC = 20, MAXF = 5;

    public static void main(String[] args) {
        int[][] mat = {
            {0, 5, 12, -3, 8, 0, 14, 7, 22, 0, 3, 9, 0, 16, -4, 11, 0, 25, 6, 0},
            {0, 2, 19, 5, -7, 0, 8, 33, 15, 0, 4, -1, 0, 12, 20, 9, 0, 17, 8, 0},
            {0, 9, 3, -5, 14, 0, 21, 6, 18, 0, 2, 11, 0, -8, 30, 7, 0, 19, 5, 0},
            {0, -4, 23, 8, 3, 0, 15, 5, -6, 0, 10, 14, 0, 11, 7, 22, 0, 13, 4, 0},
            {0, 7, 25, -2, 9, 0, 18, 6, 14, 0, 3, 12, 0, 19, 8, 5, 0, 21, -1, 0}
        };

        for (int fila = 0; fila < MAXF; fila++) {
            int fin = MAXC - 1;
            int inicioUltima = -1, finUltima = -1;
            int inicioAnteUltima = -1, finAnteUltima = -1;

            // Buscar la última secuencia
            finUltima = BuscarFin(mat[fila], fin);
            if (finUltima >= 0) {
                inicioUltima = BuscarInicio(mat[fila], finUltima);
            }

            // Buscar la anteúltima secuencia
            if (inicioUltima > 0) { // Si hay espacio para otra secuencia
                finAnteUltima = BuscarFin(mat[fila], inicioUltima - 1);
                if (finAnteUltima >= 0) {
                    inicioAnteUltima = BuscarInicio(mat[fila], finAnteUltima);
                }
            }

            // Imprimir resultados
            if (inicioAnteUltima >= 0 && finAnteUltima >= 0) {
                System.out.println("Fila " + fila + ": Anteúltima secuencia - Inicio en " + inicioAnteUltima + ", Fin en " + finAnteUltima);
            } else {
                System.out.println("Fila " + fila + ": No hay anteúltima secuencia.");
            }
        }
    }

    public static int BuscarInicio(int[] fila, int ini) {
        while (ini >= 0 && fila[ini] != 0) {
            ini--;
        }
        return ini + 1;
    }

    public static int BuscarFin(int[] fila, int ini) {
        while (ini >= 0 && fila[ini] == 0) {
            ini--;
        }
        return ini;
    }
}
