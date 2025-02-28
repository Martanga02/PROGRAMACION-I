/*Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente. */

    public class ejercicio8 {
        static int MAX=10;
        public static void main (String[]args){
            int[]arr={9,8,7,6,5,4,3,2,1,0};
            ImprimirArreglo(arr);
            ASC(arr);

        }
        public static void ASC(int[]arr){
            for(int i=0;i<MAX;i++){
                if(arr[i]>arr[i+1]){
                    System.out.println("si");
                }
                else{
                    System.out.println("no");
                }
            }
        }
        
        public static void ImprimirArreglo(int[]arr){
            for(int i=0;i<MAX;i++){
                System.out.println("|" + arr[i] + "|");
            }
        }
    }
    

