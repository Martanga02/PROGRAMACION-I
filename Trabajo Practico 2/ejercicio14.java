/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */
public class ejercicio14 {
    public static void main (String[]args){
        int numero=0;
        int contador=0;
        for(int i =0;i<10;i++){
            System.out.println("Ingrese 10 numero");
            numero=Utils.leerInt();
            if(numero%2==0){
                contador++;
            }
        }
        System.out.println("El total de numeros pares ingresados es de: " + contador);
       
    }
    
}
