/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.dieciocho_18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;

        String numero1 = "";
        String numero2 = "";
        String numero3 = "";
        String numero4 = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");
        do {
            String cad = "";

            int num = leer.nextInt();

            if (num > 0 && num < 21) {
                cont = cont + 1;

                for (int i = 0; i < num; i++) {
                    cad = cad + "*";

                }
                if (cont == 1) {
                    numero1 = num + cad;

                }
                if (cont == 2) {
                    numero2 = num + cad;

                }
                if (cont == 3) {
                    numero3 = num + cad;

                }
                if (cont == 4) {
                    numero4 = num + cad;

                }

            } else {
                System.out.println("DEBE INGRESAR NUMERO ENTRE 1 Y 20 UNICAMENTE");

            }

        } while (cont < 4);
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
    }

}
