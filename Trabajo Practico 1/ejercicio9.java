/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no.
 */
    public class ejercicio9 {
        public static void main (String[]args){
            int numero=0;
            System.out.println("Ingrese un numero");
            numero=Utils.leerInt();
            int result1=numero/2;
            int result2=numero/3;
            int result3=numero/4;
            System.out.println("El resultado de dividir " + numero + " a 2 es " + result1);
            System.out.println("El resultado de dividir " + numero + " a 3 es " + result2);
            System.out.println("El resultado de dividir " + numero + " a 4 es " + result3);
        }
    
    }
