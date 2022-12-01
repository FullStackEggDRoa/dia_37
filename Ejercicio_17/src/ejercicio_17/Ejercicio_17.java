/*
    EJERCICIO 17:
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio_17;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector: ");
        int l=leer.nextInt();
        System.out.println("Rellenando con números aleatorios para el vector de longitud ["+l+"] con valores del 1 al 5 ");
        int[] numeros = new int[l];
        llenarVectorAleatorio(numeros);
        
        System.out.println("Buscando valores de 1 hasta 5 ");
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
            vector[i]=(int)(Math.random()*0.4)+1;
            
        }
    }
    
    public static void buscarEnVector(int[] vector,int val){
        
        int sumatoria_1=0;
        int sumatoria_2=0;
        int sumatoria_3=0;
        int sumatoria_4=0;
        int sumatoria_5=0;
        
        String aux="";
        
        for(int i=0; i<vector.length; i++){
            int num;
            switch(num){
                case 1:
                    
                break;
                    
                case 2:
                case 3:
                case 4:
                case 5:    
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
