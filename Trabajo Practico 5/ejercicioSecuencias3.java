/*Determinar el inicio y fin de la secuencia que más números pares tiene (si hay más de una, quedarse con la
primera)
 */
public class ejercicioSecuencias3 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 0, 17, 20, 22, 0, 17, 20, 0};
        imprimir_arreglo_secuencias_int(arr);
        imprimir_maximo_pares_secuencia(arr);
    }
    public static int obtener_pares_secuencia(int[] arr, int inicio, int fin){
        int pares = 0;
        while (inicio <= fin){
            if (arr[inicio]%2==0){
                pares+=1;
            }
            inicio++;
        }
        return pares;
    }

    public static void imprimir_maximo_pares_secuencia(int[] arr){
        int inicio=0,fin=-1,par=0;
        int maximoparinicio=0, maximoparfin=0, maximopar=0;
        while ((inicio < MAX)){
            inicio = obtener_inicio_secuencia(arr,fin+1);
            if (inicio < MAX){
                fin = obtener_fin_secuencia(arr,inicio);
                par = obtener_pares_secuencia(arr,inicio,fin);
                if (par>maximopar){
                    maximoparinicio = inicio;
                    maximoparfin = fin;
                    maximopar = par;
                }
            }
        }
        System.out.println("Inicio: "+maximoparinicio+" Fin: "+maximoparfin);
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

    public static void imprimir_arreglo_secuencias_int(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
       
}
