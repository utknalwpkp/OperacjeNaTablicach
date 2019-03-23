package TableInt;

import java.util.Random;
import java.util.Scanner;

 public interface Tablice {
    int[][] tabInt1 = new int[3][3];
    int[][] tabInt2 = new int[3][3];

     static void amountOf2IntTable() {
         int sumOfIntTable1=0;
         int sumofIntTable2=0;
//         Scanner inputInt= new Scanner(System.in);
         Random randomNumbers = new Random();
         int nextInt = 1+randomNumbers.nextInt();
         for (short i=0; i<tabInt1.length;i++) {

             for (short j=0; j<tabInt1.length;j++) {
    /*            System.out.println("Wprowadz liczbę dla tabInt1[i][j]");
                tabInt1[i][j]= inputInt.nextInt();

                System.out.println("A teraz wprowadz liczbę dla tabInt2[i][j]");
                tabInt2[i][j]= inputInt.nextInt();                              */

                 tabInt1[i][j] = 1+randomNumbers.nextInt(255);
                 sumOfIntTable1 += tabInt1[i][j];
                 tabInt2[i][j] = 1-2+randomNumbers.nextInt(255);
                 sumofIntTable2 += tabInt2[i][j];
             }
         }
         if (sumOfIntTable1>sumofIntTable2) {
             System.out.println("Suma liczb w tabInt1 jest większa "+sumOfIntTable1+" | "+sumofIntTable2);
         } else System.out.println("Suma liczb w tabInt2 jest większa "+sumofIntTable2+ " | "+sumOfIntTable1);
     }
    static void printBoard() {
        System.out.println('\n');
        for (short i=0; i<tabInt1.length;i++) {
            for (short j=0; j<tabInt1.length; j++) {
                System.out.printf(" | " + tabInt1[i][j]);
            }
            System.out.println('\n');
        }
        System.out.println('\n');
        for (short i=0; i<tabInt2.length;i++) {
            for (short j=0; j<tabInt2.length; j++) {
                System.out.printf(" | " + tabInt2[i][j]);
            }
            System.out.println('\n');
        }
        System.out.println('\n');
    }
}/*default void amountOf2IntTable() {
        int sumOfIntTable1=0;
        int sumofIntTable2=0;
        Scanner inputInt= new Scanner(System.in);
        for (short i=0; i<tabInt1.length;i++) {

            for (short j=0; j<tabInt1.length;j++) {
                System.out.println("Wprowadz liczbę dla tabInt1[i][j]");
                tabInt1[i][j]= inputInt.nextInt();

                System.out.println("A teraz wprowadz liczbę dla tabInt2[i][j]");
                tabInt2[i][j]= inputInt.nextInt();
                sumOfIntTable1 = tabInt1[i][j] + sumOfIntTable1;
                sumofIntTable2 = tabInt2[i][j] + sumofIntTable2;
            }
        }
        if (sumOfIntTable1>sumofIntTable2) {
            System.out.println("Suma liczb w tabInt1 jest większa");
        } else System.out.println("Suma liczb w tabInt2 jest większa");
    }*/
