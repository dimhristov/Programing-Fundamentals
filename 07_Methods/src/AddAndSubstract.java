import java.util.Scanner;

public class AddAndSubstract {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        sum(first, second);
        System.out.println(substract(sum(first, second), third));
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int substract(int sum, int b) {
        int totalSum = sum - b;
        return totalSum;
    }
}
