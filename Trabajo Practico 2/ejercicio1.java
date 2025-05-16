/*Escribir un programa completo (declaración de constantes y
variables, carga de datos, procesamiento e impresión de
resultados) para cada caso o ítem que:
a. solicite un número e indique si es positivo o negativo.
b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
c. solicite un número del 1 al 7 e imprima el día de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden */
public class ejercicio1 {
    public static void main (String[]args){
        int num1=0;
        System.out.println("Ingrese un numero");
        num1=Utils.leerInt();
        if(num1>=0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }
        int num2=0;
        System.out.println("Ingrese un numero");
        num2=Utils.leerInt();
        if(num2>=100){
            System.out.println("Grande");
        }
        else{
            System.out.println("Chico");
        }
        char letra='a';
        System.out.println("Ingrese una letra");
        letra=Utils.leerChar();
        switch(letra){
            case 'a','e','i','o','u':
            System.out.println("Vocal");break;
            default:
            System.out.println("Consonante");
        }
        int num3,num4,num5=0;
        System.out.println("Ingrese tres numeros");
        num3=Utils.leerInt();
        num4=Utils.leerInt();
        num5=Utils.leerInt();
        if(num3<num4 && num4<num5){
            System.out.println("Creciente");
        }
        else{
            System.out.println("Decreciente");
        }
        
    }
}
