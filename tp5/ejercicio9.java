/*Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. */
public class ejercicio9 {
    static int MAX = 10;

    public static void main(String[] args) {
        char[] arr = {'a', 'd', 'e', 'q', 'f', 'g', 'r', 'c', 'b', 'g'};
        ImprimirArreglo(arr);
        if (Repetida(arr)) {
            System.out.println("Hay al menos una letra repetida.");
        } else {
            System.out.println("No hay letras repetidas.");
        }
    }

    public static boolean Repetida(char[] arr) {
        for (int i = 0; i < MAX - 1; i++) {
            for (int j = i + 1; j < MAX; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Se encontró una letra repetida
                }
            }
        }
        return false; // No se encontraron letras repetidas
    }

    public static void ImprimirArreglo(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.println("|" + arr[i] + "|");
        }
    }
}
