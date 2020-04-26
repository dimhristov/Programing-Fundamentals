import java.util.Scanner;

public class ContactNames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String secondName = scan.nextLine();
        String symbol = scan.nextLine();

        System.out.println(String.format("%s%s%s",name,symbol,secondName));
    }
}
