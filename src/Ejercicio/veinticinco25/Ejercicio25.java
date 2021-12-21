package Ejercicio.veinticinco25;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num = 0, i = 0, j = 0, suma = 0, resul1 = 0, k = 1;
        int cont = 0;
        System.out.println("Ingrese un valor");
        int n = teclado.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese un numero, este numero debe ser del 1 al 9 unicamente");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                do {
                    num = teclado.nextInt();
                    if (num > 0 && num < 10) {
                        matriz[i][j] = num;
                    } else {
                        System.out.println("Numero incorrecto");
                    }
                } while (num == 0 || num > 10);
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                suma = suma + matriz[i][j];
            }
            resul1 = suma;
            System.out.println("la suma de la fila " + k + " es de " + resul1);
            suma = 0;
            k++;
        }
        suma = 0;
        k = 1;
        int resul2 = 0;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                suma = suma + matriz[j][i];
            }
            resul2 = suma;

            System.out.println("La suma de la columna " + k + " es de " + suma);
            suma = 0;
            k++;

        }
        suma = 0;
        int resul3 = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    suma = suma + matriz[i][j];
                }
            }
            resul3 = resul3 + suma;
            suma = 0;
        }
        System.out.println("la suma de la diagonal principal es de " + resul3);
        suma = 0;
        int resul4 = 0;
        j = n;
        for (i = 0; i < n; i++) {
            suma = suma + matriz[i][j - 1];
            j = j - 1;
            resul4 = resul4 + suma;
            suma = 0;
        }
        System.out.println("la suma de la diagonal secundaria es de " + resul4);
        if (resul1 == resul2 && resul3 == resul4) {
            System.out.println("MAGICA");
        } else {
            System.out.println("no magica");
        }
    }
}
