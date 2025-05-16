/*Implementar un programa que, dado un arreglo de enteros, incremente en 1 cada elemento de una
secuencia, si la suma de los elementos de dicha secuencia es par. */
public class ejercicioSecuencias {
    public static final int MAX=12,SEPARADOR=0;
    public static void main (String[]args){
        int[]arreglo={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 0, 17, 20, 22, 0, 17, 20, 0};
        mostrarArreglo(arreglo);
        procesarSecuencias(arreglo);
        mostrarArreglo(arreglo);
    }
    
    public static void procesarSecuencias(int[]arreglo){
        int inicio=0,fin=-1,suma=0;
        while(inicio<MAX){
            inicio=obtenerInicio(arreglo,fin+1);
            if(inicio<MAX){
                fin=obtenerFin(arreglo,inicio);
                //ya tengo una secuencia con inicio y fin
                suma=obtenerSuma(arreglo,inicio,fin);
                    if(suma%2==0){
                        modificarSecuencia(arreglo,inicio,fin);
                    }
            }
        }
    }

    public static void modificarSecuencia(int[]arr,int ini,int fin){
        while(ini<=fin){
            arr[ini]+=1;
            ini++;
        }
    }

    public static int obtenerSuma(int []arr,int ini,int fin){
        int suma=0;
        while(ini<=fin){
            suma+=arr[ini];
            ini++;
        }
        return suma;
    }

    public static int obtenerInicio(int[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos-1;
    }

    public static void mostrarArreglo(int[]arreglo){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arreglo[i] + "|");
        }
        System.out.println("");
    }
}
