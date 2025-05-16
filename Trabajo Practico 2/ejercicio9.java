/* Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante.
 */
public class ejercicio9 {
    public static void main (String[]args){
        char caracter='a';
        System.out.println("Ingrese un caracter");
        caracter=Utils.leerChar();
        while((caracter >='0' && caracter <='9')||(caracter>='a' && caracter<='z')){
            if(caracter>='0' && caracter<='9'){
                System.out.println("Carcater digito");
            }
            else if(caracter>='a' && caracter<='z'){
                System.out.println("Caracter letra minuscula");
                switch (caracter) {
                    case 'a','e','i','o','u':
                        System.out.println("vocal");
                        break;
                    default:
                    System.out.println("Consonante");
                        break;
                }
            }
        }
    }
}
