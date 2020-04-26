import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        boolean isPasswordCorrect = isValidPassword(password);


    }

    public static boolean isValidPassword(String password) {
        boolean isEnoughLength = isLengthCorrect(password);
        boolean isLetterAndDigits = isOnlyOfLettersAndDigits(password);
        boolean haveAtLeast2Digits = isThere2Digits(password);


        if (isEnoughLength && isLetterAndDigits && haveAtLeast2Digits) {
            System.out.println("Password is valid");

        }
        return false;


    }

    public static boolean isLengthCorrect(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean isOnlyOfLettersAndDigits(String password) {
        if (password.matches("[a-zA-Z0-9]*")) {
            return true;
        } else {
            System.out.println("Password must consist only of letters and digits");
            return false;
        }
    }

    public static boolean isThere2Digits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (counter == 2) {
                return true;
            }

            if (Character.isDigit(symbol)) {
                counter++;
            }
            if (counter == 2) {
                break;
            }

        }
        if (counter == 2) {
            return true;


        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }
}
