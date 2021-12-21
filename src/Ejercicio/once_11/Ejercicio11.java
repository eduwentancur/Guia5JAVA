/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.once_11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int tipoMotor;
        
        
        System.out.println("Ingrese un valor entre 1 y 4");
        
        tipoMotor= scan.nextInt();
        
        switch(tipoMotor){
        case 1:
             System.out.println("La bomba es uan bomba de agua");
            break;
        case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
        case 3:
            System.out.println("La bomba es una bomba de hormigon");
            break;
        case 4:
             System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            
        default :
            System.out.println("No existe un valor para tipo de bomba");
         }
        
        
        
    }
    
}
