package TableInt;

import java.lang.reflect.Array;
import java.security.SecureRandom;

public interface Arrays {
    Array[][] arrayOne = new Array[3][3];
    Array[][] arrayTwo = new Array[3][3];


    static void amountforTwoArays() {
//        Integer amountArrayOne=0;
//        Integer amountArrayTwo;
        SecureRandom randomForArrays = new SecureRandom();
        int nextInt = 1+randomForArrays.nextInt();

        for (int i=0; i<arrayOne.length; i++) {
            for (int j=0; j<arrayOne.length; j++) {
                arrayOne[i][j].set(i,j,1+randomForArrays.nextInt(255)); //1+randomForArrays.nextInt(255);
                arrayTwo[i][j].set(i,j,1+randomForArrays.nextInt(255));
            }
        }
        for (int i=0; i<arrayOne.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                System.out.println(arrayOne.length);
            }        }
    }

}
