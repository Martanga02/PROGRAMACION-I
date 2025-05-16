/*Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros. */
public class ejercicio23{
    public static final int MAX=20, SEPARADOR=0;
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 0, 17, 20, 22, 0, 17, 20, 0};
        ImprimirArreglo(arr);
        procesarSecuencias(arr);

    }
    public static void procesarSecuencias(int[]arr){
        int inicio=0,fin=-1;
        boolean encontrada=false;
        while(inicio<MAX && !encontrada){
            inicio=BuscarInicio(arr, fin+1);
            if(inicio<MAX){
                fin=BuscarFin(arr, inicio);
                //ya tengo secuancia con inicio y fin
                System.out.println("El inicio de la primera secuencia distinta de cero es: " + inicio + " y el fin es: " + fin);
                encontrada=true;
            }
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
        return pos-1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}