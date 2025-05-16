/*Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original.
 */
public class ejercicio7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = ObtenerNumero();
        int[] posiciones = encontrarPosiciones(arr, num);
        
        // Mostrar las posiciones
        System.out.print("Posiciones donde se encuentra el número " + num + ": ");
        for (int pos : posiciones) {
            if (pos != -1) { // Ignorar los valores -1, que no son posiciones válidas
                System.out.print(pos + " ");
            }
        }
        System.out.println();
        
        // Multiplicar las ocurrencias de 'num' por un número M
        System.out.println("Ingrese un número M para multiplicar las ocurrencias de " + num);
        int M = Utils.leerInt();
        multiplicarOcurrencias(arr, posiciones, M);
        
        // Mostrar el arreglo modificado
        System.out.print("Arreglo después de multiplicar las ocurrencias: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int ObtenerNumero() {
        int num = 0;
        System.out.println("Ingrese un número:");
        num = Utils.leerInt();
        return num;
    }

    public static int[] encontrarPosiciones(int[] arr, int num) {
        int[] posiciones = new int[arr.length];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                posiciones[index++] = i;
            }
        }
        
        // Llenar el resto del arreglo de posiciones con -1 para indicar posiciones no utilizadas
        while (index < posiciones.length) {
            posiciones[index++] = -1;
        }
        
        return posiciones;
    }

    public static void multiplicarOcurrencias(int[] arr, int[] posiciones, int M) {
        for (int pos : posiciones) {
            if (pos != -1) { // Solo multiplicar en posiciones válidas
                arr[pos] *= M;
            }
        }
    }
}
