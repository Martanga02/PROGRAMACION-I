/*Escribir un programa que mientras que el usuario ingrese un
número entero natural, llame a un método que calcule la
sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
1+2+3+4+5=15) y retorne el resultado.
 */
public class ejercicio15 {
    public static void main (String[]args){
        int numero=ObtenerNumero();
        if(numero>=0){
            Sumatoria(numero);
        }
    }
    public static void Sumatoria(int numero){
        int contador=0;
        for(int i=1;i<=numero;i++){
            contador+=i;
        }
        System.out.println("La sumatoria es: " + contador);
    }
    public static int ObtenerNumero(){
        System.out.println("Ingrese un numero");
        int num=Utils.leerInt();
        return num;
    }
}
