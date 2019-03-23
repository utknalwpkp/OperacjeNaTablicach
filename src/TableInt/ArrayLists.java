package TableInt;

import com.sun.jdi.IntegerValue;

import java.security.SecureRandom;
import java.sql.Time;
import java.util.*;

//import static com.sun.tools.classfile.Instruction.TypeKind.get;
//import static java.lang.Integer.parseInt;

public interface ArrayLists {
    static void amountforTwoArrays() {
        SecureRandom randomForArrays = new SecureRandom();
        int nextInt = 1 + randomForArrays.nextInt();
        System.out.println("*******************************************************************************************************************************************" + '\n');
        System.out.println("ArrayLists now....");
        Scanner arrayCapacity = new Scanner(System.in);
        System.out.println('\n'+"Wprowadź ile elementów mają zawierać obie Listy");
        int x=arrayCapacity.nextInt();
        ArrayList arrayOne = new ArrayList<Integer>(x);
        ArrayList arrayTwo = new ArrayList<Integer>(x);

        for (int i = 0; i < x; i++) {
            arrayOne.add(1 + randomForArrays.nextInt(255));
            arrayTwo.add(1 + randomForArrays.nextInt(255));
        }
        System.out.println('\n'+"**************************************** arrayOne *********************************************************************************************");

        for (int i = 0; i < x; i++) {
            System.out.printf(" |No."+(i+1)+"| "+arrayOne.get(i)+"| ");
        }
        System.out.println('\n'+"**************************************** arrayTwo *********************************************************************************************");
        for (int i = 0;i < x;i++) {
            System.out.printf(" |No."+(i+1)+"| "+arrayTwo.get(i)+"| ");
        }

        System.out.println('\n'+"Wprowadź szukaną liczbę");
        ArrayList seekValue=new ArrayList<Integer>(1);
        seekValue.add(arrayCapacity.nextInt());
        ArrayList bigArrayValue=new ArrayList<Integer>(1);
        ArrayList smallArrayValue=new ArrayList<Integer>(1);
        bigArrayValue.add(0,0);
        smallArrayValue.add(0,255);
        int big=0,small=255,iCopyBigOne=0,iCopySmallOne=0,amountOfOne=0,amountofTwo=0;
        int[] check=new int[1];
        for (int i=0;i<x;i++) {

            if (arrayOne.get(i).equals(seekValue.get(0))) {
                System.out.println("Znaleziono w ArrayList arrayOne na pozycji: " + (i + 1) + "| " + arrayOne.get(i) + "| ");

            }
            if (arrayTwo.get(i).equals(seekValue.get(0))) {
                System.out.println("Znaleziono w ArrayList arraytwo na pozycji: " + (i + 1) + " | " + arrayTwo.get(i) + " | ");
            }
            check[0] = (int) arrayOne.get(i);
            if (check[0] > big) {
                bigArrayValue.add(0, arrayOne.get(i));
                big = check[0];
                iCopyBigOne=i;

            }
            if (check[0] < small) {
                smallArrayValue.add(0, arrayOne.get(i));
                small = check[0];
                iCopySmallOne=i;
            }
            amountOfOne+= (int) arrayOne.get(i);
            amountofTwo+= (int) arrayTwo.get(i);
        }
            System.out.println("Highest Value of ArrayList arrayOne is: "+bigArrayValue.get(0)+ " | position: "+(iCopyBigOne+1));
            System.out.println("Lowest Value of ArrayList arrayOne is: "+smallArrayValue.get(0)+ " | position: "+(iCopySmallOne+1));
            System.out.println("Amount of ArrayList arrayOne is: "+amountOfOne);
            System.out.println("Amount of ArrayList arrayTwo is: "+amountofTwo);
    }
    static void twoBiggestValues() {
        System.out.println("Ile liczb będzie potrzebnych?");
        Scanner inputX = new Scanner(System.in);
        int x= inputX.nextInt();
        inputX.useLocale(Locale.GERMANY);
        ArrayList pairs = new ArrayList<Integer>(x);
        SecureRandom randomForPairs = new SecureRandom();
        int nextInt= 1+randomForPairs.nextInt();
        int value=0,previousValue=0,valueOne=0,valueTwo=0,valueThree=0,iCopyOne=0,icopyTwo=0;
        for (short i = 0 ; i < x ; i++) pairs.add(i, 1 + randomForPairs.nextInt(255));
        for (short i = 0 ; i < x ; i++) System.out.printf("|No."+(i+1)+" |"+pairs.get(i)+" ");

        for (int i = 0; i < x ; i++) {
            valueOne = (int) pairs.get(i);

            if (valueOne > value) {
                valueTwo = value;
                value = valueOne;
                iCopyOne=i;
            }
        }
        for (int i = 0; i < x ; i++) {
            valueOne = (int) pairs.get(i);

            if (valueOne > previousValue && previousValue != value && iCopyOne!=i) {
                valueTwo = previousValue;
                previousValue = valueOne;
                icopyTwo=i;
            }
        }
        System.out.println('\n'+"Oto największa para liczb z ArrayList pairs: "+"Pozycja iCopyOne:"+(iCopyOne+1)+"| "+value+"|"+previousValue+"|Pozycja iCopyTwo:"+(icopyTwo+1));
    }
}
