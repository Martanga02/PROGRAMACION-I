/*Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año y,
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de días correspondiente.
 */
public class ejercicio2 {
    public static void main (String[]args){
        int num=0;
        System.out.println("Ingrese un numero del 1 al 12(mes)");
        num=Utils.leerInt();
        switch(num){
            case 1,3,5,7,8,10,12:
            System.out.println("31 dias");
            break;
            case 4,6,9,11:
            System.out.println("30 dias");
            break;
            case 2:
            System.out.println("Ingrese un año: ");
            int anio=Utils.leerInt();
            if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                System.out.println("Bisisiesto, 29 dias");
            }
            else{
                System.out.println("28 dias");
            }
        }
    }
}
