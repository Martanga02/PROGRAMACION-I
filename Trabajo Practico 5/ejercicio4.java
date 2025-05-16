/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también. */
public class ejercicio4 {
    static int MAX=10;
    public static void main (String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int posicion=ObtenerElemento();
        BuscarElemento(arr, posicion);
    }
    public static int ObtenerElemento(){
        int numero=0;
        System.out.println("Ingrese un numero para buscar: ");
        numero=Utils.leerInt();
        return numero;
    }
    public static void BuscarElemento(int[]arr,int posicion){
        for(int i=0;i<MAX;i++){
            if(arr[i]==posicion){
                System.out.println("El elemento "+ posicion + " se encuentra en la posicion " + i);
            }
        }
    }
}

