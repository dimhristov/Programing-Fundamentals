import java.util.Scanner;

public class Multiplicaitonx2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());

        int ravno = 0;

        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {

                ravno = number * i;
                System.out.printf("%d X %d = %d", number, i, ravno).println();
            }
            } else{
                ravno = number * multiplier;
                System.out.printf("%d X %d = %d", number, multiplier, ravno).println();


            }

        }
    }

