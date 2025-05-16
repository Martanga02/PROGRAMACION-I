/*Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo. */
public class ejercicio28 {
    public static final int MAX=20,SEPARADOR=0,MAXI=5; 
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 3, 1, 20, 22, 0, 7, 20, 0};
        int[]arreglin={0,2, 4, 5,0};
        System.out.println("El arreglo orignal es: "); ImprimirArreglo(arr);
        System.out.println("El arreglo patron es: "); ImprimirArregloPetit(arreglin);
        procesarSecuencias(arr,arreglin);
        System.out.println("El arreglo modificado es: "); ImprimirArreglo(arr);
    }
    public static void procesarSecuencias(int[] arr, int[] arreglin) {
        int inicio = 0, fin = -1;

        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                if (EsIgual(arr, inicio, fin, arreglin)) {
                    int cantidad = fin - inicio + 1;
                    for (int i = 0; i < cantidad; i++) {
                        CorrimientoIzquierda(arr, inicio);
                    }
                    // no adelantamos inicio, porque puede haber otra coincidencia en la nueva posición
                    fin = inicio - 1;
                }
            }
        }
    }

    public static void CorrimientoIzquierda(int[]arr,int inicio){
        while(inicio < MAX-1){
            arr[inicio]=arr[inicio+1];
            inicio++;
        }
        arr[MAX - 1] = 0; // siempre borramos la última posición
    }

    public static boolean EsIgual(int[] arr, int inicio, int fin, int[] arreglin) {
        int longitudSecuencia = fin - inicio + 1;
        int longitudPatron = MAXI - 2; // sin contar los ceros inicial/final

        if (longitudSecuencia != longitudPatron) {
            return false;
        }

        for (int i = 0; i < longitudSecuencia; i++) {
            if (arr[inicio + i] != arreglin[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int BuscarInicio(int[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos - 1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }

    public static void ImprimirArregloPetit(int[]arr){
        for(int i =0;i<MAXI;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
