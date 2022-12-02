/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_1;

import java.util.Scanner;

/**
 *
 * @author fran
 */
public class EjercicioExtra_1 {
    static Scanner read = new Scanner(System.in);
    public static int ConvertirMinutosaHS (int min){
        
        int hs = 0;
        int aux = 60;
        hs=  min/aux;
        
        
      return hs;
        
                
    }
    public static int ConvertirHSaDias (int hs){
        int dia = 0;
        dia= hs/24;
        
        return dia;
        
    }
        public static void main(String[] args) {
            System.out.println("Ingrese los minutos:");
            int min = read.nextInt();
            int hs = ConvertirMinutosaHS (min);
            int dias = ConvertirHSaDias(hs);
            int aux1;
            int cont = 0;
            if (hs>23) {
                aux1=hs; 
                while(aux1>24) {
                aux1=aux1-24;
                cont=cont+1;
                
            }
                hs = aux1;
            }
            System.out.println(min+"Minutos son:"+dias+"dias y "+hs+"horas.");
    }
    
}
