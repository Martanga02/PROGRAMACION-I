/*1. La cadena de supermercados Carrefive ha pedido la refactorización del componente de software que usa para el
control de stock. El código original no estaba modularizado por lo tanto no era legible y no se aprovechaba la reutilización. Dado un
artículo (id y nombre), fecha y hora y una cantidad, el componente que maneja el stock genera los siguientes reportes:
a. Cuando la cantidad de unidades del artículo llega a un límite de seguridad (valor constante) se debe reportar (por
consola) los siguientes datos que deben ser enviados al proveedor de dicho artículo: ID_Producto, Nombre, Fecha y
Hora (ingresada por el usuario), Cantidad, Prioridad baja.
b. Cuando la cantidad de unidades está por debajo del límite de seguridad en más de un 30% se debe aumentar la
prioridad de baja a media y actualizar la cantidad, la fecha y la hora en el reporte.
c. Cuando la cantidad de unidades está por debajo del límite de seguridad en más de un 70% la prioridad cambia a alta y
se debe actualizar la cantidad, la fecha y la hora en el reporte.
d. Cuando la cantidad es cero se debe imprimir por consola un mensaje “No hay más unidades del producto” + ID_Producto
+ Nombre. También se debe actualizar la cantidad (0), la fecha y la hora en el reporte.
e. Si la cantidad vendida excede lo que hay en stock (definir un método getStock(id) que le consulte al usuario y retorne la
cantidad de stock del producto) se debe informar y no descontar del stock. Informar cuánto stock queda para
vender de ese producto. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track1{
    public static void main (String[]args){
        final int stock=10;
        VerificarStock(stock);
      
    }
    public static void VerificarStock(int stock){
        System.out.println("Ingrese el stock del producto: "); int stockI=getStockID();
        if(stockI==stock){
         System.out.println("Ingrese el ID del producto"); int ID_Producto=CompletarDatos();
         System.out.println("Ingrese el nombre del producto"); String Nombre=CompletarDatosC();
         System.out.println("Ingrese la fecha del producto"); int fecha=CompletarDatos();
         System.out.println("Ingrese la hora del producto"); int Hora=CompletarDatos();
         Imprimir(ID_Producto, fecha, Hora, Nombre);
        }
        else if(stockI!=0 && stockI%30<=stock){
         System.out.println("Aumento de prioridad a madia,actualice datos");
         System.out.println("Ingrese el ID del producto"); int ID_Producto=CompletarDatos();
         System.out.println("Ingrese el nombre del producto"); String Nombre=CompletarDatosC();
         System.out.println("Ingrese la fecha del producto"); int fecha=CompletarDatos();
         System.out.println("Ingrese la hora del producto"); int Hora=CompletarDatos();
        }
        else if(stockI!=0 && stockI%70<=stock){
         System.out.println("Aumento de prioridad a alta, actualice datos");
         System.out.println("Ingrese el ID del producto"); int ID_Producto=CompletarDatos();
         System.out.println("Ingrese el nombre del producto"); String Nombre=CompletarDatosC();
         System.out.println("Ingrese la fecha del producto"); int fecha=CompletarDatos();
         System.out.println("Ingrese la hora del producto"); int Hora=CompletarDatos();
        }
        else if(stockI==0){
         System.out.println("“ No hay más unidades del producto ”");
         System.out.println("Ingrese el ID del producto"); int ID_Producto=CompletarDatos();
         System.out.println("Ingrese el nombre del producto"); String Nombre=CompletarDatosC();
         System.out.println("Ingrese la fecha del producto"); int fecha=CompletarDatos();
         System.out.println("Ingrese la hora del producto"); int Hora=CompletarDatos();
         System.out.println("actualice el stock");  stockI=getStockID();
        }
        else if(stockI>stock){
         System.out.println("Informe el stock :" + " el stock es: " + stockI);;
        }
    }

    public static int CompletarDatos(){
        int num=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            num=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
           System.out.println(exc);
        }
        return num;
    }

    public static int getStockID(){
        int num=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            num=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
           System.out.println(exc);
        }
        return num;
    }

    public static String CompletarDatosC(){
        String phrase=" ";
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            phrase=entrada.readLine();
            
        } catch (Exception exc) {
           System.out.println(exc);
        }
        return phrase;
    }

    public static void Imprimir(int ID_Producto,int fecha, int hora, String nombre){
       
    }
}