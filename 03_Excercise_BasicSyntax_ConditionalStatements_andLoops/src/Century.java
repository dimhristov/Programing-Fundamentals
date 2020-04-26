import java.util.Scanner;

public class Century {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int century = Integer.parseInt(scan.nextLine());
        int years = century * 100;
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println(String.format("%d centuries = %d years = %d days = %d hours = %d minutes", century,years,days,hours,minutes));
    }
}
