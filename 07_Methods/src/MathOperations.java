import java.util.Scanner;

public class MathOperations {

    private static double calculate(int a, char operand, int b) {
        double result = 0;
        switch (operand) {
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        char operand = scan.nextLine().charAt(0);
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(String.format("%.0f",calculate(a,operand,b)));

    }
}
