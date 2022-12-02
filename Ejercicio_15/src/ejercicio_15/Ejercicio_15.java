/*
    EJERCICIO 15:
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
 */
package ejercicio_15;

/** HOLA
 *
 * @author droa
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("hola dani");

        System.out.println("Rellenando vector 100 Primeros números enteros");

        int[] numeros = new int[100];
        llenarVector(numeros);
        System.out.println("Mostrando Vector .... ");
        mostrarVector(numeros);
       
        
    }
    public static void llenarVector(int[] vector){
        
        for(int i=0; i < vector.length;i++ ){
            vector[i]=i+1;
            
        }
    }
    public static void mostrarVector(int[] vector){
        String aux="";
        
        for(int i=vector.length-1; i>=0; i--){
            aux += " " + vector[i];
        }
        System.out.println(aux);
    }
}

