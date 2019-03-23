package TableInt;

import java.security.SecureRandom;
import java.util.Scanner;

public interface SeekTheValue {


    static void seekTheValue() {
        Scanner inputForSearching = new Scanner(System.in);
        SecureRandom randomize = new SecureRandom();
        int nextInt = 1+randomize.nextInt();
        int x;
        System.out.println('\n'+"*************************************************************************************************************");
        System.out.println("Wprowadź ile elementów ma się znajdować w jednowymiarowej tablicy");
        x=inputForSearching.nextInt();
        System.out.println('\n'+"Pozycja nr : ");
        int[] arrayint = new int[x];
        for (short i=0;i<arrayint.length;i++) {
            arrayint[i]=1+randomize.nextInt(255);
            System.out.println("|"+(i+1)+" | "+arrayint[i]+"");
        }
        System.out.println('\n');
        System.out.println("Wprowadź poszukiwaną wartość");
        int seekValue=inputForSearching.nextInt();
        for (short i=0;i<arrayint.length;i++) {
            if (arrayint[i]==seekValue) {
                System.out.println('\n'+" Znaleziono szukaną wartość na pozycji: "+(i+1)+" | "+arrayint[i]+" |");

            }
        }
    }
}
