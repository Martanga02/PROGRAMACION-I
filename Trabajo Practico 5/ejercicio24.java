/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor */
public class ejercicio24 {
    public static final int MAX=20,SEPARADOR=0;
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 0, 1, 20, 22, 0, 7, 20, 0};
        ImprimirArreglo(arr);
        procesarSecuencias(arr);
    }

    public static void procesarSecuencias(int[]arr){
        int inicio=0,fin=-1,suma=0;
        int inicioMayor=0,finMayor=-1,sumaMayor=0;
        while(inicio<MAX){
            inicio=BuscarInicio(arr, fin + 1);
            if(inicio<MAX){
                fin=BuscarFin(arr, inicio);
                suma=Suma(arr, inicio, fin);
                if(suma>sumaMayor){
                    sumaMayor=suma;
                    inicioMayor=inicio;
                    finMayor=fin;
                }
            }
        }
        System.out.println("La secuencia con suma mayor arranca en : " + inicioMayor + " y termina en " + finMayor + " y suma " + sumaMayor);
    }

    public static int Suma(int[]arr,int inicio,int fin){
        int suma=0;
        for(int i=inicio;i<=fin;i++){
            suma+=arr[i];
        }
        return suma;
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
        return pos-1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i = 0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
