/*1. Dados los siguientes códigos, analizar y detectar los errores. Justificar en cada caso.
a.
public class Practica_3_Bonus_1 {
public static void main (String [] args){
int resultado=0;
System.out.println(“Tabla de multiplicar del 7”);
resultado=imprimirTabla7(resultado);
}
public static void imprimirTabla5(){
for (int i = 1 ; i <= 10; i++) {
System.out.println(5*i);
}
}

//Se esta llamando al metodo imprimirTabla7, pero este no existe, existe el de imprimirTabla5, ademas
no se puede asignar la variable resultado como parametro, ya que a esta la define el mismo metodo.
*/

/*
 public class Practica_3_Bonus_2 {
public static void main(String []args){
char letra=’a’;
obtenerCaracter(letra);
if (letra>=‘a’ && letra<=‘z’){
System.out.println(“Es una letra minuscula”);
}
}
public static char obtenerCaracter(char letra, int numero){
char letra = ‘ ’;
try {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Ingrese un NRO entero: ");
letra = entrada.readLine().charAt(0);
}
catch (Exception exc) {
System.out.println("error");
}
return letra;
}
}

//en este caso, no es neceserio pasar por parametro la variable letra en el metodo obtenerletra, ya que el metodo otorgara el 
resultado de la variable misma,ademas el mensaje esta mal, pide un numero entero pero despues almacena una letra(dara error)
por ultimo en caso de que hubiera estado correcto pasar por parametros las variables letra y nuero, en el llamado al metodo 
en el main, falta poner la variable numero entre parentesis
 */

 /*public class Practica_3_Bonus_3 {
public static int numero = 2;
public static void main(String[] args) {
int b = 3;
{
System.out.println (a + ", " + numero);
int b = 2;
int a = 5;
System.out.println (a + ", " + b);
{
int c = 7;
System.out.println (a + ", " + b + ", " + c);
}
System.out.println (a + ", " + b + ", " + c);
}
}
}

//esta mal definir una variable usando el public static
//las impresiones estan mal redactadas, lo que se imprimira sera: " 5,2,7" cuando lo que se busca imagino, es decir, 5 + 2 = 7
 */

 /*Escribir un programa que llame un método que calcule el
promedio de la suma de valores enteros entre 1 y 1000.
Finalmente, el promedio debe mostrarse por pantalla
public class Practica_3_Bonus_4 {
public static final int MAX = 1, MIN = 1000;
public static void main(String[] args) {
System.out.println("El promedio de la suma entre " MIN " y
" MAX " es "+ calcular_promedio());
}
public static char calcular_promedio(int MAX, int MIN) {
int suma = 0;
int numero = MIN;
for (; numero <= MAX; numero++) {
suma += numero;
}
return suma/(MAX-MIN+1);
}
} */

//en primer lugar, hubo una confusion con la asignacion de valores en las variables MIN y MAX, los valores estan al revez
//por esto, en el metodo al asignarle a la variable numero el valor MIN, le estamos asginado el valor 1000
//cuando el for se ejecute, dara error ya que 1000 ya es menor que MAX(1)
//ademas el for tiene una ";", lo cual inhabilita todo el for, y tampoco se esta calculando el promedio
//que deberia ser suma/1000

/*Dados dos números positivos y un carácter opción cuyo
valor es una letra minúscula ‘s’ o ‘r’ (únicamente puede
tomar estos dos valores), obtener la suma de ambos
números si la opción es ‘s’ o si es ‘r’ se debe restar el
primero al segundo.
public class Practica_3_Bonus_5 {
public static void main(String[] args) {
int numero1=235; // valor de ejemplo
int numero2=-5; // valor de ejemplo
char opcion=’s’;
resolver(opcion,numero1,numero2);
}
public static void resolver(int num1, int num2, char op){
if (op==’s’){
System.out.println("La suma es: "+num1+num2);
}
else if (op==’r’){
System.out.println("La resta es:
"+num1-num2);
}
else
System.out.println("Opción no válida”);
}
} */

//el caracter + esta de mas en la resta