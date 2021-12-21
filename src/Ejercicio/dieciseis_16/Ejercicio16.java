/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.dieciseis_16;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String cad;
        String x ="";
        String o="";
        
        int log;
        int correctas = 0;
        int incorrectas = 0;
        do {
            System.out.println("Ingrese una secuencia de caracteres,  si desea salir ingresar &&&&& ");
           
            cad = scan.next();
            
            log = cad.length();
           
            cad=cad.toUpperCase();
            
            if ("X".equals(cad.substring(0, 1)) && "O".equals(o=cad.substring(log-1, log)) && log <= 5) {
                correctas = correctas + 1 ;
                
            }else {
                incorrectas = incorrectas + 1;
                
            }

        } while (!"&&&&&".equals(cad.substring(0, log)));

        System.out.println("Las cadenas correctas son : " + correctas);
        System.out.println("Las cadenas incorrectas son : "+(incorrectas-1));
    }
    
}
