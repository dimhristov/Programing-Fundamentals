package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LinkedHashMap<String,Integer> resources = new LinkedHashMap<>();

        while (!"stop".equals(input)) {
                int count = Integer.parseInt(scan.nextLine());

            resources.putIfAbsent(input, 0);
            int oldCount = resources.get(input);
            resources.put(input, oldCount + count);

            input = scan.nextLine();

        }
        resources
                .entrySet()
                .forEach(entry -> System.out.println(String.format("%s -> %d", entry.getKey(), entry.getValue())));
    }
}
