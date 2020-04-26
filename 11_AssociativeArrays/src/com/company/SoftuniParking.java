package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String,String> users = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            String name = input[1];
            String number = "";
            if (command.equals("register")) {
              number = input[2];
            }

            if (command.equals("register")) {
                if (users.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s",users.get(name)).println();
                } else {
                    users.put(name,number);
                    System.out.printf("%s registered %s successfully",name,number).println();
                }

            } else if (command.equals("unregister")) {
                if (!users.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found",name).println();
                } else {
                    users.remove(name);
                    System.out.printf("%s unregistered successfully",name).println();
                }
            }
        }
        users
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(String.format("%s => %s",e.getKey(),e.getValue())));
    }
}
