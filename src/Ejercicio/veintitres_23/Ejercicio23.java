package Ejercicio.veintitres_23;

public class Ejercicio23 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];
        int[][] matrizTraspuesta1 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print("|" + matriz[i][j] + "|");

            }
            System.out.println(" ");

        }
        System.out.println("--------------------- ");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizTraspuesta[i][j] = matriz[i][j];
                System.out.print("|" + matrizTraspuesta[i][j] + "|");

            }
            int i = 0;
            System.out.println("");

        }
        System.out.println("--------------------- ");
        
    }

}
