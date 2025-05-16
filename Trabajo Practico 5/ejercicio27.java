/*Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero. */
public class ejercicio27 {
    public static final int MAX=20,SEPARADOR=0;
    public static void main (String[]args){
        int[]arr={0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0, 8, 3, 1, 20, 22, 0, 7, 20, 0};
        System.out.println("Arreglo orignal:"); ImprimirArreglo(arr);
        procesarSecuencias(arr);
        System.out.println("Arreglo modificado:"); ImprimirArreglo(arr);

    }

    public static void procesarSecuencias(int[]arr){
        int inicio=0,fin=-1,tamanio=0;
        int numero=SolicitarNumero();
        while(inicio<MAX){
            inicio=BuscarInicio(arr, fin + 1);
            if(inicio<MAX){
                fin=BuscarFin(arr, inicio);
                tamanio=BuscarSecuenciasTamanio(arr, inicio, fin, numero);
                if(tamanio==numero){
                    for(int i = inicio;i<=fin;i++){
                        CorrimientoIzquierda(arr, inicio);
                    }
                }
            }
        }
    }
    public static void CorrimientoIzquierda(int[]arr,int inicio){
        while(inicio < MAX-1){
            arr[inicio]=arr[inicio+1];
            inicio++;
        }
        arr[MAX - 1] = 0; // siempre borramos la última posición
    }

    public static int BuscarSecuenciasTamanio(int[]arr,int inicio,int fin, int numero){
        int contador=0;
        for(int i = inicio; i<=fin; i++){
            contador++;
        }
        return contador;
    }

    public static int SolicitarNumero(){
        int numero=0;
        System.out.println("Ingrese un numero");
        numero=Utils.leerInt();
        return numero;
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
        return pos-1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}
