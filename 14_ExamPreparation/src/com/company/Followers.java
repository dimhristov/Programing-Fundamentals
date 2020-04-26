package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Followers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input =scan.nextLine();
        Map<String,Integer> followers = new TreeMap<>();

        while (!input.equals("Log out")) {

            String[] tokens = input.split(":\\s+");
            String cmd = tokens[0];
            String name = tokens[1];
            switch (cmd) {
                case "New follower":

                    followers.putIfAbsent(name,0);
                    break;
                case "Like":
                    if (!followers.containsKey(tokens[1])) {
                       followers.putIfAbsent(name,Integer.parseInt(tokens[2]));

                    } else {
                        followers.put(name,followers.get(name)+Integer.parseInt(tokens[2]));
                    }
                    break;
                case "Comment":
                    if (!followers.containsKey(tokens[1])) {
                        followers.putIfAbsent(name,1);
                    } else{
                        followers.put(name, followers.get(name) + 1);
                    }
                    break;
                case "Blocked":
                    if (!followers.containsKey(tokens[1])) {
                        System.out.printf("%s doesn't exist.",tokens[1]).println();
                    } else {
                        followers.remove(tokens[1]);
                    }
                    break;
            }


            input = scan.nextLine();
        }
        System.out.println(String.format("%d followers", followers.size()));
        followers
                .entrySet()
                .stream()
                .sorted((a1, a2) -> a2.getValue() - a1.getValue())
                .forEach(a -> System.out.println(String.format("%s: %d",a.getKey(),a.getValue())));
    }
}
