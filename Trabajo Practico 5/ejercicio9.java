/*Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida.
 */
public class ejercicio9{
    public static final int MAX=10;
    public static void main (String[]args){
        char []carac={'a','b','e','e','t','d','w','m','o','q'};
        if(Verificar(carac)){
            System.out.println("Hay letra repetidas");
        }
        else{
            System.out.println("No hay letras repetidas");
        }

    }
    public static boolean Verificar(char[]carac){
        for(int i=0; i<MAX; i++){
            for(int j= i + 1; j<MAX; j++){
                if(carac[i]==carac[j])
                return true;
            }
        }
        return false;
    }
}