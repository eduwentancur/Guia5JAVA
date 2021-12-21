
package Ejercicio.veintidos_22;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio22 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int unDigito = 0;
        int dosDigito = 0;  
        int tresDigito = 0;
        int cuatroDigito=0;
        int cincoDigito=0;
        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        
        for (int i=0 ; i<n;i++){
            vec[i]=(int)(Math.random()*99999+1);
            System.out.print("|"+ vec[i]+ "|");
            if (vec[i]>=0 && vec[i]<10){
                unDigito++;
            }else if (vec[i]>9 && vec[i]<100){
                dosDigito++;
            }else if (vec[i]>99 && vec[i]<1000){
                tresDigito++;
            }else if (vec[i]>999 && vec[i]<10000){
                cuatroDigito++;    
            }else if (vec[i]>9999 && vec[i]<100000){
                cincoDigito++;
            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de numeros con 1 digito : "+unDigito);
        System.out.println("La cantidad de numeros con 2 digito : "+dosDigito);
        System.out.println("La cantidad de numeros con 3 digito : "+tresDigito);
        System.out.println("La cantidad de numeros con 4 digito : "+cuatroDigito);
        System.out.println("La cantidad de numeros con 5 digito : "+cincoDigito);
        
    }
    
}
