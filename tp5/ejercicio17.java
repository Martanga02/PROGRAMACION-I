/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio17 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int numero=ObtenerNumero();
        System.out.println("Arreglo original: "); ImprimirArreglo(arr);
        CorrimientoDerecha(arr, numero);
        System.out.println("Arreglo modificado: "); ImprimirArreglo(arr);

    }

    public static void CorrimientoDerecha(int[]arr,int num){
        int i=MAX-1;
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=arr[num];
    }

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
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
