/*Hacer un programa que reemplace de un arreglo A todas las
ocurrencias de una secuencia patrón dada en un arreglo P, por la
secuencia contenida en el arreglo R de igual tamaño. */
public class ejercicio30 {
    public static final int MAX = 13, MAXP=3;
    public static final char SEPARADOR = ' ';

    public static void main(String[] args) {
        char[] A = {' ', 'a', 'b', 'c', ' ', 'd', 'e', 'f', ' ', 'a', 'b', 'c', ' '};
        char[] P = {'a', 'b', 'c'};
        char[] R = {'x', 'y', 'z'}; 
        ImprimirArreglo(A);
        ProcesarSecuencias(A, P,R);
        ImprimirArreglo(A);
    }

    public static void ProcesarSecuencias(char[] A, char[] P,char[]R) {
        int inicio = 0, fin = -1;
        while (inicio < MAX) {
            inicio = BuscarInicio(A, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(A, inicio);
                if (Esigual(A, P, inicio, fin)) {
                    for (int i = inicio; i <= fin; i++) {
                        CorrimientoIzquierda(A, inicio);
                    }
                }
                for(int i =inicio;i<=fin;i++){
                    CorrimientoDerecha(A, inicio, R);
                }
            }
            
        }
    }

    public static void CorrimientoDerecha(char[]A,int inicio,char[]R){
        int i = MAX-1;
        while(i>inicio){
            A[i]=A[i-1];
            i--;
            A[i]=R[i];
        }
    }

    public static void CorrimientoIzquierda(char[] A, int inicio) {
        while (inicio < MAX - 1) {
            A[inicio] = A[inicio + 1];
            inicio++;
        }
        A[MAX - 1] = SEPARADOR;
    }

    public static boolean Esigual(char[] A, char[] P, int inicio, int fin) {
        if (fin - inicio + 1 != MAXP) {
            return false;
        }
        for (int i = 0; i <MAXP; i++) {
            if (A[inicio + i] != P[i]) {
                return false;
            }
        }
        return true;
    }

    public static int BuscarInicio(char[] A, int pos) {
        while (pos < MAX && A[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(char[] A, int pos) {
        while (pos < MAX && A[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void ImprimirArreglo(char[] A) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + A[i] + "|");
        }
        System.out.println();
    }
}
