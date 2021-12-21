/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.doce_12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nota;
        do {
            System.out.println("INGRESE UNA NOTA QUE ESTE ENTRE 0 Y 10 ");

            nota = scan.nextInt();
        } while (nota < 0 || nota > 10);
        System.out.println("NOTA CORRECTA" + " " + (nota));
    }
}
