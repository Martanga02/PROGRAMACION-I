/*Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros. */
public class ejercicio23 {
    public static final int MAX = 20;
    public static void main(String[] args) {
    int[] arr = {0,1,2,3,4,0,4,7,4,0,1,3,0,6,3,8,0,6,4,0};
    int inicio=0,fin=-1;
        while (inicio < MAX){
            inicio = obtener_inicio_secuencia(arr,fin+1);
            if (inicio < MAX){
            fin = obtener_fin_secuencia(arr,inicio);
            System.out.println("El inicio es: " + inicio + " y el fin es " + fin);
        break;
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
}