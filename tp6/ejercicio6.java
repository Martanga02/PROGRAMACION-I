/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y elimine todas las ocurrencia de número en la matriz si
existe. Mientras exista (en cada iteración tiene que buscar la
posición fila y columna) tendrá que usar dicha posición para
realizar un corrimiento a izquierda (quedarán tantas copias de la
última posición de cada fila como cantidad de ocurrencias del
número). Tener en cuenta, como se hizo en arreglos, si el
elemento a eliminar es el último de alguna fila de la matriz. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6 {
    static int MAXC=10, MAXF=5;
    public static void main (String[]args){
        int[][]mat={{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("Matriz original: ");ImprimirMatriz(mat);
        int numero=SolicitarNumero();
        while(EsIgual(mat, numero)){
            System.out.println("Matriz modificada: "); ImprimirMatriz(mat);
        }
        
        
    }

    public static boolean EsIgual(int[][]mat,int numero){
        for(int i =0;i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                if(mat[i][j]==numero){
                    CorrimientoIzquierda(mat, i, j); // Realizamos el corrimiento a izquierda si encontramos el número
                    return true; // Terminamos la búsqueda después de realizar el corrimiento
                }
            }
        }
        return false;
    }
    public static void CorrimientoIzquierda(int[][] mat, int fila, int columna) {
        for (int i = columna; i < MAXC - 1; i++) {
            mat[fila][i] = mat[fila][i + 1];
        }
        mat[fila][MAXC - 1] = 0; // Asignamos cero al último elemento de la fila
    }

    public static int SolicitarNumero(){
        int numero=0;
        try {
            BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
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
