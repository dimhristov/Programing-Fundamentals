import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = " ";
        boolean isLogged = false;
        int counter = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        for (int i = 1; i <= 4; i++) {
            String currentPassword = scan.nextLine();
            if (currentPassword.equals(password)) {
                isLogged = true;
                counter = 1;
                System.out.print(String.format("User %s logged in.", username));
                break;
            } else if ( i<4) {
                System.out.println("Incorrect password. Try again.");

            }

        }
        if (counter == 1) {
            System.out.println(String.format("User %s blocked!", username));
        }
    }
}
