/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.diecisiete_17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese cantidad de elementos ");
        int n = leer.nextInt();
        
        
        
        for (int i=0; i<n ; i++)
        {
            System.out.print("* ");
           
        }
        System.out.println();
        
        for (int i=1 ; i<n-2; i++){
            System.out.print("* ");
            for (int j=0 ; j<n-2 ; j++){
                System.out.print("  ");
                
            }
            System.out.println("* ");
        }
        
         for (int i=1 ; i<n-2; i++){
            System.out.print("* ");
            for (int j=0 ; j<n-2 ; j++){
                System.out.print("  ");
                
            }
            System.out.println("* ");
        }
        
         for (int i=0; i<n ; i++)
        {
            System.out.print("* ");
           
        }
        System.out.println("  ");
        
    }
    
}
