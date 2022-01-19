
package Ejercicio.diecinueve_19;

import java.util.Scanner;


public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantEuros ;
        String moneda;
      
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese cantidad de euros para convertir");
        cantEuros = teclado.nextDouble();
        
        System.out.println("ESCRIBA MONEDA A CONVERTIR : dolares , yenes o libras ");
        moneda = teclado.next();
        
       
        convertir (cantEuros,moneda);
        
        
        
    }
     public static String convertir (double euro, String monedass){
        String resultado="";
        double calculo;
        if ("dolares".equals(monedass)){
            calculo = euro * 1.28611 ; 
            System.out.println(calculo+ " $ es " + euro+ " €" );
        }
        if ("yenes".equals(monedass)){
            calculo = euro * 129.852 ; 
            System.out.println(calculo+ " yenes es " + euro+ " €" );
        }
        if ("libras".equals(monedass)){
            calculo = euro * 0.86 ; 
            System.out.println(calculo+ " libras es " + euro+ " €" );
        }
        
        
        return resultado ;
    }
        
    
    }
    

