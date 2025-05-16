/*Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.
 */
public class ejercicio25 {
    public static final int MAX=20,SEPARADOR=0;
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 0, 1, 20, 22, 0, 7, 20, 0};
        ImprimirArreglo(arr);
        procesarSecuencias(arr);
    }

    public static void procesarSecuencias(int[] arr) {
        int inicio = 0, fin = -1;
        int anteUltimoInicio = -1, anteUltimoFin = -1;
        int ultimoInicio = -1, ultimoFin = -1;

        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                // Actualizar las últimas dos secuencias encontradas
                anteUltimoInicio = ultimoInicio;
                anteUltimoFin = ultimoFin;
                ultimoInicio = inicio;
                ultimoFin = fin;
            }
        }

        if (anteUltimoInicio != -1 && anteUltimoFin != -1) {
            System.out.println("El inicio de la anteúltima secuencia es: " + anteUltimoInicio + " y el fin es: " + anteUltimoFin);
        } else {
            System.out.println("No hay suficientes secuencias para encontrar la anteúltima.");
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
        return pos -1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}

//Simulación paso a paso:

//Iteración	inicio	fin	 ultimoInicio	ultimoFin	anteUltimoInicio	anteUltimoFin
//  1 	       1	 3	     1	            3	           -1	            -1
//  2	       5	 5	     5	            5	            1	             3
//  3	       7	 9	     7	            9	            5	             5
//  4	      11	 11	     11	            11	            7	             9
//  5	      13	 15	     13	            15	            11	             11
//  6	      17	 18	     17	            18	            13	             15