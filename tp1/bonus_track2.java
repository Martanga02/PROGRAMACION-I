/*En Carrefive, los días martes y jueves hay “PROMO”. En los días
martes, si el importe total de la compra supera los $13.000 el
descuento es del 5%, pero si supera los $20.000 es del 7.5%. Los
jueves, en cambio, el descuento es para todos los tickets cuyo
importe supere los $25.000 y será el 10% con un tope de reintegro
de $3.000 por ticket. Escribir un programa que dado el día de la
semana que se hace la compra y el importe del ticket, verifique si
aplica hacer el descuento o no. Puede suponer un dato numérico
para cada día, ejemplo: 1 para el martes y 2 para el jueves. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track2 {
    public static void main (String[]args){
      boolean promo=false;
      int importe=0;
      int dia=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el dia de la semana (martes=1 o jueves=2):");
            dia = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el importe gastado:");
            importe = Integer.valueOf(entrada.readLine());

            promo=((dia==1 && importe>=13000) || (dia==2 && importe>=25000));
            System.out.println("El dia de la promo fue: " + promo );

        } catch (Exception exc) { // Se ejecuta si ocurre algún error de lectura
            System.out.println(exc);
        }
        
    }
    
}
