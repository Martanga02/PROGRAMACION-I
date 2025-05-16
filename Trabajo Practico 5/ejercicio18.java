/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).
 */
public class ejercicio18 {
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int num =SolicitarNumero();
        int pos=BuscarPosicion(arr, num);
        corrimientoIzquierda(arr, pos);
        ImprimirArreglo(arr);

    }
    public static void corrimientoIzquierda(int[]arr,int pos){
        while(pos < MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
        arr[MAX - 1] = 0; // siempre borramos la última posición
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
    public static int SolicitarNumero(){
        System.out.println("Ingrese un numero para buscar y eliminar");
        int num= Utils.leerInt();
        return num;
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i =0; i<MAX; i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
