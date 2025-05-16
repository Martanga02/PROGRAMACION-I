/*Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B. */
public class ejercicio11 {
    public static final int MAX=10;
    public static void main (String[]args){
        int[]A={1,2,3,4,5,6,7,8,9,10};
        int[]B={2,4,6,8,10,12,14,16,18,20};
        if(esta(A, B)){
            System.out.println("Todos los elementos del arreglo A estan en el B");
        }
        else{
            System.out.println("No todos los elementos del arreglo A estan en el B");
        }
    }
    public static boolean esta(int[] A, int[] B) {
        for (int i = 0; i < MAX; i++) {
            boolean encontrado = false;
            for (int j = 0; j < MAX; j++) {
                if (A[i] == B[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                return false; // Al menos un elemento de A no está en B
            }
        }
        return true; // Todos los elementos de A están en B
    }
}
