/*Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main dos
arreglos: un arreglo con los caracteres que son letras vocales y
otro con los que son consonantes. */

import java.util.Random;

public class ejercicio13 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        char[] arrchar = new char[MAX];
        cargar_arreglo_aleatorio_char(arrchar);
        System.out.print("Arreglo original: ");
        imprimir_arreglo_char(arrchar);

        char[] vocales = new char[MAX];
        char[] consonantes = new char[MAX];

        separar_vocales_consonantes(arrchar, vocales, consonantes);

        System.out.print("\nVocales: ");
        imprimir_arreglo_char(vocales);
        System.out.print("\nConsonantes: ");
        imprimir_arreglo_char(consonantes);
    }

    // Carga de arreglo de char con valores de 'a' a la 'z'
    public static void cargar_arreglo_aleatorio_char(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }

    // Método para imprimir el arreglo
    public static void imprimir_arreglo_char(char[] arreglin) {
        for (int pos = 0; pos < MAX; pos++) {
            if (arreglin[pos] != '\u0000') { // Ignorar posiciones vacías
                System.out.print("|" + arreglin[pos] + "|");
            }
        }
        System.out.println();
    }

    // Método para separar vocales y consonantes
    public static void separar_vocales_consonantes(char[] original, char[] vocales, char[] consonantes) {
        int idxVocal = 0;
        int idxConsonante = 0;
        for (int i = 0; i < MAX; i++) {
            if (es_vocal(original[i])) {
                vocales[idxVocal++] = original[i];
            } else {
                consonantes[idxConsonante++] = original[i];
            }
        }
    }

    // Método para verificar si un carácter es vocal
    public static boolean es_vocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
