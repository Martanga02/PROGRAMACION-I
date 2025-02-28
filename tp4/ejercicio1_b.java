/*Escribir un programa que pida se ingresen datos necesarios para
emitir una factura por la compra de dos artículos de librería (
factura, número, nombre cliente, producto 1, importe 1, producto
importe 2, importe total). Como salida debe imprimir por pantalla la
factura en un formato similar al del siguiente ejemplo:
Factura C N 249
Nombre: Juan Perez
Producto Importe
Lápiz 15.5
Papel 20.6
Importe total 36.1 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_b {
    public static void main (String[]args){
        char factura; System.out.println("Todas las variables estan inicializadas en 0");
        int numero;
        String nombre;
        String producto1;
        String producto2;
        double importe1=0;
        double importe2=0;
       
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el tipo de facura (LETRA)");
            factura=entrada.readLine().charAt(0);
            System.out.println("Ingrese el numero de factura");
            numero=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su nombre");
            nombre=entrada.readLine();
            System.out.println("Ingrese el producto 1");
            producto1=entrada.readLine();
            System.out.println("Ingrese el monto del producto 1 ");
            importe1=Double.valueOf(entrada.readLine());
            System.out.println("Ingrese el producto 2");
            producto2=entrada.readLine();
            System.out.println("Ingrese el monto del producto 2 ");
            importe2=Double.valueOf(entrada.readLine());
            double importeTotal=(importe1 + importe2);
            System.out.println("Factura: " + factura + " N " + numero + " Nombre: " + nombre + " Producto   Importe " + producto1 + importe1 + producto2 + importe2 + " Importe total: " + importeTotal);
            System.out.println("El valor de las variables cambia: " + factura + numero + nombre + producto1 + "etc..");
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
        
    }
}

// Paso        Variable Importe1| Variable Importe2|  Variable Producto1| Variable Producto2| Variable nombre| Variable numero
// Inicio             0                  0                    0                    0                  0               0
// Iteracion 1        n                  n                    n                    n                  n               n
