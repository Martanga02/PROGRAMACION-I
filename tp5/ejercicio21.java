/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio21 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={12,21,22,65,4,1,76,89,10,34};
        int numero=ObtenerNumero();
        int posicion=ObtenerPosicion();
        insercion(arr);
        System.out.println("Arreglo original: "); ImprimirArreglo(arr);
        CorrimientoDerecha(arr, numero,posicion);
        System.out.println("Arreglo modificado: "); ImprimirArreglo(arr);

    }

    public static void insercion(int arr[]){
        for (int i = 1; i < MAX; i++) {
            int aux = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > aux)){
            arr[j+1] = arr[j];
            j--;
            }
            arr[j+1] = aux;
        }
    }

    public static void CorrimientoDerecha(int[]arr,int num,int pos){
        int i=MAX-1;
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[pos]=arr[num];
    }

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {

            System.out.println(exc);
        }
        return numero;
    }
    public static int ObtenerPosicion(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una posicion(de 1 a 10)");
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {

            System.out.println(exc);
        }
        return numero;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
