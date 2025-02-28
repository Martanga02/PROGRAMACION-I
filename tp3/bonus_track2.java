/*El proyecto SETI analiza información proveniente de radiotelescopios e intenta determinar si corresponde a una señal
inteligente de vida extraterrestre. Para este proyecto, se pide un programa que permita a un operador ingresar valores enteros
positivos (si ingresa 0 termina el turno del operador) que representan diferentes intensidades captadas por el
radiotelescopio. En el inicio del turno (antes de ingresar los valores del radiotelescopio), el operador indica el tipo de patrón a
buscar (1 o 2) y la cantidad de repeticiones de dicho patrón. Hay dos tipos de patrones buscados:
- Patrón primo (1): la intensidad captada es un número primo.
- Patrón divisor (2): la intensidad captada es múltiplo de la unidad de la propia intensidad (Ej: el 357 cumple
porque 357 es múltiplo de 7, mientras que 837 no)
El programa debe indicar que se halló el patrón buscado cuando haya habido tantas repeticiones del patrón como lo indicó el
operador (luego de hallar un patrón las repeticiones comienzan nuevamente desde 0). Al finalizar el turno, se debe indicar la
cantidad de patrones hallados durante el mismo.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track2 {
    public static void main(String[]args){
        System.out.println("Ingrese el tipo de patron a buscar(1 o 2): "); int patron=obtenerNumero(); 
        System.out.println("Ingrese la cantidad de veces que debe repetirse el patron: "); int CantPatron=obtenerNumero();
        System.out.println("Ingrese la intensidad captada por radiotelescopio: ");int intensisdad=obtenerNumero();
        TipoPatron(intensisdad, CantPatron, CantPatron);

    }
    public static void TipoPatron(int intensidad,int CantPatron,int patron){
        int patron1=0;
        int patron2=0;
        switch (patron) {
            case 1:
            for(int i =0;i<=CantPatron;i++){
                if(intensidad%2!=0){
                    patron1++;
                }
            }
            break;
            case 2:
            int unidad=intensidad/100;
            for(int i =0;i<=CantPatron;i++){
            if(intensidad/unidad==0){
                patron2++;
            }
            }
            break;
        }
        if(patron1==CantPatron){
            System.out.println("Se hallo el patron buscado");
        }
    }

    public static int obtenerNumero(){
        int numero=0;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            numero=Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    
}
