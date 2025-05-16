/*Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos.
 */
public class ejercicio29 {
    public static final int MAX=20;
    public static final char SEPARADOR=' ';
    public static void main (String[]args){
        char[]arr={' ','a','b','c',' ','f','t','a',' ','c','b','a',' ','o','p','q','r','s','t',' '};
        ImprimirArreglo(arr);
        procesarSecuencias(arr);
        ImprimirArreglo(arr);
    }
    public static void procesarSecuencias(char[] arr) {
        int inicio = 0, fin = -1;
        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                if (EsDescendente(arr, inicio, fin)) {
                    for (int i = inicio; i <= fin; i++) {
                        CorrimientoIzquierda(arr, inicio);
                    }
                    fin = inicio - 1; // volvemos a analizar desde el mismo lugar
                } else {
                    // No hay que eliminar, se sigue desde el final de esta secuencia
                    fin = BuscarFin(arr, inicio);
                }
            }
        }
    }
    

    public static void CorrimientoIzquierda(char[]arr,int inicio){
        while(inicio<MAX-1){
            arr[inicio]=arr[inicio+1];
            inicio++;
        }
        arr[MAX - 1] = 0; // siempre borramos la última posición
    }
    public static boolean EsDescendente(char[] arr, int inicio, int fin) {
        for (int i = inicio; i < fin; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false; // Si un elemento no es mayor que el siguiente, no es descendente
            }
        }
        return true;
    }
    
    public static int BuscarInicio(char[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(char[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos -1;
    }

    public static void ImprimirArreglo(char[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
