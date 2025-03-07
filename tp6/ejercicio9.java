/*Hacer un programa que dada una matriz de enteros de tamaño
4*5 que se encuentra precargada, solicite al usuario el ingreso de
una fila y dos números enteros (columnas de la matriz), y ordene
de forma creciente la matriz en la fila indicada entre las dos
posiciones columnas ingresadas. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9{
    static int MAXF=5, MAXC=10;
    public static void main (String[]args){
        int[][]mat={{1,2,3,10,11,6,7,1,2,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("La matriz original es: "); ImprimirMatriz(mat);
        System.out.println("Ingrese una fila"); int fila = ObtenerNumero();
        System.out.println("Ingrese un numero:"); int num1 = ObtenerNumero();
        System.out.println("Ingrese un numero:"); int num2 = ObtenerNumero();
        OrdenarArreglo(mat, fila, num1, num2);
        System.out.println("La matriz modificada es: "); ImprimirMatriz(mat);


    }

    public static void OrdenarArreglo(int [][]mat,int fila,int num1,int num2) {
        for (int i = num1-1; i < num2; i++) {
            int aux = mat[fila][i];
            int j = i - 1;
            while (j >= 0 && mat[fila][j] > aux) {
                mat[fila][j + 1] = mat[fila][j];
                j--;
            }
            mat[fila][j + 1] = aux;
        }
    }

    public static int ObtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    
    public static void ImprimirMatriz(int[][]mat){
        for(int i =0; i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
}