/*1. Compresión de imagen
Un dispositivo que toma imágenes de un fenómeno natural está corriendo sobre una plataforma tecnológica con recursos limitados.
Cada imagen (representada por una matriz de NxM) está compuesta por píxeles con valores entre 0 y 255. Se desea implementar un algoritmo de 
compresión que comprima aquellas porciones de la imagen distintas del color negro (0 en la escala de valores del pixel). 
Se debe implementar la solución para un arreglo (luego dicha solución se reutilizará en un futuro para cada fila de la matriz). 
Para ello, se pide realizar un programa en JAVA que, dado un arreglo de tamaño M, para cada secuencia delimitada por uno o mas pixeles de color 
negro (valor 0) con más de X repeticiones de un valor de píxel (todos los elementos de la secuencia deben ser iguales), comprima la secuencia 
poniendo en la primera posición el valor negado de la cantidad de ocurrencias y a continuación el valor del pixel que se repite. 
El arreglo empieza y termina con un separador 0 (color negro). Implementar usando las buenas prácticas de programación estructurada vistas en
la cátedra. Ejemplo: Arreglo que tiene una fila de la imagen:
|0| 67| 67| 67| 67| 67| 67| 67| 67| 0 |14| 0| 33| 33| 33| 33| 0 |5 |98| 0|
El arreglo quedaría de la siguiente forma, para un X=3:
|0| -8| 67| 0 |14| 0| -4 |33| 0| 5| 98| 0| 0| 0| 0| 0| 0| 0| 0| 0|
 */
public class ejercicio1 {
    public static final int MAX=20, SEPARADOR=0, X=3;
    public static void main (String[]args){
        int[]arr={0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,33,0,5,98,0};
        ImprimirArreglo(arr);
        ProcesarSecuencias(arr);
        ImprimirArreglo(arr);

    }

    public static void ProcesarSecuencias(int[] arr) {
        int inicio = 0, fin = -1;
        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                if (Repeticiones(arr, inicio, fin)) {
                    Insertar(arr, inicio, fin);
                    // borrar los valores repetidos originales desplazando a la izquierda
                    for (int i = 0; i < (fin - inicio + 1); i++) {
                        CorrimientoIzquierda(arr, inicio + 2);
                    }
                    fin = inicio + 1; // porque insertamos 2 valores
                }
            }
        }
    }

    public static void CorrimientoIzquierda(int[]arr,int inicio){
        while(inicio < MAX-1){
            arr[inicio]=arr[inicio + 1];
            inicio++;
        }
        arr[MAX-1]=0;
    }

    public static void CorrimientoDerecha(int[] arr, int inicio, int cantidad) {
        for (int i = MAX - 1 - cantidad; i >= inicio; i--) {
            arr[i + cantidad] = arr[i];
        }
    }

    public static void Insertar(int[] arr, int inicio, int fin) {
        int cantidad = fin - inicio + 1;
        int valor = arr[inicio];
        CorrimientoDerecha(arr, inicio, 2); //estamos haciendo espacio para dos elementos nuevos (el -cantidad y el valor),
        arr[inicio] = -cantidad;
        arr[inicio + 1] = valor;
    }

    public static boolean Repeticiones(int[]arr,int inicio, int fin){
        int contador=0;
        for(int i = inicio;i<=fin;i++){
            if(arr[i]==arr[i + 1]){
                contador++;
            }
        }
        if(contador>=X){
            return true;
        }
        else return false;
    }

    public static int BuscarInicio(int[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos - 1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
