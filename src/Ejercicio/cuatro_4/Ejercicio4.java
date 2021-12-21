/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.cuatro_4;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double grados;
        double f;
        
        System.out.println("Ingrese grados centrigrados");
        
        
        
        grados = scan.nextDouble();
        
        f= 32+(9*grados/5);
        
        System.out.println("su equivalente a grados Fahrenheit es "+ (f)+ " grados");
        
        
        
    }
    
}
