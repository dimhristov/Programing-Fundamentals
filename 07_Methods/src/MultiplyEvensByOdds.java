import java.util.Scanner;

public class MultiplyEvensByOdds {

    private static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getSumOfEvenDigits(n);
        int oddSum = getSumOfOddDigits(n);

        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int currentDigit = 0;
        int evenSum = 0;
        while (n > 0) {
            currentDigit = n % 10;

            if (currentDigit % 2 == 0)
            evenSum += currentDigit;

            n = n / 10;
        }
        return evenSum;
    }

    private static int getSumOfOddDigits(int n) {
        int currentDigit = 0;
        int oddSum = 0;
        while (n > 0) {
            currentDigit = n % 10;
            if (currentDigit % 2 != 0)
                oddSum += currentDigit;

                n = n / 10;

        }
        return oddSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        number = Math.abs(number);
        System.out.println(getMultipleOfEvensAndOdds(number));

    }
}
