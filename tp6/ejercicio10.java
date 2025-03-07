/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, permita obtener a través de
métodos la posición de inicio y la posición de fin de la secuencia
ubicada a partir de una posición entera y una fila, ambas
ingresadas por el usuario. Finalmente, si existen imprima por
pantalla ambas posiciones obtenidas. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    static int MAXF=5,MAXC=20;
    public static void main(String[] args) {
        int[][] mat = {
            {0, 5, 12, -3, 8, 0, 14, 7, 22, 0, 3, 9, 0, 16, -4, 11, 0, 25, 6, 0},
            {0, 2, 19, 5, -7, 0, 8, 33, 15, 0, 4, -1, 0, 12, 20, 9, 0, 17, 8, 0},
            {0, 9, 3, -5, 14, 0, 21, 6, 18, 0, 2, 11, 0, -8, 30, 7, 0, 19, 5, 0},
            {0, -4, 23, 8, 3, 0, 15, 5, -6, 0, 10, 14, 0, 11, 7, 22, 0, 13, 4, 0},
            {0, 7, 25, -2, 9, 0, 18, 6, 14, 0, 3, 12, 0, 19, 8, 5, 0, 21, -1, 0}
        };

        System.out.println("Ingrese una fila de la matriz (del 0 al 4):");
        int fila = ObtenerNumero();
        
        System.out.println("Ingrese una posición dentro de esa fila (del 0 al 19):");
        int posicion = ObtenerNumero();

        int inicio = 0, fin = -1;
        boolean encontrada = false;

        while (inicio < MAXC) {
            inicio = BuscarInicio(mat[fila], fin + 1);
            if (inicio < MAXC) {
                fin = BuscarFin(mat[fila], inicio);
                
                // Si la posición ingresada está en este rango, se encontró la secuencia
                if (posicion >= inicio && posicion <= fin) {
                    System.out.println("La secuencia se encuentra en la fila " + fila + 
                                       ", contiene la posición " + posicion + 
                                       ", inicia en " + inicio + 
                                       " y finaliza en " + fin);
                    encontrada = true;
                    break;
                }
            }
        }

        if (!encontrada) {
            System.out.println("No existe una secuencia que contenga la posición ingresada.");
        }
    }
    
    public static int BuscarInicio(int [] fila,int ini){
        while(ini<MAXC && fila [ini]==0){
            ini++;
        }
        return ini;
    }
    
    public static int BuscarFin(int [] fila,int ini){
        while(ini<MAXC && fila [ini]!=0){
            ini++;
        }
        return ini-1;
    }

    public static int ObtenerNumero(){
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
