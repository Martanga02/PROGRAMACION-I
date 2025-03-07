/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y una posición fila, columna. Con estos datos tendrá que
realizar un corrimiento a derecha (se pierde el último valor en
dicha fila) y colocar el número en la matriz en la posición fila,
columna indicada. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4 {
    static int MAXC=10,MAXF=5;
    public static void main (String[]args){
        int[][]mat={{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("Matriz original: "); ImprimirMat(mat);
        System.out.println("Ingrese un numero para insertar: "); int numero=SolicitarNumero();
        System.out.println("Ingrese una posicion de fila: "); int fila=SolicitarNumero();
        System.out.println("Ingrese una posicion de columna: "); int columna=SolicitarNumero();
        corrimientoDerecha(mat, numero, fila, columna);
        System.out.println("Matriz modificada: "); ImprimirMat(mat);
        
    }

    public static void corrimientoDerecha(int[][]mat,int numero,int fila,int columna){
            for (int i =MAXC-1 ; i < columna ; i++) {
                mat[fila][i] = mat[fila][i + 1];
            }
            mat[fila][columna] = numero; // Inserto el numero
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

    public static void ImprimirMat(int[][]mat){
        for(int i =0; i<MAXF;i++){
            for(int j =0;j<MAXC;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
}
