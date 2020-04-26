import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double price = 0;
        double totalPrice = 0;

        if ("Students".equals(type)) {
            switch (day) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
            totalPrice = people * price;
            if (people >= 30){
                totalPrice = totalPrice - 0.15 * totalPrice;
            }
            System.out.println(String.format("Total price: %.2f", totalPrice));
        }
        if (type.equals("business")) {
            switch (day) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }
            totalPrice = people * price;
            if (people >= 100){
                totalPrice = (people - 10 ) * price;
            }
            System.out.println(String.format("Total price: %.2f", totalPrice));
        }
        if (type.equals("Regular")) {
            switch (day) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
            totalPrice = people * price;
            if (people >= 10 && people   <=20){
                totalPrice = totalPrice - 0.05 * totalPrice;

            }
            System.out.println(String.format("Total price: %.2f", totalPrice));
        }
    }
}


