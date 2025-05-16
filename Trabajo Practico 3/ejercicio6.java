/*Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9.
 */
public class ejercicio6 {
   public static void main (String[]args){
    char caracter='a';
    System.out.println("Ingrese un caracter letra minuscula");
    caracter=Utils.leerChar();
    if(caracter>='a'&& caracter<='z'){
        Tabla();
    }
   } 
   public static void Tabla(){
    for(int i=1;i<=10;i++){
        System.out.println("9 * " + i + " es : " + (9*i));
    }
   }
}
