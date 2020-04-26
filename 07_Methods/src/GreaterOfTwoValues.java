import java.util.Scanner;

public class GreaterOfTwoValues {

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static char getMax(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        if (input.equals("int")) {
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            System.out.println(getMax(a, b));
        } else if (input.equals("char")) {
            char a = scan.nextLine().charAt(0);
            char b = scan.nextLine().charAt(0);
            System.out.println(getMax(a, b));
        } else if (input.equals("string")) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            System.out.println(getMax(a, b));
        }


    }
}
