/* Análisis de Sismos
Un sismógrafo ubicado en la ciudad de Mendoza, Argentina, registró una fuerte actividad sísmica en los
últimos días. Los datos están en escala de Richter, y están representados en el siguiente arreglo:
|0 |2.1| 1.5 |4.1 |0 |3.4 |0 |2.5| 3.0| 0| 3.8 |0 |2.7| 2.7| 3.9| 2.5| 0| 4.2 |2.0| 0| 0|
Cada día de actividad sísmica está separado por un cero. Cada secuencia representa qué sismos hubo en
esa jornada. Entonces, con la información provista, se pide:
Determinar si en periodo registrado, existió un día donde hubo un número N mínimo de temblores y cuyo
promedio diario fuese superior a M en la escala de Richter. Por ejemplo, si N=2 y M=2.6, existió dicho día
dado que la 3ra secuencia (2.5, 3.0) cumple con lo buscado.*/
public class ejercicio8{
    public static final int MAX=21, SEPARADOR=0, N=2; 
    public static final double M=2.6;   
    public static void main (String[]args){
        double[]arr={0, 2.1, 1.5, 4.1, 0, 3.4, 0, 2.5, 3.0, 0, 3.8, 0, 2.7, 2.7, 3.9, 2.5, 0, 4.2, 2.0, 0,0};
        ImprimirArreglo(arr);
        ProcesarSecuencias(arr);
        ImprimirArreglo(arr);

    }
    public static void  ProcesarSecuencias(double[]arr){
        int inicio=0, fin=-1;
        while(inicio<MAX){
            inicio=BuscarInicio(arr, fin + 1);
            if(inicio<MAX){
                fin=BuscarFin(arr, inicio);
                if (TamanioSecuencia(arr,inicio,fin)){
                    System.out.println("Secuencia entre posiciones " + inicio + " y " + fin + " cumple con los criterios y será eliminada.");
                    for(int i =inicio;i<=fin;i++){
                        CorrimientoIzquierda(arr, inicio);
                    }
                    fin=inicio-1;
                }
                
            }

        }
    }
    public static void CorrimientoIzquierda(double[]arr,int inicio){
        while (inicio< MAX-1) {
            arr[inicio]=arr[inicio+1];
            inicio++;
        }
        arr[MAX-1]=0;
    }
    public static boolean TamanioSecuencia(double[]arr,int inicio,int fin){
        int tamanio = fin - inicio + 1;
        double suma=0;
        int contador=0;
        for(int i = inicio; i<=fin;i++){
            suma+=arr[i];
            contador++;
        }
        double promedio=suma/contador;
        if(tamanio>=N && promedio>M){
            return true;
        }
        return false;
    }
    
    public static int BuscarInicio(double[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(double[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos - 1;
    }

    public static void ImprimirArreglo(double[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|"+ arr[i] + "|");
        }
        System.out.println(" ");
    }
}