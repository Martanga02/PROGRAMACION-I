/*Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main: un
arreglo con las posiciones de los caracteres que son letras
vocales y otro con las posiciones que son consonantes.
 */
public class ejercicio14 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int[] posVocales = new int[MAX];
        int[] posConsonantes = new int[MAX];

        int cantVocales = ObtenerPosicionesVocales(arr, posVocales);
        int cantConsonantes = ObtenerPosicionesConsonantes(arr, posConsonantes);

        System.out.print("Posiciones de vocales: ");
        MostrarArreglo(posVocales, cantVocales);

        System.out.print("Posiciones de consonantes: ");
        MostrarArreglo(posConsonantes, cantConsonantes);
    }

    public static int ObtenerPosicionesVocales(char[] arr, int[] posVocales) {
        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (esVocal(arr[i])) {
                posVocales[j] = i;
                j++;
            }
        }
        return j;
    }

    public static int ObtenerPosicionesConsonantes(char[] arr, int[] posConsonantes) {
        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (esLetraMinuscula(arr[i]) && !esVocal(arr[i])) {
                posConsonantes[j] = i;
                j++;
            }
        }
        return j;
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean esLetraMinuscula(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static void MostrarArreglo(int[] arr, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
