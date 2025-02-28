/*Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10. */
public class ejercicio22 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={12,21,22,65,4,1,76,89,10,34};
        System.out.println("Arreglo original: "); ImprimirArreglo(arr);
        while(EsPar(arr)){
            CorrimientoIzquierda(arr);
        }
        System.out.println("Arreglo modificado: "); ImprimirArreglo(arr);
    }
    public static boolean EsPar(int[]arr){
        for(int i=0;i<MAX;i++){
            if(arr[i]%2==0){
                return true;
            }
        }
        return false;
    }

    public static void CorrimientoIzquierda(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i; j < MAX - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[MAX - 1] = 0; // Rellenar con 0 después del corrimiento
                break; // Salir después de eliminar un par para verificar nuevamente
            }
        }
    }
     
    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
