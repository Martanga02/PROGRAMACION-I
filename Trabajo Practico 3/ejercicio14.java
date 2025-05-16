/*Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante.
 */
public class ejercicio14 {
    public static void main (String[]args){
        char caracter=ObtenerCaracter();
        while (caracter!='*') {
            Verificar(caracter);
            break;
        }
    }

    public static void Verificar(char caracter){
        if(caracter>='0' && caracter<='9'){
            System.out.println("Es caracter digito");
        }
        else if( caracter>='a' && caracter<='z'){
            System.out.println("Es caracter letra minuscula");
            switch (caracter) {
                case 'a','e','i','o','u':
                    System.out.println("Caracter vocal");
                    break;
            
                default:
                System.out.println("Caracter consonante");
                    break;
            }
        }
    }

    public static char ObtenerCaracter(){
        char caracter='a';
        System.out.println("Ingrese un caracter (* para terminar)");
        caracter=Utils.leerChar();
        return caracter;
    }
}
