/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.cinco_5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double num;
        double num_doble;
        double num_triple;

        System.out.println("Ingrese un numero");

        num = scan.nextInt();

        num_doble = num * 2;
        num_triple = num * 3;
        double raiz = Math.sqrt(num);

        System.out.println("El doble de " + (num) + " es : " + (num_doble));
        System.out.println("El triple de " + (num) + " es : " + (num_triple));
        System.out.println("La raiz cuadrad es " + (raiz));

    }

}
