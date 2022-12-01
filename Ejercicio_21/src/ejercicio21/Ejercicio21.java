/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *
 * @author Dai
 */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio21{
    //Se inicializa Scanner llamandolo read
    static Scanner read=new Scanner(System.in);
    //Se inicializa Random llamandolo rand
    static Random rand = new Random();
    
    
        public static void RellenarMatriz(int[][] M1, int[][] M2) {
        //Este Sub solo rellene las matrices pidiendo que se ingresen los valores por consola
         System.out.println("Ingresar Valores Matriz No. 1");
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
               
                System.out.println("Fila No.[" + (i + 1) + "]");
                System.out.println("Ingrese un Numero - MatrizPos[" + i + "][" + j + "]:");
                M1[i][j] = read.nextInt();

            }
            System.out.println("Siguente fila");

        }
        System.out.println("Ingresar Valores Matriz No. 2");
        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2.length; j++) {

                System.out.println("Ingrese un Numero - MatrizPos[" + i + "][" + j + "]:");
                M2[i][j] = read.nextInt();

            }
            System.out.println("Siguiente fila");

        }
    }
    
    public static void EncontrarMatrizDos(int [][] M1,int [][] M2,int [] PocicionM2i ,int [] PocicionM2j) {
        //Aca encontraremos la primera posicion de la matriz 2 (M2) en la matriz 1 (M1)
        
        int  pos1i = -1, pos1j = 0;
        int i2 =0,j2=0, i3 =0, j3=0;
        
        
        // Busqueda de primera coincidencia.
        for (int i = 0; i < M1.length; i++) {
            if (pos1i != -1) {
                break;
            }
           for (int j = 0; j < M1.length; j++) {
                if (M1[i][j]== M2[i2][j2]) {
                    
                    pos1i=i;
                    pos1j=j;
                 
                }
               
            }
       
        }
        
        System.out.println("Validadno los demás elementos de acuerdo a esta posición:");
        System.out.println("Posicion en Matriz 1 ["+pos1i + "]["+ pos1j+"]");
        for (int i = pos1i; i < pos1i + M2.length; i++) {

            for (int j = pos1j; j < pos1j + M2.length; j++) {
                if (M1[i][j] == M2[i2][j2]) {
                    PocicionM2i[i3] = i;
                    PocicionM2j[j3] = j;
                }
                j3++;
                j2++;
            }
            
            j2=pos1j;
            i3++;
            i2++;
           
        }
        for (int i = 0; i < PocicionM2i.length; i++) {
            System.out.println("i"+PocicionM2i[i]+"j"+PocicionM2j[i]);
        }
             
            
            
    }
    public static void MostrarMatriz (int [][]M1,int [][] M2){
        
        //Este Sub solamente mostrara las matrices
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                System.out.print("["+M1[i][j]+"]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2.length; j++) {
                System.out.print("["+M2[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        
        //Pedimos tamaños de matrices
        System.out.println("Ingrese el tamaño de la matriz numero 1:");
        int N1 = read.nextInt();
        System.out.println("Ingrese el tamaño de la matriz numero 2:");
        int N2 = read.nextInt();
        //Inicializamos las matrices con sus respectivos tamaños
      
        int [][] M1 = new int [N1][N1];
        int [][] M2 = new int [N2][N2];
        
        //Inicializamos dos vectores Auxiliares
        
        int [] PocicionM2i = new int [N2*N2];
        int [] PocicionM2j = new int [N2*N2];
        
        //Llamamos a las funciones
        System.out.println("Rellenando Matrices .... ");
        RellenarMatriz(M1,M2);
        System.out.println("Mostrando Matrices Matrices ....");
        MostrarMatriz(M1,M2);
        System.out.println("Buscando Matriz 2 en Matriz 1 .... ");
        EncontrarMatrizDos(M1,M2,PocicionM2i,PocicionM2j);
        
    }
}
