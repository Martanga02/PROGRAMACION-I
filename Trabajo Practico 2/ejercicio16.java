/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron.
 */
public class ejercicio16 {
    public static void main (String[]args){
        char caracter='a';
        int contador=0;
        for(int i=0;i<15;i++){
            System.out.println("Ingrese una letra");
            caracter=Utils.leerChar();
            if(caracter=='a'){
            contador++;
            }
        }
        System.out.println("La cantidad de letras a fue: " + contador);
    }
}
