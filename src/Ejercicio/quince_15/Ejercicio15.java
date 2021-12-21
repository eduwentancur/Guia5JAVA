/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.quince_15;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int num;

        for (int i = 1; i <= 20; i++) {
            System.out.println("ingrese numero");
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
            if (num < 0) {
                System.out.println("El numero ingresado es Negativo con lo cual no se va a seguir sumando");
                continue;
            }

            suma = suma + num;

        }

        System.out.println("La suma de los numeros positivos es de: " + suma);
    }
    
}
