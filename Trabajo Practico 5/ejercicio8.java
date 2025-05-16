/*Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente.
 */
public class ejercicio8 {
    public static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        if(verificar(arr)){
            System.out.println("El arreglo esta en orden ascendente");
        }
        else{
            System.out.println("El arreglo no esta en orden ascendente");
        }

    }
    public static boolean verificar(int[]arr){
        for(int i=0;i<MAX;i++){
            for(int j=1;j<MAX;j++){
                if(arr[i]<arr[j]){
                    return true;
                }
            }
        }
        return true;
    }
}
