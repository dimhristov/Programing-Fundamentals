import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", (double) factorial(a) / factorial(b));
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n ; i++) {
            factorial *= i;
        }
        return factorial;
    }

}