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
        
        System.out.println("Buscando cuantos numeros existe en el vector de 1,2 hasta 5 ");
        
        
        buscarEnVector(numeros);
        
        System.out.println("Mostrando Vector .... ");
        mostrarVector(numeros);
       
        
    }
    public static void llenarVectorAleatorio(int[] vector){
        
        for(int i=0; i < vector.length;i++ ){
            //Cacular longitud del vector
            int l=vector.length;
            vector[i]=(int)(Math.random()*4)+1;
            
        }
    }
    
    public static void buscarEnVector(int[] vector){
        
        int sumatoria_1=0;
        int sumatoria_2=0;
        int sumatoria_3=0;
        int sumatoria_4=0;
        int sumatoria_5=0;
        int j=0;
        String aux="";
        
        for(int i=0; i<vector.length; i++){
            for(j=1;j<=5;j++)
            {
                switch(j){
                    case 1:
                        if(vector[i]==1){
                            sumatoria_1++;
                        }
                    break;

                    case 2:
                        if(vector[i]==2){
                            sumatoria_2++;
                        }
                        break;
                    case 3:
                        if(vector[i]==3){
                            sumatoria_3++;
                        }
                        break;
                    case 4:
                        if(vector[i]==4){
                            sumatoria_4++;
                        }
                        break;
                    case 5:
                        if(vector[i]==5){
                            sumatoria_5++;
                        }
                        break;
                }
            }
        }
        System.out.println("Resultados:");
        System.out.println("Cantidad de 1 en el Vector: "+sumatoria_1);
        System.out.println("Cantidad de 2 en el Vector: "+sumatoria_2);
        System.out.println("Cantidad de 3 en el Vector: "+sumatoria_3);
        System.out.println("Cantidad de 4 en el Vector: "+sumatoria_4);
        System.out.println("Cantidad de 5 en el Vector: "+sumatoria_5);
    }
    
    public static void mostrarVector(int[] vector){
        String aux="";
        
        for(int elemento: vector){
            aux += " " + elemento;
        }
        System.out.println("Vector: {"+aux+" }");
    }
    
}
