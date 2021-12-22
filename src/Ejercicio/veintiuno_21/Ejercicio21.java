/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.veintiuno_21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        System.out.println("INGRESE UN NUMERO PARA BUSCAR EN EL VECTOR");
        int num = leer.nextInt();
        for (int i=0 ; i<n ; i++){
            vec[i]= (int)(Math.random()*5+1);
            System.out.print("|"+ vec[i]+"|");
      
        }
        System.out.println(" ");
        int cont =0 ;
        String pos=" ";
        for (int i=0;i<n ; i++){
            if (num == vec[i]){
                System.out.println("La posicion que se encuenta el numero "+num+" es en la posicion "+i);
                pos =pos+ i +" ";  
                cont = cont+  1 ;
            }
            
        
        
        }
        if (cont < cont +1 ){
                System.out.println("Las veces que se encuentra el numero "+num+   " es de " + cont );
            }
        
        if (pos !=" "){
            System.out.println("LAS POSICIONES SON:"+ pos);
        }
    }
    
}
