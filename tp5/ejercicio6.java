/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima. */
public class ejercicio6 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,1,2,3,6,8};
        ImprimirArreglo(arr);
        EsPar(arr);
    }
    public static void EsPar(int[]arr){
        int acumulador=0;
        for(int i=0;i<MAX;i++){
            if(arr[i]%2==0){
                acumulador++;
            }
        }
        System.out.println("La cantidad de pares es: " + acumulador);
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.println("|" + arr[i] + "|");
        }
    }
}
