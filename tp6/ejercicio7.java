/*Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y luego inserte el
número en la matriz en la fila indicada manteniendo su orden. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
    static int MAXC=10,MAXF=5;
    public static void main (String[]args){
        int[][]mat={{1,2,1,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("Matriz original: "); ImprimirMat(mat);
        System.out.println("Ingrese un numero para insertar: "); int numero=SolicitarNumero();
        System.out.println("Ingrese una posicion de fila: "); int fila=SolicitarNumero();
        OrdenarArreglo(mat,fila);
        corrimientoDerecha(mat, fila, numero);
        System.out.println("Matriz modificadal: "); ImprimirMat(mat);

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

    public static void corrimientoDerecha(int[][]mat,int fila,int numero){
        int pos = 0;
        
        // Encontrar la posición donde insertar
        while (pos < MAXC - 1 && mat[fila][pos] < numero) {
            pos++;
        }
        for(int i= MAXC-1;i>=pos;i++){
            mat[fila][pos]=numero;
        }
    }
    public static void ImprimirMat(int[][]mat){
        for(int i =0; i<MAXF;i++){
            for(int j =0;j<MAXC;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
    public static int SolicitarNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            numero= Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
