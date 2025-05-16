/* Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.
 */
public class ejercicio21 {
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arr={10,9,8,7,6,5,4,3,2,1};
        int num=ObtenerNumero();
        int pos=Buscarposicion(arr, num);
        CorrimientoDerecha(arr, num, pos);
        ImprimirArreglo(arr);

    }
    public static int Buscarposicion(int[] arr, int num) {
        for (int i = 0; i < MAX; i++) {
            if (arr[i] < num) {
                return i; // se inserta antes del primer menor
            }
        }
        return MAX; // si es menor que todos, va al final
    }
    
    public static void CorrimientoDerecha(int[]arr,int num,int pos){
        int i=MAX-1;
        while(i>pos){
            arr[i]=arr[i-1];
            i--;
        }
        arr[i]=num;
    }
    public static int ObtenerNumero(){
        System.out.println("Ingrese un numero");
        int num=Utils.leerInt();
        return num;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
