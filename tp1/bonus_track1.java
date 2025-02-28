/*1. La cadena de supermercados Carrefive debe imprimir el
encabezado del ticket de compra de los clientes con cierto formato
para cumplir las exigencias de la Administración Federal de
Ingresos PRIVADOS. En el mismo, debe figurar la fecha y hora,
número de ticket, CUIT, nombre del cajero, número de caja, dni
del cliente y la leyenda “El precio lo pone el cliente”. Un ejemplo
se muestra a continuación:
—-----------------------------------------------------------------
04/04/23 - 18:55 Ticket Nro. 3455674

CUIT: 99-34567833-9

Cajero: Luis Mercado Caja: 8
DNI: 33.333.333 “El precio lo pone el cliente”
—-----------------------------------------------------------------
Escribir un programa con declaración de constantes y variables
que pida al usuario el ingreso de los datos necesarios para
imprimir el encabezado del ticket. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track1 {
    public static void main (String[]args){
        int dia=0;
        int mes=0;
        int anio=0;
        int hora=0;
        int minutos=0;
        int ticket=0;
        int cuit=0;
        String cajero;
        int caja=0;
        int dni=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese El dia, el mes y el año:");
            dia = Integer.valueOf(entrada.readLine());
            mes = Integer.valueOf(entrada.readLine());
            anio = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese la hora y los minutos:");
            hora = Integer.valueOf(entrada.readLine());
            minutos = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el numero de ticket():");
            ticket = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su cuit:");
            cuit = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el nombre de cajero: ");
            cajero = entrada.readLine();
            
            System.out.println("Ingrese el numero de caja:");
            caja = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el numero de dni:");
            dni = Integer.valueOf(entrada.readLine());

            System.out.println(" " + dia + "/" + mes + "/" + anio + " - " + hora + ":" + minutos + " Ticket Nro. " + ticket );
            System.out.println("CUIT: " + cuit);
            System.out.println("Cajero: " + cajero + " caja: " + caja);
            System.out.println("DNI: " + dni + " 'El precio lo pone el cliente'");



        } catch (Exception exc) { // Se ejecuta si ocurre algún error de lectura
            System.out.println(exc);
        }
        
    }
    
}
