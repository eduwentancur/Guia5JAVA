/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.trece_13;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        int numLimite;
        int num1;
        int num2;

        System.out.println("INGRESE UN NUMERO LIMITE");
        
        numLimite = scan.nextInt();
        do {
            System.out.println("Ingrese numeros para sumar");
           

            num1 = scan.nextInt();
            num2 = scan.nextInt();

        }
            while ((num1 + num2) <= numLimite);
        {
            System.out.println("LA SUMA DE LOS ULTIMOS DOS NUMEROS INGRESADOS SUPERARON EL VALOR LIMITE : "+ numLimite);
        }
       
    }  
}
        
        
   
