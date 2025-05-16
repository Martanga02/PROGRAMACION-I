/*Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad.
 */
public class ejercicio11 {
    public static void main (String[]args){
        char caracter;
        int suma=0;
        System.out.println("Ingrese un caracter letra minuscula");
        caracter=Utils.leerChar();

        while(caracter>='a' && caracter<='z'){
            System.out.println("Ingrese un caracter letra minuscula");
            caracter=Utils.leerChar();
            if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                suma++;
            }
           
        }
        System.out.println("La cantidad de vocales fue: " + suma);
    }
}
