/*Escribir un programa que solicite nombre, edad, altura y ocupación, y
los imprima por pantalla.
 */
public class ejercicio5 {
    public static void main (String[]args){
        String nombre=" ";
        int edad =0;
        double altura=0;
        String ocupacion=" ";
        System.out.println("Ingrese nombre,edad, altura, ocupacion: ");
        nombre=Utils.leerString();
        edad=Utils.leerInt();
        altura=Utils.leerDouble();
        ocupacion=Utils.leerString();
        System.out.println("nombre: " + nombre + " edad: " + edad + " altura: " + altura + " ocupacion: " + ocupacion);
    }
}
