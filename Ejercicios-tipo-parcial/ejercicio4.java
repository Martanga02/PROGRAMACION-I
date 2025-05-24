/*4. Ventas en supermercado online
Un reconocido supermercado de venta online ha decidido incorporar productos a modo de promoción en aquellos pedidos que cumplen con ciertos
requisitos. Cada producto está identificado con un valor numérico mayor a 0. Los pedidos recibidos se almacenan en un arreglo P de tamaño 
MAXP que comienza y finaliza con uno o más 0. Cada pedido está compuesto por una serie de productos y separados entre sí también por uno o
más 0. A modo de ejemplo, en el siguiente arreglo P, el primer pedido está compuesto por los productos 12, 9 y 18. En total hay 4 pedidos.
|0| 0| 12| 9| 18| 0| 15| 5| 4| 7| 10| 0| 8| 9| 12| 0| 19| 10| 9| 0| 0| 0| 0| 0| 0|
Se pide realizar un programa en Java que permita incorporar un producto promocionado R en aquellos pedidos que posean al menos uno de los 
productos almacenados en un arreglo T de tamaño MAXT (ordenado en forma ascendente). Debido a que solo se cuenta con una cantidad C del 
producto promocionado R, sólo serán incorporados en los primeros pedidos que cumplan con el requisito antes mencionado. La incorporación del 
producto se realiza al final del pedido. Continuando con el ejemplo, dado un arreglo T = {8, 9} con MAXT = 2, un producto promocionado R = 22 
y una cantidad C = 2, el arreglo resultante será:
|0| 0| 12| 9| 18| 22| 0| 15| 5| 4| 7| 10| 0| 8| 9| 12| 22| 0| 19| 10| 9| 0| 0| 0| 0|
Por último, se debe indicar cuántos productos R quedaron sin agregar a los pedidos. En dicho ejemplo noquedaron productos por agregar.*/
public class ejercicio4 {
    public static final int MAX=25,SEPARADOR=0, MAXT=2,R=22;
    public static void main (String[]args){
        int[]arr={0,0,12,9,18,0,15,5,4,7,10,0,8,9,12,0,19,10,9,0,0,0,0,0,0};
        int[]T={8,9};
        ImprimirArreglo(arr);
        ProcesarSecuencias(arr,T);
        ImprimirArreglo(arr);

    }

    public static void ProcesarSecuencias(int[]arr,int[]T){
        int inicio=0,fin=-1,C=2;
        while(inicio<MAX){
            inicio=BuscarInicio(arr, fin + 1);
            if(inicio<MAX){
                fin=BuscarFin(arr, inicio);
                if(ExisteProducto(inicio, fin, arr, T) && C>0){
                    CorrimientoDerecha(arr, fin);
                    C--;
                }
            }
        }
    }

    public static void CorrimientoDerecha(int[]arr,int fin){
        int i = MAX-1;
        while(i>fin + 1){ // CAMBIAMOS I>=FIN POR I> FIN + 1 PARA NO PISAR DATO Y QUE R SE INSERTE AL FINAL DE LA SECUENCIA
            arr[i]=arr[i-1];
            i--;
        }
        arr[fin + 1]=R;
    }

    public static boolean ExisteProducto(int inicio,int fin, int[]arr, int[]T ){
        for(int i = inicio;i<=fin;i++){
            for(int j =0; j<MAXT; j++){
                if(arr[i]==T[j]){
                    return true;
                }
            }
        }
        return false;
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
