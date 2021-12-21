/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.two_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String nombre;
        
        System.out.println("Ingrese su nombre");
        
        
        nombre=scan.nextLine();
        
        System.out.println("Su nombre es "+nombre);
        
        
    }
    
}
