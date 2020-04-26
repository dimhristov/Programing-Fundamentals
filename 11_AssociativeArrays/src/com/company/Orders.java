package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        LinkedHashMap<String,Double> products = new LinkedHashMap<>();

        while (!"buy".equals(input[0])) {
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);
            double totalAmount = price * quantity;

            products.putIfAbsent(name,0.0);


            if (products.get(name) != 0.0) {
                int oldQuantity = (int)(products.get(name)/price);
                totalAmount = price * (oldQuantity+quantity);

                products.put(name, totalAmount);
            } else {
                double oldAmount = products.get(name);
                products.put(name, oldAmount + totalAmount);
            }


            input = scan.nextLine().split(" ");
        }
        products
                .entrySet()
                .forEach(entry -> System.out.println(String.format("%s -> %.2f", entry.getKey(), entry.getValue())));
    }
}
