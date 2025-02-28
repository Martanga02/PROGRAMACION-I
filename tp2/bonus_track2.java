/* La cadena de supermercados carrefive desea aplicar descuentos según el día que se realiza la compra:
a. Los días martes, si el importe total de la compra supera los $13.000 el descuento es del 5%, pero si supera los $20.000
es del 7.5%.
b. Los jueves, en cambio, el descuento es para todos los tickets cuyo importe supere los $25.000 y será el 10% con
un tope de reintegro de $3.000 por ticket.
c. Si es viernes o sábado, si el número de ticket es par y el importe es a lo sumo de $15.000 se le aplicará un descuento del 8% 
si el DNI es par.
Escribir un programa que dado el día, solicite al usuario los restantes datos para calcular los descuentos en cada caso y lo
aplique sobre el valor final a pagar. Debe informar el importe final a pagar en cada caso.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track2 {
    public static void main(String[]args){
        String dia =" ";
        int monto=0;
        double descuento=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un dia de la semana: ");
            dia= entrada.readLine();
            System.out.println("Ingrese el monto gastado en el dia: ");
            monto= Integer.valueOf(entrada.readLine());
            switch (dia) {
                case "martes":
                if(monto>=13000 && monto<=20000){
                    descuento=(((monto*5)/100) + monto);
                }
                else if (monto>=20000){
                    descuento=(((monto*7.5)/100) + monto);
                }
                System.out.println("El monto gastado fue: " + monto + " y con el descuento aplicado, el monto final es de : " + descuento);
                break;
                case "jueves":
                if(monto>=25000){
                    descuento=(((monto*10)/100) + monto);
                }
                System.out.println("El monto gastado fue: " + monto + " y con el descuento aplicado, el monto final es de : " + descuento);
                break;
                case "viernes","sabado":
                System.out.println("Ingrese el numero de ticket: ");
                int ticket= Integer.valueOf(entrada.readLine());
                System.out.println("Ingrese el numero de dni del cliente: ");
                int dni= Integer.valueOf(entrada.readLine());
                if(dni%2==0 && ticket%2==0 && monto>=15000 ){
                    descuento=(((monto*8)/100) + monto);
                    System.out.println("El monto gastado fue: " + monto + " y con el descuento aplicado, el monto final es de : " + descuento);
                }
                break;
                default:
                System.out.println("El dia ingresado no cuenta con descuentos");
                    break;
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
