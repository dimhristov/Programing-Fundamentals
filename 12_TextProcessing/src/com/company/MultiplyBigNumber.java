package com.company;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numberAsString = scan.nextLine();
        int multiplier = Integer.parseInt(scan.nextLine());
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        if (multiplier == 0) {
            System.out.println(0);
            return;
        }
        while (numberAsString.charAt(0) == '0') {
            numberAsString = numberAsString.substring(1);
        }

        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            int product = digit * multiplier + reminder;

            result.append(product % 10);
            reminder = product/10;

        }
        if (reminder != 0) {
            result.append(reminder);
        }

        System.out.println(result.reverse());


    }
}
