/*Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1)
 */
public class ejercicio12 {
    public static void main (String[]args){
        int num=SolicitarNumero();
        
        int contador=Lanzamientos(num);
        System.out.println("La cantidad de veces que salio el numero: " + num + " fue: " + contador);
    }
    public static int SolicitarNumero(){
        System.out.println("Ingrese un numero del 1 al 6");
        int num=Utils.leerInt();
        return num;
    }
    public static int Lanzamientos(int num){
        int dado=0;
        int contador=0;
        for(int i=1;i<=1000;i++){
            dado = (int) (6*Math.random() + 1);
            System.out.println("Lanzamiento " + i + " y el numero que salio fue: " + dado);
            if(num==dado){
                contador++;
            }
        }
        return contador;
    }
}
