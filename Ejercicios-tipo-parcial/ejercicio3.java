/*3. Asignación de aulas
La Facultad de Exactas debe asignar aulas para una fecha de examen en la cual hay distintas materias que tomarán finales en el mismo horario. 
Dicha asignación se realiza en base a la cantidad de alumnos y a la capacidad de las aulas disponibles. Para ello, se almacena en un arreglo M 
de tamaño MAXM el número de legajo de los inscriptos a cada una de las materias. Para separar cada materia, se utiliza uno o más ceros
(dado que ningún alumno posee un cero como número de legajo). Además, el arreglo M siempre comienza y termina también con uno o más ceros. 
Por ejemplo, el siguiente arreglo M muestra que hay 3 materias que tomarán examen en un mismo horario: en la primera hay 4 inscriptos, 
en la segunda 6 inscriptos y en la tercera solo 3.
|0| 0| 34| 2| 12| 25| 0| 32| 55| 12| 3| 88| 14| 0| 0| 17| 36| 19| 0| 0|
La facultad posee un conjunto de aulas, numeradas desde 0, disponibles para tomar exámenes según su capacidad. La capacidad se almacena 
en un arreglo A de tamaño MAXA ordenado ascendentemente. En este arreglo, el valor almacenado en la posición i se corresponde con la 
capacidad del aula número i. Por ejemplo, en el siguiente arreglo A de tamaño 3, el aula nro. 1, posee capacidad para 3 alumnos.
    |2 |3| 6|
Se pide implementar un programa en Java que asigne a cada materia almacenada en el arreglo M, un aula del arreglo A. La asignación debe 
realizarse en el orden en que aparecen las materias en el arreglo M y considerando, una asignación eficiente del espacio, esto es, el 
aula asignada debe ser aquella que deje menos cantidad de lugares sin ocupar (y que ya no haya sido asignada). Para indicar que un aula 
ya ha sido asignada, la capacidad debe ser cambiada por el valor original pero negativo. Una vez realizada la asignación se debe eliminar 
la secuencia del arreglo M. En caso de no existir un aula disponible con la capacidad necesaria, se debe informar que no se pudo asignar 
y se debe conservar la secuencia. Si la cantidad de materias fuera superior a la cantidad de aulas disponibles, se debe informar que no quedan
más aulas cuando éstas hayan sido todas asignadas. Siguiendo el ejemplo, el arreglo A resultante sería: 2 -3 -6
Las asignaciones deben ser impresas por consola. En este ejemplo, las asignaciones serían: “La materia 1 se asignó al aula 2”, 
“La materia 2 no se puede asignar” y “La materia 3 se asignó al aula 1. El arreglo M resultante sería:
|0| 0| 0| 32| 55| 12| 3| 88| 14| 0| 0| 0| 0| 0| 0| 0| 0| 0| 0| 0| */
public class ejercicio3 {
    public static final int MAX=20,MAXA=3,SEPARADOR= 0;
    public static void main (String[]args){
        int[]arr={0,0,34,2,12,25,0,32,55,12,3,88,14,0,0,17,36,19,0,0};
        int[]aulas={2,3,6};
        ImprimirArreglo(arr);
        ImprimirArregloAulas(aulas);
        ProcesarSecuencias(arr,aulas);
        ImprimirArreglo(arr);
        ImprimirArregloAulas(aulas);
    }

    public static void ProcesarSecuencias(int[] arr, int[] aulas) {
        int inicio = 0, fin = -1;
        int numeroMateria = 1;

        while (inicio < MAX) {
            inicio = BuscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = BuscarFin(arr, inicio);
                int cantidad = fin - inicio + 1;
                int indiceAula = BuscarAulaDisponible(aulas, cantidad);

                if (indiceAula != -1) {
                    aulas[indiceAula] *= -1; // Marcar como asignada
                    System.out.println("La materia " + numeroMateria + " se asignó al aula " + indiceAula);
                    // Eliminar la secuencia
                    for (int i = inicio; i <= fin; i++) {
                        CorrimientoIzquierda(arr, inicio);
                    }
                    fin = inicio - 1; // reacomodar para próxima búsqueda
                } else {
                    System.out.println("La materia " + numeroMateria + " no se puede asignar");
                }
                numeroMateria++;
            }
        }
    }

    public static int BuscarAulaDisponible(int[] aulas, int cantidad) {
        int mejorIndice = -1;
        int menorSobrante = 9999;

        for (int i = 0; i < MAXA; i++) {
            if (aulas[i] > 0 && aulas[i] >= cantidad) {
                int sobrante = aulas[i] - cantidad;
                if (sobrante < menorSobrante) {
                    menorSobrante = sobrante;
                    mejorIndice = i;
                }
            }
        }

        return mejorIndice;
    }


    public static void CorrimientoIzquierda(int[]arr,int inicio){
        while(inicio<MAX-1){
            arr[inicio]=arr[inicio + 1];
            inicio++;
        }
        arr[MAX-1]=0;
    }

    public static int BuscarInicio(int[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos - 1;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }

    public static void ImprimirArregloAulas(int[]aulas){
        for(int i =0;i<MAXA;i++){
            System.out.print("|" + aulas[i] + "|");
        }
        System.out.println(" ");
    }
}
