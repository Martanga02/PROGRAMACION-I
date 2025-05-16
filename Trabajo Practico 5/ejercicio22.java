/*Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10. */
public class ejercicio22 {
    public static final int MAX=10;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int par=0;
        par = BuscarPares(arr);
        
        while (par != -1) {
            CorrimientoIzquierda(arr, par);
            par = BuscarPares(arr);
        }
    
        ImprimirArreglo(arr);
    }
    
    public static void CorrimientoIzquierda(int[] arr, int par) {
        while (par < MAX - 1) {
            arr[par] = arr[par + 1];
            par++;
        }
        arr[MAX - 1] = 0; // pisa el último con cero
    }
    
    public static int BuscarPares(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            if (arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
    

    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println("");
    }
}
