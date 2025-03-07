/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio. */
public class ejercicio1{
    static int MAXF=5;
    static int MAXC=10;
    public static void main (String[]args){
        int[][]mat={{1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10},
                    {1,2,3,4,5,6,7,8,9,10}};
        System.out.println("La matriz original es: "); ImprimirMatriz(mat); 
        System.out.println("La matriz invertida es: ");InvertirOrden(mat);
    }
    public static void InvertirOrden(int[][]mat){
        for(int i=MAXF-1;i>=0;i--){
            for(int j=MAXC-1;j>=0;j--){
                
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
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