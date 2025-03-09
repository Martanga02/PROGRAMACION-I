/*Hay dos matrices MAT1 y MAT2 de secuencias de caracteres letras separados por espacios de tamaño MAXF x MAXC que
están precargadas. Ambas matrices están precargadas y cada fila empieza y termina con caracteres espacios. Además se tiene el
siguiente método:
Un método que retorna el índice inicial de la secuencia de mayor tamaño de un arreglo de secuencias (de caracteres
letras minúsculas separados por espacios) de tamaño MAXFIL.
Se pide realizar un programa que:
a. Contenga la definición de los encabezados de los métodos de carga de la matriz y del método mencionado en el
enunciado (se supone que existen y no se requiere implementarlos).
b. Para MAT1 y MAT2 elimine de cada secuencia el primer carácter vocal.
c. Para MAT1 agregue al principio de cada secuencia el primer carácter de la secuencia de mayor tamaño de dicha fila.
Considere agregar un espacio al final de la fila para mantener la estructura de secuencia delimitada por
separadores espacio.
d. En cada fila, si se verifica que la secuencia de mayor tamaño de la fila para MAT1 es mayor que la primera
secuencia en dicha fila para MAT2, las intercambie (la que está en MAT1 pasa a MAT2 y la que está en MAT2 pasa a
MAT1) sin usar estructuras auxiliares (otros arreglos o matrices).
e. Para un valor de fila ingresado por el usuario verifique e imprima si la primera secuencia de MAT1 en dicha fila es
igual a la primera secuencia de MAT2 en dicha fila. */
public class ejercicio16 {
    static int MAXF = 5, MAXC = 20, MAXFIL = 14; // MAXFIL representa la longitud del array

    public static void main(String[] args) {
        char[][] MAT1 = {
            {' ', 'e', ' ', 'l', 'c', 'h', ' ', 'n', 'g', ' ', ' ', ' ', 'w', ' '},
            {' ', 'b', ' ', 's', 'f', ' ', ' ', 'i', '!', 'o', ' ', 'd', 'h', ' '},
            {' ', 'i', 'c', ' ', 'n', 'u', 'f', ' ', 'b', ' ', ' ', 't', 'e', ' '},
            {' ', ' ', 'x', 'h', 'c', 'o', 'g', ' ', 'k', 'e', ' ', ' ', 'm', 'd'},
            {' ', 'e', ' ', 'l', 'c', 'h', ' ', 'r', 'f', 'o', ' ', 'u', 'a', ' '}
        };
        char[][] MAT2 = {
            {' ', 'a', ' ', 'm', 'e', 'h', ' ', 'n', 'h', ' ', ' ', ' ', 'i', ' '},
            {' ', 'c', ' ', 'z', 'j', ' ', ' ', 'i', '!', 'o', ' ', 's', 'k', ' '},
            {' ', 'e', 'c', ' ', 't', 'u', 'f', ' ', 'v', ' ', ' ', 'a', 'm', ' '},
            {' ', ' ', 'x', 'a', 'h', 'o', 'g', ' ', 'f', 'e', ' ', ' ', 'n', 'd'},
            {' ', 'i', ' ', 'f', 'h', 'h', ' ', 'r', 'd', 'o', ' ', 'd', 'y', ' '}
        };

        char[] arr = {' ', 'e', ' ', 'l', 'c', 'h', ' ', 'a', 'z', ' ', ' ', ' ', 'd', ' '};

        int inicioMayor = BuscarInicioSecuenciaMayor(arr, MAXFIL);

        System.out.println("El inicio de la mayor secuencia del arreglo es: " + inicioMayor);

        // PROCESO PARA MAT1 (Punto b)
        for (int fila = 0; fila < MAXF; fila++) {
            int inicio = 0, fin = -1;
            while (inicio < MAXC) {
                inicio = BuscarInicio(MAT1[fila], fin + 1);
                if (inicio < MAXC) {
                    fin = BuscarFin(MAT1[fila], inicio);
                    EliminarPrimeraVocal(MAT1[fila], inicio, fin);
                }
            }
        }

        // Imprimir resultado después del procesamiento de MAT1
        System.out.println("\nMatriz MAT1 después de eliminar la primera vocal en cada secuencia:");
        ImprimirMatriz(MAT1);
    }

    public static int BuscarInicioSecuenciaMayor(char[] arr, int maxFil) {
        int inicio = -1;
        int inicioMayor = -1;
        int maxLongitud = 0;
        int ini = 0;

        while (ini < maxFil) { 
            while (ini < maxFil && arr[ini] == ' ') {
                ini++;
            }
            if (ini < maxFil) {
                inicio = ini;
                int longitud = 0;
                while (ini < maxFil && arr[ini] != ' ') {
                    longitud++;
                    ini++;
                }
                if (longitud > maxLongitud) {
                    maxLongitud = longitud;
                    inicioMayor = inicio;
                }
            }
        }
        return inicioMayor;
    }
    public static void EliminarPrimeraVocal(char[] fila, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (EsVocal(fila[i])) {
                CorrimientoIzquierda(fila, i, fin);
                break; // Solo eliminamos la primera vocal encontrada en la secuencia
            }
        }
    }

    public static void CorrimientoIzquierda(char[] fila, int pos, int fin) {
        for (int i = pos; i < fin; i++) {
            fila[i] = fila[i + 1];
        }
        fila[fin] = ' '; // Se coloca un espacio al final para mantener la estructura
    }
    public static boolean EsVocal(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    
    public static int BuscarInicio(char[]fila,int ini){
        while(ini<MAXC && fila[ini]==' '){
            ini++;
        }
        return ini;
    }
    
    public static int BuscarFin(char[]fila,int ini){
        while(ini<MAXC && fila[ini]!=' '){
            ini++;
        }
        return ini-1;
    }

    public static void ImprimirMatriz(char[][]MAT1){
        for(int i=0;i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                System.out.print("|" + MAT1[i][j] + "|");
            }
            System.out.println(" ");
        }
    }

}

