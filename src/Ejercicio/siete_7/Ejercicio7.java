/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.siete_7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num ;
        
        System.out.println("Ingrese un numero");
        
        num=scan.nextInt();
        
        if (num %2==0){
            System.out.println("EL NUMERO ES PAR");
            
        }else {
            System.out.println("El numero es impar");
            
        }
    }
    
}
