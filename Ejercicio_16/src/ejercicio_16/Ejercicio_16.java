/*
    EJERCICIO 16:
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
package ejercicio_16;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector: ");
        int l=leer.nextInt();
        System.out.println("Rellenando con números aleatorios para el vector de longitud ["+l+"] .....");
        int[] numeros = new int[l];
        llenarVectorAleatorio(numeros);
        
        System.out.println("Ingrese el número a buscar, entre : 1 hasta "+l+": ");
        int num=leer.nextInt();
        System.out.println("Buscando Nume");
        buscarEnVector(numeros,num);
        
        System.out.println("Mostrando Vector .... ");
        mostrarVector(numeros);
       
        
    }
    public static void llenarVectorAleatorio(int[] vector){
        
        for(int i=0; i < vector.length;i++ ){
            //Cacular longitud del vector
            int l=vector.length;
            vector[i]=(int)(Math.random()*l);
            
        }
    }
    
    public static void buscarEnVector(int[] vector,int val){
        
        boolean encontrado=true;
        String aux="";
        for(int i=0; i<vector.length; i++){
            if(vector[i]==val){
                aux+=" "+i;
                break;
            }
            
        }
        if(aux==""){
            System.out.println("El número Ingresado NO se encuentra en el Vector.");
        }else{
            System.out.println("El número Ingresado se encuentra en la(s) posición(es) ["+aux+"] en el Vector.");
        }
        
    }
    
    public static void mostrarVector(int[] vector){
        String aux="";
        
        for(int elemento: vector){
            aux += " " + elemento;
        }
        System.out.println("Vector: {"+aux+" }");
    }
}
