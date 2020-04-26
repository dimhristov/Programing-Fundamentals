import java.util.Scanner;

public class PrintPartsOfTheASCITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        char result = 0;

        for (int i = first; i <=second ; i++) {

            System.out.print((char)i + " ");

        }
    }
}
