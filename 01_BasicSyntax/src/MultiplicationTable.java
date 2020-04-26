import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int ravno = 0;
        for (int i = 1; i <=10 ; i++) {

            ravno = number * i ;
            System.out.printf("%d X %d = %d", number,i,ravno).println();


        }

    }
}
