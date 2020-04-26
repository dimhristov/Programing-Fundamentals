package com.company;

import javax.xml.namespace.QName;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String regex = "%(?<name>[A-Z][a-z]+)%(?:[^|$%.]*)<(?<product>\\w+)>(?:[^|$%.]*)\\|(?<count>[0-9]+)\\|(?:[^|$%.]*?)(?<price>[\\[\\d]?[\\d]+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scan.nextLine();

        double totalIncome = 0.0;

        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price =count * Double.parseDouble(matcher.group("price"));
                System.out.println(String.format("%s: %s - %.2f",name,product,price));
                totalIncome +=price;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("Total income: %.2f",totalIncome));
    }
}
