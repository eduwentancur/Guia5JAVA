/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.seis_6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num1 ;
        int num2; 
        
        System.out.println("Ingrese el primer numero");
       
        num1=scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        
        
        num2=scan.nextInt();
        
        if (num1>num2){
            System.out.println("El numero mayor es : "+ (num1));
        }   
        else { 
            System.out.println("El numero mayor es : " + num2);}
                   
                    
                    
                    
                    
                    
    }
    
}
