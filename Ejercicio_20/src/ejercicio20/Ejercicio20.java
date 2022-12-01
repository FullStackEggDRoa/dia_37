/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int matriz [][]=new int [3][3];
        System.out.println("Ingresar Valores de  la Matriz, digite valores de al 1-9");
        llenarMatriz(matriz);
        System.out.println("Validando si la matriz es Mágica ...");
        validacionMatrizMagica(matriz);
        System.out.println("Matriz");
        mostrarMatriz(matriz);
        
        
       
    
    }
    
    public static void llenarMatriz(int[][] matriz){
        
        Scanner leer = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {   // opcion automatica de longitud para matrices.. checkear..!!
            for (int j = 0; j < 3; j++) {
                    matriz[i][j]= (int)(Math.random()*8)+1;
                    
                    do{
                        System.out.print("Ingrese Valor [" + i + "][" + j +"]") ;
                        matriz[i][j]=leer.nextInt(); 
                    }while(matriz[i][j] > 9 || matriz[i][j]<1);
            }
            
        }
        
    }
       
    
        
    public static void validacionMatrizMagica(int[][] matriz){
        
        Scanner leer = new Scanner (System.in);
        int sumatoria_diagonal_1=0;
        int sumatoria_diagonal_2=0;
        int sumatoria_columna_1=0;
        
        boolean diag_1 = false;
        boolean diag_2 = false;
        
        
        // Validar diagonales Izquierda a derecha
        for (int i = 0; i < 3; i++) {   
            sumatoria_diagonal_1+=matriz[i][i];
            
        }
        // Validar diagonales derecha a izquierda
        int j=2;
        for (int i = 0; i < 3; i++) {
            
            sumatoria_diagonal_2+=matriz[i][j];
            j--;
            
        }
        // Validar Primera Columna
        for (int i = 0; i < 3; i++) {
            
            sumatoria_columna_1+=matriz[i][0];
          
        }
        
        if(sumatoria_diagonal_1==15 && sumatoria_diagonal_2==15 && sumatoria_columna_1==15 ){
            System.out.println("La Matriz es Mágica");
        }else{
            System.out.println("La Matirz NO es Mágica");
        }
       
        
    }
        
        
    public static void mostrarMatriz(int[][] matriz){
        String aux="";
        
        for(int[] fila : matriz){
            aux="";
            for(int elemento: fila){
                aux += " " + elemento;
                 
            }
            System.out.println(aux);
        }
        //System.out.println("Matriz: {"+aux+" }");
    }
    
}
