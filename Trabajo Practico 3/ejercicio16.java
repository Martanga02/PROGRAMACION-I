/*Escribir un programa que mientras el usuario ingresa un
número de mes (entero) entre 1 y 12 inclusive, muestre por
pantalla la cantidad de días del mes ingresado (suponer febrero
de 28 días) (Mostrar por pantalla la cantidad de días del mes
debería realizarse con un método).
 */
public class ejercicio16 {
    public static void main (String[]args){
        int num=ObtenerNumero();
        if(num>=1 && num<=12){
            QueMesEs(num);
        }
    }
    public static void QueMesEs(int num){
        switch (num) {
            case 1,3,5,7,8,10,12:
            System.out.println("31 dias");
                break;
            case 4,6,9,11:
            System.out.println("30 dias");
                break;
            case 2:
                System.out.println("Febrero, 28 dias");
                break;
        }
    }
    public static int ObtenerNumero(){
        int num=0;
        System.out.println("Ingrese un numero");
        num=Utils.leerInt();
        return num;
    }
}
