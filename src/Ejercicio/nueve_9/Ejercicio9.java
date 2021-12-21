/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.nueve_9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String frase;
        int largo;

        do {
            System.out.println("Ingrese una palabra o frase");
            
            frase = scan.nextLine();
            largo = frase.length();

            if (largo == 8) {
                System.out.println("Correcto");

            } else {
                System.out.println("Incorrecto");
            }

        } while (largo != 8);

    }

}
