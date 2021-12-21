/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.ocho_8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String frase;
        String fraseC = "eureka";

        System.out.println("Ingrese una frase");
        
        frase = scan.next();
        if (frase.equals(fraseC)) {
            System.out.println("FRASE CORRECTA");

        } else {
            System.out.println("Frase incorrecta");
        }

    }

}
