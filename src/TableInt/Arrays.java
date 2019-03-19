package TableInt;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Objects;

public interface Arrays {
    ArrayList arrayOne = new ArrayList<Integer>(3);
    ArrayList arrayTwo = new ArrayList<Integer>(3);
    Object amountArrayOne = new Object();
    Integer amountArrayTwo=0;

    static void amountforTwoArays() {
        
        SecureRandom randomForArrays = new SecureRandom();
        int nextInt = 1+randomForArrays.nextInt();
        System.out.println("*******************************************************************************************************************************************"+'\n');
        System.out.println("ArrayLists now....");
        
        for (short i=0; i<3; i++) {
                arrayOne.add(1+randomForArrays.nextInt(255)); //1+randomForArrays.nextInt(255);
                arrayTwo.add(1+2+randomForArrays.nextInt(255)-2);
        }
        for (short i=0; i<3; i++) {
            System.out.printf(arrayOne.get(i)+" | ");
            setAmountArrayOne(arrayOne.get(i),amountArrayOne);
        }
        System.out.println('\n'+setAmountArrayOne(arrayOne,amountArrayOne));
        System.out.println('\n');
        for (short i=0;i<3;i++) {
            System.out.printf(arrayTwo.get(i)+" | ");
        }
    }

    static Integer setAmountArrayOne(Object a, Object b) {
        a += b;
        return (Integer) a;
    }

}
