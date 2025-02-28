/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”. */

public class ejercicio1_g {
    public static void main(String[]args){
       final int MAX=4;
       IncrementarNumero(MAX);
       System.out.println("Termino");
  
    }
    public static void IncrementarNumero(int MAX){
        for(int i=0;i<=MAX;i++){  System.out.println("La variable i  vale " + i + " en el " + i + "er ciclo");
            System.out.println(i);
        }
    }
}
//ejemplo con valores ilustrativos
// Paso        Variable i |
// Inicio             0                       
// Iteracion 1        1            
// Iteracion 2        2                 
// Iteracion 3        3    
// Iteracion 4        4         
// Valor final        4 
