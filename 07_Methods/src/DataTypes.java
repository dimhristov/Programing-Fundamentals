import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (input.equals("int")) {

            int num = Integer.parseInt(scan.nextLine());
            System.out.println(String.format("%.0f",multiply(num, 2)));

        } else if (input.equals("real")) {

            double num = Double.parseDouble(scan.nextLine());

            System.out.println(String.format("%.2f",multiply(num,1.5)));



        } else if (input.equals("string")) {

            String text = scan.nextLine();
            surround(text);
        }

    }
    public static double multiply(double n, double b){
        double sum = n * b;

        return sum;
    }
    public static void surround(String input){
        System.out.println(String.format("$%s$",input));
    }
}
