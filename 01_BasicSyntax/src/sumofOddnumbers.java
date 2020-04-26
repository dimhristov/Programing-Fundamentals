import java.util.Scanner;

public class sumofOddnumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumOfOddNumbers = 0;
        int currentNum = 0;
        int sum = 0;
        for (int i = 1; i <100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum +=i;
                currentNum++;
            }
            if (currentNum == n) {
                break;
            }


        }
        System.out.printf("Sum: %d",sum);
    }
}
