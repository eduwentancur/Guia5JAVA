/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.veinticuatro_24;

/**
 *
 * @author Usuario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4], matrizTraspuesta = new int[4][4];
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + -10);
                System.out.print("|" + matriz[i][j] + "|");

            }
            System.out.println(" ");

        }
        System.out.println("--------------------- ");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizTraspuesta[i][j] = matriz[i][j]*-1;
                System.out.print("|" + matrizTraspuesta[i][j] + "|");

            }
            int i=0;
            System.out.println("");

        }
        System.out.println("--------------------- ");
        
        
    }
    
}
