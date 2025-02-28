/*2. Dados los siguientes enunciados y códigos, analizar y detectar los errores. Justificar en cada caso.
a. Dado un caracter ingresado por el usuario: imprimir si es caracter minúscula, o imprimir si es carácter mayúscula, o 
imprimir no es caracter letra.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practica_2_Bonus_4 {
public static void main(String[] args) {
char caracter;
BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));
try{
System.out.println("Ingrese un caracter :");
caracter = entrada.readLine().charAt(0);
if (('a'<=caracter)||(caracter<='z')) {
System.out.println("Es carácter minúscula");
}
if (('A'<=caracter)&&(caracter<='Z')) {
System.out.println("Es carácter mayúscula");
}
else {
System.out.println("No es caracter letra");
}
}
catch (Exception exc){
System.out.println(exc);
}
}
}

JUSTIFICACION: HAY UN OPERADOR OR EL CUAL HARA QUE DE SIEMPRE VERDADERO. FALTA UN ELSE EN EL OTRO IF.
b. Dado un número positivo, imprimir “Tiene 1 dígito” si el número pertenece al rango [0..9] o “Tiene 2 dígitos” si el número pertenece 
al rango [10..99] o “Tiene 3 o más dígitos” si el número es mayor o igual a 100.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practica_2_Bonus_5 {
public static void main(String[] args) {
int numero=235; // valor de ejemplo
if (numero>=0 && numero<10){
System.out.println("Tiene 1 dígito");
}
else if (!(numero<10 && numero>=100)){
System.out.println("Tiene 2 dígitos");
}
System.out.println("Tiene 3 o más dígitos");
}
} 
JUSTIFICACION: EN ULTIMO sYSTEM SE IMPRIMIRA SIEMPRE YA QUE NO TIENE NINGUNA CONDICION NI ESTA INCLUIDO EN UN ELSE.
ADEMAS LA SEGUNDA COMPARACION ESTA MAL, SIEMPRE DARA POSITIVO .
*/