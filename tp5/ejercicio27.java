/*Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio27 {
    static int MAX=20;
    public static void main (String[]args){
        int[] arr = {0, 1, 2, 3, 4, 0, 4, 7, 4, 0, 1, 3, 0, 6, 3, 8, 0, 6, 4, 0};
        
        System.out.println("El arreglo original es:");
        ImprimirArreglo(arr);

        int numero = PedirNumero();
        int inicio = 0, fin = -1;
        
        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                if (BuscarTamañoN(inicio, fin, numero)) {
                    CorrimientoIzquierda(arr, inicio, fin);
                    fin = inicio - 1; // Reiniciar búsqueda correctamente
                }
            }
        }

        System.out.println("El arreglo modificado es:");
        ImprimirArreglo(arr);
    }

    public static void CorrimientoIzquierda(int[] arr, int ini, int fin) {
        int tam = fin - ini + 1; // Tamaño de la secuencia a eliminar
        
        // Mover los elementos hacia la izquierda
        for (int i = ini; i < MAX - tam; i++) {
            arr[i] = arr[i + tam];
        }
        
        // Rellenar con ceros los espacios sobrantes
        for (int i = MAX - tam; i < MAX; i++) {
            arr[i] = 0;
        }
    }

    public static int PedirNumero(){
        int numero=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static boolean BuscarTamañoN(int inicio, int fin, int numero) {
        return (fin - inicio + 1) == numero; // Devuelve true solo si la secuencia tiene tamaño N
    }

    public static int BuscarInicio(int[]arr,int ini){
        while(ini<MAX && arr[ini]==0){
            ini++;
        }
        return ini;
    }

    public static int BuscarFin(int[] arr, int ini) {
        while (ini < MAX && arr[ini] != 0) {
            ini++;
        }
        return ini - 1;
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
