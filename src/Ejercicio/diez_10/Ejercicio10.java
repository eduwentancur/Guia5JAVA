/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.diez_10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String frase;
        String letra = "A";
        String letra1;
        System.out.println("Ingrese una frase o palabra");
        
        frase = scan.next();
        letra1 = frase.substring(0, 1);

        if (letra1.equals(letra)) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }
    }

}
