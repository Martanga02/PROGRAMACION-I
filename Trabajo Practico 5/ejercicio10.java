/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados.
 */
public class ejercicio10 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 4, 1, 6, 1, 8, 9, 10};

        System.out.print("Ingrese el valor de N: ");
        int N =SolicitarNumero();

        if (Verificar(arr, N)) {
            System.out.println("Hay al menos " + N + " números primos");
        } else {
            System.out.println("No hay al menos " + N + " números primos");
        }
    }

    public static int SolicitarNumero(){
        System.out.println("Ingrese un numero de primos para buscar");
        int num=Utils.leerInt();
        return num;
    }

    public static boolean Verificar(int[] arr, int N) {
        int contador = 0;
        for (int i = 0; i < MAX; i++) {
            if (esPrimo(arr[i])) {
                contador++;
                if (contador >= N) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
