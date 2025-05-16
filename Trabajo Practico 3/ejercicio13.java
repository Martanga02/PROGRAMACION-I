/*Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
Observación: La raíz cuadrada de un número se calcula con la
sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
y de la modularización para la solución. Tener en cuenta posibles
errores o excepciones como la división por cero. */
public class ejercicio13 {
    public static void main (String[]args){
        int num=0;
        int numerazo1,numerazo2,numerazo3=0;
        System.out.println("Ingrese un numero entre 1 y 4");
        num=Utils.leerInt();
        System.out.println("Ahora ingrese tres numeros para operar con ellos");
        numerazo1=Utils.leerInt();
        numerazo2=Utils.leerInt();
        numerazo3=Utils.leerInt();
        switch (num) {
            case 1:
                double raiz= CalcularRaizCuadrada(numerazo1,numerazo3);
                System.out.println("La raiz cuadra de multiplicar: " + numerazo1 + " y " + numerazo3 + " es: " + raiz);
                break;
            case 2:
                double promedio= CalcularPromedio(numerazo1,numerazo2,numerazo3);
                System.out.println("El promedio de sumar: " + numerazo1 + " + " + numerazo2+ " + " + numerazo3 + " es: " + promedio);
                break;
            case 3:
                double cociente= CalcularCociente(numerazo1,numerazo2,numerazo3);
                System.out.println("El cociente de la raíz cuadrada de (r3 - r2) dividida por r1 es : " + cociente);
                break;
            case 4:
                double division= CalcularCocientito(numerazo1,numerazo2,numerazo3);
                System.out.println("el cociente del promedio de los tres valores dividido por la raíz cuadrada de r2 es: " + division);
                break;
        
            default:
                System.out.println("El numero Ingresado no es correcto, ingrese de nuevo porfavor");
                System.out.println("Ingrese un numero entre 1 y 4");
                num=Utils.leerInt();
                break;
        }
    }
    public static double CalcularRaizCuadrada(int numerazo1,int numerazo3){
        double raiz=0;
        int resta=numerazo1 - numerazo3;
        raiz=Math.sqrt(resta);
        return raiz;
    }
    public static double CalcularPromedio(int numerazo1,int numerazo2,int numerazo3){
        double promedio=0;
        int suma=numerazo1 + numerazo2 + numerazo3;
        promedio=(suma/3);
        return promedio;
    }
    public static double CalcularCociente(int numerazo1,int numerazo2,int numerazo3){
        double cociente=0;
        double raiz=0;
        int resta=numerazo3 - numerazo2;
        raiz=Math.sqrt(resta);
        cociente=(raiz/numerazo1);
        return cociente;
    }
    public static double CalcularCocientito(int numerazo1,int numerazo2,int numerazo3){
        double raiz=0;
        double promedio=0;
        double division=0;
        promedio=(numerazo1 + numerazo2 + numerazo3);
        raiz=Math.sqrt(numerazo2);
        division=(promedio/raiz);
        return division;
    }
}
