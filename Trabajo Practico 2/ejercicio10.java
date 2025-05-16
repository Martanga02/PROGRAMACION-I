/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */
public class ejercicio10 {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        System.out.println("Ingrese un número entre 1 y 10 (otro para salir del ciclo):");
        numero = Utils.leerInt();

        while (numero >= 1 && numero <= 10) {
            suma += numero;

            System.out.println("Ingrese un número entre 1 y 10 (otro para salir del ciclo):");
            numero = Utils.leerInt();
        }

        System.out.println("La suma final es: " + suma);
    }
}
