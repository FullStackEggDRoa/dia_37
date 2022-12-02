/*
    EJERCICIO 21:

    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
    se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
    la matriz M en la cual empieza el primer elemento de la submatriz P.
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

                //System.out.println("Ingrese un Numero - MatrizPos[" + i + "][" + j + "]:");
                //M2[i][j] = read.nextInt();
                
            }
            System.out.println("Siguiente fila");

        }
        
    }
    
    public static void EncontrarMatrizDos(int [][] M1,int [][] M2,int [] PocicionM2i ,int [] PocicionM2j) {
        //Aca encontraremos la primera posicion de la matriz 2 (M2) en la matriz 1 (M1)
        
        boolean encontrada=false;
        //int pos1i = -1, pos1j = 0;
        int coincidencias=0;
        int anspos1i=-1;    //estas varialbes permitirán validar al menos dos cocindiencias
        int anspos1j=-1;    //sería interesante implementa
        
        
        do {
            int pos1i = -1, pos1j = 0;
            int i2 = 0, j2 = 0, i3=0,j3=0;

            // Busqueda de posibles coincidencias.
            for (int i = 0; i < M1.length; i++) {
                if (pos1i != -1) {
                    break;
                }
                for (int j = 0; j < M1.length; j++) {
                    if (M1[i][j] == M2[i2][j2]) {
                        if(i!=anspos1i && j!=anspos1j){
                            pos1i = i;
                            pos1j = j;
                            anspos1i=i;
                            anspos1j=j;
                                    
                        }

                    }

                }

            }

            System.out.println("Validando los demás elementos de acuerdo a esta posición:");
            System.out.println("Posicion en Matriz 1 [" + pos1i + "][" + pos1j + "]");
           
            for (int i = pos1i; i < pos1i + M2.length; i++) {

                for (int j = pos1j; j < pos1j + M2.length; j++) {
                    if (M1[i][j] == M2[i2][j2]) {
                        PocicionM2i[i3] = i;
                        PocicionM2j[j3] = j;                      
                        j3++;
                        coincidencias++;
                        if(coincidencias==8)
                        {
                            //PocicionM2i[i3] = i;
                            //PocicionM2j[j3] = j;
                            encontrada=true;
                        }
                    }

                    
                    if (j == pos1j + M2.length - 1) {
                        j2 = 0;
                    } else {
                        j2++;                        
                    }
                    i3++;
                }

                //j2=pos1j; >>>>>>>>>>>>> HORROR DE ERROR jajaja...... Como nos ha tenido ...
               
                if (i == pos1i + M2.length - 1) {   //PARA EVITAR DESBORDE DURANTE LA LECTURA DE LA MATRIZ2
                    i2 = 0;
                } else {
                    i2++;
                    
                }
                
            }
            if(encontrada==false){
                System.out.println("Coincidencia No Exitosa!!");
                System.out.println("Probando otra posible Opción:");
            }
        }while (encontrada == false);
        System.out.println("Coincidencia Exitosa!!");
        System.out.println("La Matriz 2 se encuentra en la Matriz 1 en los índices:");
        for (int i = 0; i < PocicionM2i.length; i++) {
                System.out.println("[i,j]=[" + PocicionM2i[i] + "," + PocicionM2j[i] + "]");
            }    
            
    }
    public static void MostrarMatriz (int [][]M1,int [][] M2){
        
        //Este Sub solamente mostrara las matrices
        System.out.println("Matriz 1:");
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                System.out.print("["+M1[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2:");
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
        // INGRESAR 10 -> EN MODO DEBUGGER
        int N1 = read.nextInt();
        System.out.println("Ingrese el tamaño de la matriz numero 2:");
        // INGRESAR 3 -> EN MODO DEBUGGER
        int N2 = read.nextInt();
        
        //Inicializamos las matrices con sus respectivos tamaños
      
        //int [][] M1 = new int [N1][N1];
        //int [][] M2 = new int [N2][N2];
        // DESCOMENTAR LAS DOS LINEAS ANTERIORES PARA DEJAR EL ARCHIVO EN MODO NORMAL.
        // COMENTAR LAS SIGUIENTES LINEAS PARA DEJAR EL ARCHIVO EN MODO NORMAL:
        int[][] M1 = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, {41, 87, 24, 56, 97, 74, 87, 42, 65, 35}, {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},{99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},{24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] M2 = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        
        
        //Inicializamos 1os vectores Auxiliares
        
        int [] PocicionM2i = new int [N2*N2];
        int [] PocicionM2j = new int [N2*N2];
        
        //Llamamos a las funciones
         // DESCOMENTAR LAS DOS LINEAS SIGUIENTES PARA DEJAR EL ARCHIVO EN MODO NORMAL.
        //System.out.println("Rellenando Matrices .... ");
        //RellenarMatriz(M1,M2);
        System.out.println("Mostrando Matrices Matrices ....");
        MostrarMatriz(M1,M2);
        System.out.println("Buscando Matriz 2 en Matriz 1 .... ");
        EncontrarMatrizDos(M1,M2,PocicionM2i,PocicionM2j);
        
    }
}
