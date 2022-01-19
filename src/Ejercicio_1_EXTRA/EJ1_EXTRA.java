/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1_EXTRA;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ1_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un tiempo que es equivalente a minutos");
        int tiempo =teclado.nextInt();
        
        int dia = tiempo / 1440;
        int aux = tiempo - 1440 ;
        int h = aux / 60 ; 
        
        
        
        System.out.println(dia+" DIAS "+h+" horas" );
        
        
        
        
        
    }
    
}
