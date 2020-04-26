import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printTopNumbers(n);
    }

    public static void printTopNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (divisibleByEight(i) && isHavingOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean divisibleByEight(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        if (sum % 8 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isHavingOneOddDigit(int n){
        if (n % 2 !=0) {
            return true;
        } else {
            return false;
        }
    }
}
