/*Escribir un programa que pida se ingresen datos necesarios para
emitir una factura por la compra de dos artículos de librería (tipo
factura, número, nombre cliente, producto 1, importe 1, producto 2,
importe 2, importe total). */
public class ejercicio6 {
    public static void main (String[]args){
        char factura;
        int numero;
        String nombre;
        String producto1;
        String producto2;
        double importe1=0;
        double importe2=0;
        System.out.println("Ingrese el tipo de facura (LETRA)");
        factura=Utils.leerChar();
        System.out.println("Ingrese el numero de factura");
        numero=Utils.leerInt();
        System.out.println("Ingrese su nombre");
        nombre=Utils.leerString();
        System.out.println("Ingrese el producto 1");
        producto1=Utils.leerString();
        System.out.println("Ingrese el monto del producto 1 ");
        importe1=Utils.leerDouble();
        System.out.println("Ingrese el producto 2");
        producto2=Utils.leerString();
        System.out.println("Ingrese el monto del producto 2 ");
        importe2=Utils.leerDouble();
        double importeTotal=(importe1 + importe2);
        System.out.println("Factura: " + factura + " N " + numero + " Nombre: " + nombre + " Producto   Importe " + producto1 + importe1 + producto2 + importe2 + " Importe total: " + importeTotal);
    }
}
