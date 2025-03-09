/*Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada elimine todas las secuencias que
tienen orden descendente entre sus elementos. */
public class ejercicio15 {
    static int MAXC=20,MAXF=5;
    public static void main (String[]args){
        int[][]mat={
            {0, 55, 12, 8, 2, 0, 14, 7, 22, 0, 3, 9, 0, 16, -4, 11, 0, 25, 6, 0},
            {0, 20, 19, 15, -7, 0, 8, 33, 15, 0, 4, -1, 0, 12, 20, 9, 0, 17, 8, 0},
            {0, 9, 3, -5, 14, 0, 21, 6, 18, 0, 2, 11, 0, -8, 30, 7, 0, 19, 5, 0},
            {0, -4, 23, 8, 3, 0, 15, 5, -6, 0, 10, 14, 0, 11, 7, 22, 0, 13, 4, 0},
            {0, 7, 25, -2, 9, 0, 18, 6, 14, 0, 3, 12, 0, 19, 8, 5, 0, 21, -1, 0}
        };
        for(int fila=0; fila< MAXF; fila++){
            int inicio=0,fin=-1;
            while (inicio < MAXC) {
                inicio = BuscarInicio(mat[fila], fin + 1);
                if (inicio < MAXC) {
                    fin = BuscarFin(mat[fila], inicio);
                    if (Deciende(mat[fila], inicio, fin)) {
                        fin = inicio - 1; // Retrocede para volver a verificar después de eliminar
                    }
                }
            }
        }            
        ImprimirMatriz(mat);
    }
    public static boolean Deciende(int[] fila, int inicio, int fin) {
        for (int i = inicio; i < fin; i++) {
            if (fila[i] < fila[i + 1]) {
                return false; // No es descendente
            }
        }
        CorrimientoIzquierda(fila, inicio, fin);
        return true;
    }
    
    public static void CorrimientoIzquierda(int[]fila,int inicio,int fin){
        int cantidad = fin - inicio + 1;
        for (int i = inicio; i < MAXC - cantidad; i++) {
            fila[i] = fila[i + cantidad];
        }
        // Llenar con ceros los espacios sobrantes
        for (int i = MAXC - cantidad; i < MAXC; i++) {
            fila[i] = 0;
        }
    }

    public static int BuscarInicio(int[]fila,int ini){
        while(ini<MAXC && fila[ini]==0){
            ini++;
        }
        return ini;
    }

    public static int BuscarFin(int[]fila,int ini){
        while(ini<MAXC && fila[ini]!=0){
            ini++;
        }
        return ini -1;
    }

    public static void ImprimirMatriz(int[][] mat) {
        for (int i = 0; i < MAXF; i++) {
            for (int j = 0; j < MAXC; j++) {
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println();
        }
    }
}
