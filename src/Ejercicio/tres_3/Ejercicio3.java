
package Ejercicio.tres_3;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("INGRESE UNA FRASE");
        String frase = scan.next();

        System.out.println("la frase en mayusculas " + frase.toUpperCase());
        System.out.println("la frase en minisculas " + frase.toLowerCase());

    }
    
    
}
