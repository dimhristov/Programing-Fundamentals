import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalCoins = 0;
        double productPrice = 0;
        double priceCost = 0;


        while (!input.equals("Start")) {

            double coinsInserted = Double.parseDouble(input);
            if (coinsInserted == 0.1 || coinsInserted == 0.2 || coinsInserted == 0.5 || coinsInserted == 1 || coinsInserted == 2) {
                totalCoins += coinsInserted;

            } else {
                System.out.printf("Cannot accept %.2f", coinsInserted).println();
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    productPrice = 2;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1;
                    break;
                default:
                    System.out.println("Invalid product");
            }
            //priceCost += productPrice;
            if (totalCoins >= productPrice && totalCoins >0) {
                System.out.printf("Purchased %s", input).println();
                totalCoins -= productPrice;
            } else if (totalCoins < productPrice && totalCoins !=0){
                System.out.println("Sorry, not enough money");
            }

            input = scan.nextLine();
        }

        System.out.printf("Change: %.2f", totalCoins);

    }
}
