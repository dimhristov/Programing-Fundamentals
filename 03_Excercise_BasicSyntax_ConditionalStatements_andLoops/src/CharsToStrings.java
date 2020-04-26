import java.util.Scanner;

public class CharsToStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char one = scan.nextLine().charAt(0);
        char two = scan.nextLine().charAt(0);
        char three = scan.nextLine().charAt(0);
        String sum = one + "" + two + three;
        System.out.println(sum);
    }
}
