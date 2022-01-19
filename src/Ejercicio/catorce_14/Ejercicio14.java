/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.catorce_14;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
      
        String s = " ";
        System.out.println("INGRESE 2 NUMEROS");
        
        double num1 = scan.nextDouble();
        
        double num2 = scan.nextDouble();

        do{
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("ELIJA OPCION: ");
            
            int opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("LA SUMA ES DE: " + " " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("LA RESTA ES DE: " + " " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("LA MULTIPLICACION ES: " + " " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("LA DIVISION ES DE : " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Estas seguro que desea salir del programa (S/N)? ");
                    
                    s = scan.next().toUpperCase();
                    break;
                   }
      
        }while (!s.equals("S"));
        System.out.println("ADIOSSSSSS!");
            
        }
       
    }
    

