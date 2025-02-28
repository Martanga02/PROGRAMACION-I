/*Escribir un programa que solicite una hora del día (valor entero de
la hora solamente) y resuelva en cada caso:
a. Si la hora está entre las 0 y las 5, pida ingresar la
temperatura y si la misma es menor a 20 grados imprima
“Encender la calefacción”. Si es mayor a 25, imprima
“Apagar calefacción”. Si está en el rango de 20 a 25 imprima
“Calefacción encendida, no abra las ventanas!!!”.
b. Si la hora está entre las 6 y las 11, pida un carácter letra
minúscula y si es vocal imprima por la consola la cantidad de
vocales que tiene la palabra que corresponde con la hora.
Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
tiene 2 consonantes.
c. Si la hora está entre las 12 y 17 y es par, imprima el
promedio entre la hora ingresada y el límite inferior del
rango. Si la hora es impar debe imprimir el promedio entre la
hora ingresada y el límite superior del rango.
d. Si la hora está entre las 18 y 23, pida ingresar una clave
numérica, si coincide con la clave almacenada previamente
en una constante, pida ingresar una segunda clave de
verificación (un valor entre 100 y 999). Para esta segunda
clave (que solo la conoce el usuario) se debe verificar que el
dígito de mayor peso (centena) sea múltiplo del dígito de
mayor peso de la clave almacenada. Si todo esto se cumple
debería mostrar por la consola el mensaje “Clave correcta”.
Ejemplo: clave almacenada 364, clave ingresada 364,
segunda clave ingresada 698. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5 {
    public static void main (String[]args){
        int hora=0;
        int temperatura=0;
        char letra;
        final int claveFinal = 364;
        int clavePrueba=0;
        int claveSegunda=0;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la hora del dia(solo valor numerico): ");
            hora=Integer.valueOf(entrada.readLine());
            if(hora>=0 && hora<=5){
            System.out.println("Ingrese la temperatura del dia: ");
            temperatura=Integer.valueOf(entrada.readLine());
            if(temperatura<20){
                System.out.println("Encender la calefacción");
            }
            else if(temperatura>25){
                System.out.println("Apagar calefacción");
            }
            else{
                System.out.println("Calefacción encendida, no abra las ventanas!!!");
            }
            }
            else if(hora>=6 && hora<=11){
            System.out.println("Ingrese una letra minuscula: ");
            letra = entrada.readLine().charAt(0);
            switch (letra) {
                case 'a','e','i','o','u':
                switch (hora) {
                    case 6:System.out.println("la hora " + hora + " tiene " + "2 vocales" );
                    break;
                    case 7:System.out.println("la hora " + hora + " tiene " + "3 vocales" );
                    break;
                    case 8:System.out.println("la hora " + hora + " tiene " + "2 vocales" );
                    break;
                    case 9:System.out.println("la hora " + hora + " tiene " + "3 vocales" );
                    break;
                    case 10:System.out.println("la hora " + hora + " tiene " + "2 vocales" );
                    break;
                    case 11:System.out.println("la hora " + hora + " tiene " + "2 vocales" );
                    break;
                }
                    break;
                case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
                System.out.println("La hora " + hora + "tiene dos consonantes");
                }
            }
            else if(hora>=12 && hora<=17){
                if(hora%2==0){
                    System.out.println("el promedio entre la hora: " + hora + " y el rango inferior es: " + ((hora*12)/100));
                }
                else{
                    System.out.println("el promedio entre la hora: " + hora + " y el rango superior es: " + ((hora*17)/100));
                }
            }
            else if(hora>=18 && hora<=23){
                System.out.println("Ingrese la primer clave:");
                clavePrueba=Integer.valueOf(entrada.readLine());
                if(clavePrueba==claveFinal){
                System.out.println("Ingrese la segunda clave(entre el 100 y 999)");
                claveSegunda=Integer.valueOf(entrada.readLine());
                    if(claveSegunda>=100 && claveSegunda<=999){
                        int extraClaveSegunda= claveSegunda/100;
                        int extraClaveFinal= claveFinal/100;
                        if(extraClaveSegunda%extraClaveFinal==0){
                        System.out.println("Clave correcta");
                        }
                    }
                }
            }
        }
        catch (Exception exc ) { //se ejecuta si ocurre algún error de lectura
            System.out.println( exc );
            }
    }
    
}