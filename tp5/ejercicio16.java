/*Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio16 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int posicion=ObtenerPosicion();
        System.out.println("Arreglo original: "); ImprimirArreglo(arr);
        CorrimientoIzquierda(arr, posicion);
        System.out.println("Arreglo modificado: "); ImprimirArreglo(arr);
    }

    public static void CorrimientoIzquierda(int[]arr,int pos){
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
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
