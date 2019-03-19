package TableInt;

import java.security.SecureRandom;
import java.util.Scanner;

public interface BiggestValueInTable {

    Scanner inputX= new Scanner(System.in);
    static SecureRandom randomBigTable = new SecureRandom();
    int nextInt = 1+randomBigTable.nextInt();

    static void seekingBigValueInTable() {
        int x;
        int big=0,small=0;

        System.out.println('\n'+" Z ilu elementów ma się składać jednowymiarowa tablica?");
        x =inputX.nextInt();
        int[] bigTable= new int[x];
        int[] biggest = new int[1];
        biggest[0]=0;
        int[] smallest = new int[1];
        smallest[0]=255;

        for (short i=0;i<bigTable.length;i++) {
            bigTable[i]=1+randomBigTable.nextInt(255)-1;
            System.out.print('\n'+"Position: "+(i+1)+" | "+bigTable[i]);
            if (bigTable[i] > biggest[0]) {
                biggest[0] = bigTable[i];
                big=i+1;
            }
            if (bigTable[i] < smallest[0]) {
                smallest[0] = bigTable[i];
                small=i+1;
            }
        }
        System.out.println('\n'+" |"+big+"| "+ biggest[0]+" : highest value");
        System.out.println('\n'+" |"+small+"| "+ smallest[0]+" : lowest value");
    }

}
