/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.veinte_20;

/**
 *
 * @author Usuario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[999];
        
        for (int i=100 ; i>=0 ; i--){
            numeros[i]=i;
            System.out.print("|"+ numeros[i]+ "|");
        }
        
        System.out.println(" ");
        
    }
    
}
