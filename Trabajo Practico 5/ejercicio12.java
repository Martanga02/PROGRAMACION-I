/*MAXA y un arreglo B de tamaño MAXB con números entre 0 y
MAXA-1, determinar la suma de los elementos del arreglo A cuyas
posiciones son indicadas por el arreglo B. Por ejemplo, dado
A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
y el 31 de la posición 2 del arreglo A). */
public class ejercicio12 {
    public static int MAXA = 4;
    public static int MAXB = 2;

    public static void main(String[] args) {
        int[] A = {3, 6, 31, 9};
        int[] B = {0, 2};
        int suma = Sumar(A, B);
        System.out.println("La suma es: " + suma);
    }

    public static int Sumar(int[] A, int[] B) {
        int suma = 0;
        for (int i = 0; i < MAXB; i++) {
            int indice = B[i];
            if (indice >= 0 && indice < MAXA) {
                suma += A[indice];
            }
        }
        return suma;
    }
}
