/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”.
 */
public class ejercicio5 {
    public static int MAX=4;
    public static void main (String[]args){
        int numero=1;
        Iterar(numero);
        System.out.println("Termino");
        
    }
    public static void Iterar(int numero){
        for(int i=numero;i<=MAX;i++){
            System.out.println("Iteracion: " + i);
        }
    }
    
}
