/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima. */
public class ejercicio2{
    static int MAXF=5;
    static int MAXC=10;
    public static void main (String[]args){
        int[][]mat={{1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10}};
        System.out.println("La matriz es: "); ImprimirMatriz(mat); 
        int contador=ObtenerParesa(mat);
        System.out.println("La cantidad de numeros pares en la matriz es: " + contador);
        
    }
    public static int ObtenerParesa(int[][]mat){
        int contador=0;
        for(int i=0;i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                if(mat[i][j]%2==0){
                    contador ++;
                }
            }
        }
        return contador;
    }
    

    public static void ImprimirMatriz(int[][]mat){
        for(int i=0;i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
}