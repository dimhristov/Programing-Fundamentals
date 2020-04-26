import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int  population = Integer.parseInt(scan.nextLine());
        double area = Double.parseDouble(scan.nextLine());

        System.out.println(String.format("Town %s has population of %d and area %.0f square km.", name, population, area));
    }
}



