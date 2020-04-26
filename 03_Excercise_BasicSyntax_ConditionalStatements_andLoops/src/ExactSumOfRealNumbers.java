import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigDecimal num = new BigDecimal(0);
        BigDecimal result = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            num = new BigDecimal(scan.next());
            result = result.add(num);

        }
        System.out.println(result);
    }
}
