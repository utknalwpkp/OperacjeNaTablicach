import TableInt.ArrayLists;
import TableInt.BiggestValueInTable;
import TableInt.SeekTheValue;
import TableInt.Tablice;

public class OperacjeNaTablicach implements Tablice, BiggestValueInTable, ArrayLists, SeekTheValue {
    public static void main(String[] args) {

        /*Tablice.amountOf2IntTable();
        System.out.println('\n');
        Tablice.printBoard();
        System.out.println('\n');
        BiggestValueInTable.seekingBigValueInTable();
        System.out.println('\n');*/
        System.out.println("*****************************************ARRAYLISTS*********************************************************");
        ArrayLists.amountforTwoArrays();
        System.out.println("Podjecie próby znalezienia dwóch największych liczb w ArrayList pairs bez udziału zaawansowanych algorytmów");
        ArrayLists.twoBiggestValues();
        System.out.println('\n'+"********************************************************************************************************");
//        System.out.println("Szukanie ciągu za pomocą interfejsu SeekTheValue");
//        SeekTheValue.seekTheValue();
    }
}
