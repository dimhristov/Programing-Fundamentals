import java.util.Scanner;

public class CreateMethod {

    public static void printSign(int num) {
        if (num > 0) {
            System.out.println(String.format("The number %d is .", num));
        } else if (num < 0) {
            System.out.println(String.format("The number %d is negative.",num));
        } else {
            System.out.println(String.format("The number %d is zero.",num));
        }
        }

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            int number = Integer.parseInt(input);

            printSign(number);
        }


    }
