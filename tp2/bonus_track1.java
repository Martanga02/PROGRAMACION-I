/*1. La clínica “Dolores” tiene un sistema de historias clínicas para todos sus pacientes. El gerente de administración solicita emitir
algunos informes y elige en un menú de opciones:
a. Si la opción es ‘1’ se debe pedir ingrese la cantidad de pacientes (no mayor a 15) y por cada uno solicitar la edad.
Informar cuántos pacientes son mayores de 78 años.
b. Si la opción es ‘2’ se debe ingresar una cantidad de prestadores de servicios que tiene la clínica (no mayor a 10).
Por cada prestador solicitar la cantidad de pacientes que ha atendido en los últimos 2 días. Finalmente, informar cuántos
prestadores han atendido a más de 10 pacientes en los últimos 2 días.
c. Si la opción es ‘3’ se desea saber la cantidad de pacientes de cada sexo y el promedio de edades de cada grupo. Para
ello deberá solicitar primero que ingrese qué cantidad son femeninos (no mayor a 10) y qué cantidad son masculinos
(no mayor a 10). Por cada grupo solicitar el ingreso de las edades para luego informar los promedios correspondientes.
d. Por último, si la opción es ‘4’ se desea conocer cuántos pacientes no tienen obra social. Para ello se debe solicitar la
cantidad de pacientes (no mayor a 15) y por cada uno solicitar si tiene o no obra social. Puede suponer un valor
numérico para verdadero y otro para falso.
e. Cualquier otra opción se debe informar que “No es una opción válida” y debe volver a pedirla. Con ‘0’ termina.
Escribir un programa que permita obtener al gerente de administración los informes que necesita.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track1 {
    public static void main (String[]args){
        int numero=0;
        int contador=0;
        int contadorM =0;
        try {
            while(numero>=0){
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero del 1 al 4");
            numero= Integer.valueOf(entrada.readLine());
            switch (numero) {
                case 1:
                int edad=0;
                int cantidadPacientes=0;
                System.out.println("Ingrese la cantidad de pacientes: ");
                cantidadPacientes= Integer.valueOf(entrada.readLine());
                for(int i=1;i<=cantidadPacientes;i++){
                    System.out.println("Ingrese la edad de los pacientes");
                    edad= Integer.valueOf(entrada.readLine());
                    if(edad>=78){
                        contador++;
                    }
                }
                System.out.println("La cantidad de pacientes con mas de 78 años es: " + contador);
                    break;
                case 2:
                int prestadores=0;
                int cantidad=0;
                System.out.println("Ingrese la cantidad de prestadores: ");
                prestadores= Integer.valueOf(entrada.readLine());
                for(int i=1;i<=prestadores;i++){
                    System.out.println("Ingrese la cantidad de pacientes que ha atendido");
                    cantidad= Integer.valueOf(entrada.readLine());
                    if(cantidad>=10){
                        contador++;
                    }
                }
                System.out.println("En total " + contador + " prestadores a atendido a mas de 10 pacientes");
                break;
                case 3: 
                int cantF=0;
                int cantM=0;
                System.out.println("Ingrese la cantidad de pacientes femeninos: ");
                cantF= Integer.valueOf(entrada.readLine());
                System.out.println("Ingrese la cantidad de pacientes masculinos: ");
                cantM= Integer.valueOf(entrada.readLine());
                for(int i=1;i<=cantF;i++){
                    System.out.println("Ingrese las edades");
                    edad= Integer.valueOf(entrada.readLine());
                    contador+=edad;
                }
                for(int i=1;i<=cantM;i++){
                    System.out.println("Ingrese las edades");
                    int edadM= Integer.valueOf(entrada.readLine());
                   
                    contadorM  += edadM;
                }
                double promedioM=(contadorM /  cantM);
                double promedioF=(contador / cantF);
                System.out.println("El promedio de edades es de: " + promedioF + " femenino y " + promedioM + " masculino ");
                break;
                case 4:
              
                String respuesta="no";
                System.out.println("Ingrese la cantidad de pacientes");
                cantidad=Integer.valueOf(entrada.readLine());
                for(int i=1;i<=cantidad;i++){
                    System.out.println("Tiene obra social?");
                    respuesta = entrada.readLine();
                    if(respuesta =="no"){
                        contador++;
                    }
                }
                System.out.println("La cantidad de pacientes sin obra social es de: " + contador);
                break;
                default:
                System.out.println("El numero ingresado no es valido, intente de nuevo ingresando '0");
            }
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
