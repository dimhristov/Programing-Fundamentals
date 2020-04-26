import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            System.out.println(palindrome(number));
            input = scan.nextLine();
        }

    }

    public static boolean palindrome(int input) {
        int palindrome = input;
        int reversed = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reversed = reversed * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return input == reversed;
    }
}
