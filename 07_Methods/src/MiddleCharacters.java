import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        printMiddleCharacters(input);


    }

    public static void printMiddleCharacters(String name) {
        for (int i = 0; i < name.length(); i++) {

        }
        if (name.length() % 2 == 0) {
            System.out.print(name.charAt((name.length() / 2)-1));
            System.out.print(name.charAt(name.length() / 2));
        } else {
            System.out.print(name.charAt(name.length() / 2));

        }
    }
}