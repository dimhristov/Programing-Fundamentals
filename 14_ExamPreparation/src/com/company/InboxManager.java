package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class InboxManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<String>> users = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Statistics")) {
            String[] tokens = input.split("->");
            String command = tokens[0];
            String name = tokens[1];

            switch (command) {
                case "Add":
                    if (users.containsKey(name)) {
                        System.out.println(String.format("%s is already registered",name));
                    }
                    users.putIfAbsent(name, new ArrayList<>());
                    break;
                case "Send":
                    String email = tokens[2];
                    users.get(name).add(email);
                    break;
                case "Delete":
                    if (users.containsKey(name)) {
                        users.remove(name);
                    } else {
                        System.out.println(String.format("%s not found!", name));
                    }
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println(String.format("Users count: %d",users.size()));
        users
                .entrySet()
                .stream()
                .sorted((a1,a2) -> a2.getValue().size() - a1.getValue().size())
                .forEach(a -> {
                    System.out.println(a.getKey());
                    printList(a.getValue());

                });
    }

    private static void printList(ArrayList<String> emails) {
        for (int i = 0; i <emails.size() ; i++) {
            System.out.println(String.format("- %s",emails.get(i)));
        }
        return;
    }
}
