/*Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números.
 */
public class ejercicio8 {
    public static void main (String[]args){
        System.out.println("Ingrese dos numeros y un caracter");
        int num1=SolicitarNumero();
        int num2=SolicitarNumero();
        char caracter=SolicitarCaracter();
        switch (caracter) {
            case 'a':
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case 'b':
            System.out.println("El resultado es: " + (num1 - num2));
                break;
            case 'c':
            System.out.println("El resultado es: " + (num1 * num2));
                break;
            case 'd':
            System.out.println("El resultado es: " + (num1 / num2));
                break;
        
            default:
            System.out.println("Caracter incorrecto");
                break;
        }
    }
    public static int SolicitarNumero(){
        int num=0;
        System.out.println("Ingrese un numero");
        num=Utils.leerInt();
        return num;
    }
    public static char SolicitarCaracter(){
        char caracter='a';
        System.out.println("Ingrese un caracter");
        caracter=Utils.leerChar();
        return caracter;
    }
}
