import java.math.BigDecimal;
import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());



        double km = meters / 1000.0;

        System.out.printf("%.2f",km);

    }
}
