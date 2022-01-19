/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.veintiseis_26;

/**
 *
 * @author Usuario
 */
public class Ejercicio26 {

    
    public static void main(String[] args) {
            
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        
        // relleno la matriz con numeros aleatorios
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 100 + 1);
                
                
                
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|"+ matrizM[i][j] + "|");
                
                
                
            }
            System.out.println(" ");
            
            
        }
        
        
        
    }
    
}
