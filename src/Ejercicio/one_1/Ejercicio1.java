
package Ejercicio.one_1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num1, num2; 
        System.out.println("Ingrese 2 numero");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println("El resultado de los numeros ingresado es " + (num1 + num2));

    }

}
