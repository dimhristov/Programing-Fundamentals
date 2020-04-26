import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Double.parseDouble(scan.nextLine());
        double second = Double.parseDouble(scan.nextLine());

        factoriel(first);
        factoriel(second);

        double result = factoriel(first) / factoriel(second) * 1.00;
        System.out.println(String.format("%.2f", result));
    }

    public static double factoriel(double num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;

        }
        return sum;

    }
}
