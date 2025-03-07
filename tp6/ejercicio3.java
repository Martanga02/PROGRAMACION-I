/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3 {
    static int MAXF=5;
    static int MAXC=10;
    public static void main (String[]args){
        int[][]mat={{1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10}};
        int fila= ObtenerNumero();
        int columna= ObtenerNumero();
        System.out.println("La matriz orignal es: "); ImprimirMatriz(mat); 
        CorrimientoIzquierda(mat, fila, columna);
        System.out.println("La matriz modificada es: "); ImprimirMatriz(mat); 

    }

    public static void CorrimientoIzquierda(int[][] mat, int fila, int columna) {
        for (int i = columna; i < MAXC - 1; i++) {
            mat[fila][i] = mat[fila][i + 1];
        }
        mat[fila][MAXC - 1] = 0; // Última posición a 0 después del corrimiento
    }
    

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una posicion (fila y columna)");
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
