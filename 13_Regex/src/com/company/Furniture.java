package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> furniture = new ArrayList<>();
        double finalPrice = 0.0;

        Pattern pattern = Pattern.compile(">>(\\w+)<<([0-9]+\\.?[0-9]*)!([0-9]+)");


        String input = scan.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                furniture.add(name);
                finalPrice += price * quantity;
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture
                .forEach(f -> System.out.println(f));
        System.out.println(String.format("Total money spend: %.2f",finalPrice));
    }
}
