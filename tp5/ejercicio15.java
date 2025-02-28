/*Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio15 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int posicion=ObtenerPosicion();
        ImprimirArreglo(arr);
        CorrimientoDerecha(arr, posicion);
        ImprimirArreglo(arr);

    }

    public static void CorrimientoDerecha(int[]arr,int pos){
        int i=MAX-1;
        while(i>pos){
            arr[i]=arr[i-1];
            i--;
        }
    }

    public static int ObtenerPosicion(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una posicion(de 1 a 10)");
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {

            System.out.println(exc);
        }
        return numero;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
