/*Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B. */
public class ejercicio11 {
    static int MAX=10;
    public static void main (String[]ars){
        int[]arrA={1,2,3,4,5,6,7,8,9,10};
        int[]arrB={2,4,6,8,10,13,14,16,22,99};
        BuscarCoinsidencias(arrA, arrB);
    }
    public static void BuscarCoinsidencias(int[]arrA,int[]arrB){
        int acumulador=0;
        for(int i=0;i<MAX;i++){
            for(int j=0;j<MAX;j++){
                if(arrA[i]==arrB[j]){
                    acumulador++;
                }
            }
        }
        System.out.println("Hay en total: " + acumulador + " coincidencias");
    }
}
