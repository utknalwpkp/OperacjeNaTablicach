import TableInt.Arrays;
import TableInt.BiggestValueInTable;
import TableInt.Tablice;

public class OperacjeNaTablicach implements Tablice, BiggestValueInTable, Arrays {
    public static void main(String[] args) {

        Tablice.amountOf2IntTable();
        System.out.println('\n');
        Tablice.printBoard();
        System.out.println('\n');
        BiggestValueInTable.seekingBigValueInTable();
        System.out.println('\n');
        Arrays.amountforTwoArays();
    }
}
