/*Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.
 */
public class ejercicio26{
    public static final int MAX=20,SEPARADOR=0;
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 3, 1, 20, 22, 0, 7, 20, 0};
        procesarSecuencias(arr);
        ImprimirArreglo(arr);

    }
    public static void procesarSecuencias(int[]arr){
        int inicio=0, fin=-1, inicioMayor=-1, finMAyor=-1, tamanio=0, tamanioMayor=-1;
        while(inicio<MAX){
            inicio=BuscarInicio(arr, fin + 1);
            if(inicio<MAX){
                fin=BuscarFin(arr, inicio);
                tamanio=Tamanio(arr, fin, inicio);
                if(tamanio > tamanioMayor){
                    tamanioMayor=tamanio;
                    finMAyor=fin;
                    inicioMayor=inicio;
                }
            }
        }
        System.out.println("La sencuencia de mayor tamaño es la que empieza en: " + inicioMayor + " y termina en :" + finMAyor + " y mide: " + tamanioMayor);
    }

    public static int Tamanio(int[]arr,int fin,int inicio){
        int contador=0;
        for(int i = inicio; i<=fin;i++){
            contador++;
        }
        return contador;
    }

    public static int BuscarInicio(int[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[]arr,int pos){
        while(pos < MAX && arr[pos]!=SEPARADOR){
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