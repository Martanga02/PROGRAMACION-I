/*Pedir números enteros positivos por teclado. En cada iteración
el usuario puede ingresar 0 para salir del programa. Si ingresa un
número distinto de 0 se debe pedir el ingreso de un carácter.
a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.
b. Si es ‘b’ se deben pedir 5 números positivos e informar si
fueron ingresados en orden ascendente.
c. Si es ‘c’ se deben pedir dos números enteros negativos e
imprimir la raíz cuadrada de su multiplicación. La raíz
cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).
d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter. */
public class ejercicio20{
    public static void main (String[]args){
        int numero=0;
        char caracter='a';
        System.out.println("Ingrese un numero distinto de 0");
        numero=Utils.leerInt();
        while(numero!=0){
            System.out.println("Ingrese una letra(a-b-c)");
            caracter=Utils.leerChar();
            switch (caracter) {
                case 'a':
                    System.out.println("Ingrese un texto");
                    String texto=Utils.leerString();
                    System.out.println(texto);
                    break;
                case 'b':
                    System.out.println("Ingrese 5 numeros");
                    int num1=Utils.leerInt();
                    int num2=Utils.leerInt();
                    int num3=Utils.leerInt();
                    int num4=Utils.leerInt();
                    int num5=Utils.leerInt();
                    if(num1>num2 && num2>num3 && num3>num4 && num4>num5){
                        System.out.println("Fueron ingresados en orden ascendente");
                    }
                    else{
                        System.out.println("No fueron ingresados en orden ascendente");
                    }
                case 'c':
                System.out.println("Ingrese dos numeros enteros");
                int numerito=Utils.leerInt();
                int numerito2=Utils.leerInt();
                int multiplicación=numerito*numerito2;
                double raizC=Math.sqrt(multiplicación);
                System.out.println("La raiz cuadra de la multiplicacion es: " + raizC);
                default:
                System.out.println("Cacarcter incorrecto, ingrese nuevamente");
                System.out.println("Ingrese una letra(a-b-c)");
                caracter=Utils.leerChar();
                    break;
            }
        }
    }
}