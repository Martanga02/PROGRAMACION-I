/*Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2024 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente.
 */
public class ejercicio19 {
    public static void main (String[]args){
        int numero=0;
        int anio=0;
        System.out.println("Ingrese un numero de mes valido(del 1 al 12)");
        numero=Utils.leerInt();
        while (numero>=1 && numero<=12) {
            switch (numero) {
                case 1,3,5,7,8,10,12:
                    System.out.println("31 dias");
                    break;
                case 4,6,9,11:
                    System.out.println("20 dias");
                    break;
                case 2:
                System.out.println("Ingrese un año del 2000 al 2024");
                anio=Utils.leerInt();
                if(anio>=2000 && anio<=2024){
                    if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                        System.out.println("Bisisiesto, 29 dias");
                    }
                    else{
                        System.out.println("28 dias");
                    }
                }
            }
        }
    }
}
