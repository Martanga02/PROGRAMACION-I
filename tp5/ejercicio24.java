/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor. */
public class ejercicio24 {
    static int MAX = 20;

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 4, 7, 4, 0, 1, 3, 0, 6, 3, 8, 0, 6, 4, 0};

        int inicio = 0, fin = -1;
        int sumaMax = 0, inicioMax = -1, finMax = -1;

        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                int suma = BuscarSuma(arr, inicio, fin);

                // Si encontramos una suma mayor, actualizamos los valores
                if (suma > sumaMax) {
                    sumaMax = suma;
                    inicioMax = inicio;
                    finMax = fin;
                }
            }
        }

        // Imprimimos la mejor secuencia encontrada
        if (inicioMax != -1) {
            System.out.println("La secuencia con la mayor suma inicia en " + inicioMax +
                               ", termina en " + finMax +
                               " y su suma es " + sumaMax);
        } else {
            System.out.println("No hay secuencias válidas en el arreglo.");
        }
    }

    public static int BuscarSuma(int[] arr, int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static int BuscarInicio(int[] arr, int ini) {
        while (ini < MAX && arr[ini] == 0) {
            ini++;
        }
        return ini;
    }

    public static int BuscarFin(int[] arr, int ini) {
        while (ini < MAX && arr[ini] != 0) {
            ini++;
        }
        return ini - 1;
    }
}
