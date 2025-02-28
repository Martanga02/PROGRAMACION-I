/*Hacer un programa que invierta el orden de la última secuencia
en un arreglo. */
public class ejercicio31 {
    static final int MAX = 20;

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 4, 7, 4, 0, 1, 3, 0, 6, 3, 8, 0, 6, 4, 0};

        System.out.println("Arreglo original:");
        ImprimirArreglo(arr);

        int inicio = 0, fin = 0, ultInicio = -1, ultFin = -1;

        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                ultInicio = inicio;
                ultFin = fin;
            }
        }

        if (ultInicio != -1 && ultFin != -1) {
            InvertirOrden(arr, ultInicio, ultFin);
        }

        System.out.println("Arreglo con la última secuencia invertida:");
        ImprimirArreglo(arr);
    }

    public static void InvertirOrden(int[] arr, int inicio, int fin) {
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
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

    public static void ImprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
