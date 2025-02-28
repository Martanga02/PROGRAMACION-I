/*1. Dados los siguientes códigos, analizar y detectar los errores.
Justificar en cada caso.
a.
public class Practica_1_Bonus_1{
public static void main(String[] args) {
double altura=’a’;
boolean existe;
existe = 34;
peso = 75.5;
System.out.println("El valor de " - "peso es: ");
System.out.println(peso);
}
}
//existe y peso no estan declaradas, ademas se estan asignadno resultados a variables que no son del mismo tipo, ejemplo 'a' a boolean
b.
public class Practica_1_Bonus_2{
public static void main(String[] args) {
final char letra=’a’;
int numero1, numero2;
letra = ’f’;
numero1= 10 + numero2;
System.out.println("El valor de numero1 es:" + numero1);
System.out.println("El valor de numero2 es:" + numero2);
 }
}
 //numero2 no esta inicializada por lo tanto no tiene un valor por defecto, numero1 dara como resultado 10, ademas de eso hay variables que no se utilizan que no estan declaradas
c.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practica_1_Bonus_3 {
public static void main(String[] args){
int entero;
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
try {
System.out.println ("Ingrese un entero: ");
System.out.println ("Nro ingresado: " + entero);
}
catch (Exception exc ) { System.out.println(exc);
}
}
}
//falta asignarle a la variable lo que entro por el buffer

2. Dados los siguientes enunciados y códigos, analizar y detectar los
errores. Justificar en cada caso.
a. Suponiendo dos números enteros dados, se pide imprimir:
i. si ambos son positivos y el primero es múltiplo de 5 y
el segundo múltiplo de 7.

ii. si el primero es mayor a 3 veces el segundo o es
múltiplo del segundo.

iii. si el primero es menor al segundo y la suma es par
public class Practica_1_Bonus_4 {
public static void main(String[] args){

int numero1=34, numero2=67; // valores de ejemplo
boolean resultado1, resultado2, resultado3;
resultado1=(numero1&&numero2 >0) && numero1/5==0 &&
numero2/7==0;
resultado2=(numero2<3*numero1)||numero1%numero2==1;
resultado3=numero1<numero2 && numero2+numero1%2==0;
System.out.println ("Inciso i: " + resultado1);
System.out.println ("Inciso ii: " + resultado2);
System.out.println ("Inciso iii: " + resultado3);
}
}
// en la consigna i, se debe usar el operador '%' para saber si un numero es multiplo de otro
//en la primer comparacion esta al revez, deberia ser numero1> numero2*3, ademas en la segunda comparacion para saber si es multiplo
deberia ser ==0, no ==1.
//el ultimo esta bien

b. Suponiendo un número entero dado, se pide imprimir:
i. si el número está en un rango de 3 a 78, y si es
múltiplo de 9 o de 7.

ii. si el número es menor a 65 pero como mínimo 24 y es
impar

iii. si el número es negativo o positivo e impar

public class Practica_1_Bonus_5 {
public static void main(String[] args){
int numero=34; // valor de ejemplo
boolean resultado1, resultado2, resultado3;
resultado1=(3<numero<78) && (numero%9||%7)==0;
resultado2=(numero<65 && numero>23)&& numero%2==0;
resultado3=numero<0 && numero>0 || numero%2==0;
System.out.println ("Inciso i: " + resultado1);
System.out.println ("Inciso ii: " + resultado2);
System.out.println ("Inciso iii: " + resultado3);
}
} */
//las comparaciones como 3 < numero < 78 no son válidas. Debes escribirlo como (numero > 3 && numero < 78).
//en la segunda comparacion para saber si es impar deberia ser ==1 y deberia ser numero>=24
//en el 3 por un lado deberia ser numero<0 y por otro numero>0 && numero%2==0