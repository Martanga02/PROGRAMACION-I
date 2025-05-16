/*Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main dos
arreglos: un arreglo con los caracteres que son letras vocales y
otro con los que son consonantes. */
public class ejercicio13 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] vocales = new char[MAX];
        char[] consonantes = new char[MAX];
        
        int cantVocales = EsVocal(arr, vocales);
        int cantConsonantes = EsConsonante(arr, consonantes);
        
        System.out.print("Vocales: ");
        MostrarArreglo(vocales, cantVocales);

        System.out.print("Consonantes: ");
        MostrarArreglo(consonantes, cantConsonantes);
    }

    public static int EsVocal(char[] arr, char[] vocales) {
        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vocales[j] = arr[i];
                j++;
            }
        }
        return j; // cantidad de vocales
    }

    public static int EsConsonante(char[] arr, char[] consonantes) {
        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z' && arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
                consonantes[j] = arr[i];
                j++;
            }
        }
        return j; // cantidad de consonantes
    }

    public static void MostrarArreglo(char[] arr, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
