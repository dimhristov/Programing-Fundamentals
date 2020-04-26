import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());


        if (n <= p) {
            System.out.println("1");
        }else {
            double courses = (Math.ceil(n*1.0 / p));
            System.out.println(String.format("%.0f",courses));
        }
    }
}
