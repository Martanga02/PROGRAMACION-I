//Hacer un programa que dado el arreglo definido y precargado, imprima lo que suma el contenido de cada
//secuencia.
public class ejercicioSecuencias2 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 0, 17, 20, 22, 0, 17, 20, 0};
        imprimir_suma_cada_secuencia(arr);
    }
    public static void imprimir_suma_cada_secuencia(int[] arr){
        int inicio=0,fin=-1,suma=0;
        while ((inicio < MAX)){
            inicio = obtener_inicio_secuencia(arr,fin+1);
            if(inicio < MAX){
                fin = obtener_fin_secuencia(arr,inicio);
                suma = obtener_suma_secuencia(arr,inicio,fin);
                System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
            }
        }
    }
    public static int obtener_fin_secuencia(int[] arrEnteros, int ini) {
        while (ini<MAX && arrEnteros[ini]!=0)
        ini++;
        return ini-1;
    }
   
    public static int obtener_inicio_secuencia(int[] arrEnteros, int ini) {
        while (ini<MAX && arrEnteros[ini]==0)
        ini++;
        return ini;
    }

    public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
        int suma = 0;
        while (inicio <= fin){
        suma+=arr[inicio];
        inicio++;
        }
        return suma;
    }
}
