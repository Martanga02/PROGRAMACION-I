/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número).
 */
public class ejercicio19 {
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,3,7,8,9,10};
        int num=ObtenerNumero();
        int pos=0;
        while(pos!=-1){
            pos=BuscarPosicion(arr, num);
            CorrimientoIzquierda(arr, pos);
        }
        ImprimirArreglo(arr);
    }

    public static int ObtenerNumero(){
        System.out.println("Ingrese un numero para buscar y eliminar");
        int num=Utils.leerInt();
        return num;
    }

    public static int BuscarPosicion(int[]arr,int num){
        int pos=0;
        for(int i =0;i<MAX;i++){
            if(arr[i]==num){
                pos=i;
            }
        }
        return pos;
    }
    public static void CorrimientoIzquierda(int[]arr,int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
                pos++;
        }
        arr[MAX - 1] = 0; // siempre borramos la última posición
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
