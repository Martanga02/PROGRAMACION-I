/*Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y elimine la primera
ocurrencia de número en la fila indicada (un número igual) si
existe. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8 {
    static int MAXC=10,MAXF=5;  
    public static void main (String[]args){
        int[][]mat={{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("Ingrese un numero de fila"); int fila=ObtenerNumero();
        System.out.println("Ingrese un numero para buscar dentro de la fila"); int numero=ObtenerNumero();
        OrdenarArreglo(mat, fila);
        System.out.println("El arreglo ordenado es: ");ImprimirMat(mat);
        EsIgual(mat, numero, fila);
        OrdenarArreglo(mat, fila);
        System.out.println("El arreglo modificado y ordenado es: ");ImprimirMat(mat);
    }

    public static void EsIgual(int[][]mat,int numero,int fila){
        for(int i=0;i<MAXC-1;i++){
            if(mat[fila][i]==numero){
                CorrimientoIzquierda(mat,fila,i);
            }
        }
    }

    public static void CorrimientoIzquierda(int [][]mat,int fila,int columna){
        for(int i = columna;i<MAXC - 1 ;i++){
            mat[fila][i]=mat[fila][i+1];
        }
        mat[fila][MAXC-1]=0;
    }

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static void OrdenarArreglo(int [][]mat,int fila) {
        for (int i = 1; i < MAXC; i++) {
            int aux = mat[fila][i];
            int j = i - 1;
            while (j >= 0 && mat[fila][j] > aux) {
                mat[fila][j + 1] = mat[fila][j];
                j--;
            }
            mat[fila][j + 1] = aux;
        }
    }

    public static void ImprimirMat(int[][]mat){
        for(int i=0;i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
}
