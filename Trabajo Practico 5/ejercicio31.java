/*Hacer un programa que invierta el orden de la última secuencia
en un arreglo.
 */
public class ejercicio31 {
    public static final int MAX =20,SEPARADOR=0;
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 3, 1, 20, 22, 0, 7, 20, 0};
        ImprimirArreglo(arr);
        ProcesarSecuencias(arr);
        ImprimirArreglo(arr);
    }

    public static void ProcesarSecuencias(int[] arr) {
        int inicio = 0, fin = -1;
        int ultimoInicio = -1, ultimoFin = -1;
    
        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                ultimoInicio = inicio;
                ultimoFin = fin;
            }
        }
    
        if (ultimoInicio != -1 && ultimoFin != -1) {
            InvertirSecuencia(arr, ultimoInicio, ultimoFin);
        }
    }

    // Esta función invierte el orden de los elementos en el arreglo `arr`
    // desde la posición `inicio` hasta la posición `fin`.
    public static void InvertirSecuencia(int[] arr, int inicio, int fin) {

        // Mientras el índice de inicio sea menor que el índice de fin
        while (inicio < fin) {

            // Guarda temporalmente el valor del elemento en la posición inicio
            int temp = arr[inicio];

            // Asigna al elemento en la posición inicio el valor del elemento en la posición fin
            arr[inicio] = arr[fin];

            // Asigna al elemento en la posición fin el valor temporal (el que estaba en inicio)
            arr[fin] = temp;

            // Avanza una posición desde el inicio hacia el centro
            inicio++;

            // Retrocede una posición desde el final hacia el centro
            fin--;
        }
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
        for(int i = 0; i<MAX ;i++){
            System.out.print("|" + arr[i] + "| ");
        }
        System.out.println(" ");
    }
}
