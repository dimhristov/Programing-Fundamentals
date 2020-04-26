package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroRecruitment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String commands = scan.nextLine();

        Map<String, ArrayList<String>> heroes = new TreeMap<>();

        while (!commands.equals("End")) {
            String[] tokens = commands.split("\\s+");
            String cmd = tokens[0];
            String name = tokens[1];

            switch (cmd) {
                case "Enroll":
                    if (!heroes.containsKey(name)) {
                        heroes.put(name,new ArrayList<String>());
                    } else {
                        System.out.printf("%s is already enrolled.",name).println();
                    }
                    break;
                case "Learn":


                    if (heroes.containsKey(name)) {
                        if (!heroes.get(name).contains(tokens[2])) {
                            heroes.get(name).add(tokens[2]);
                        } else {
                            System.out.printf("%s has already learnt %s.",name,tokens[2]).println();
                            break;
                        }
                    } else {
                        System.out.println(String.format("%s doesn't exist.",name));
                        break;
                    }
                    break;
                case "Unlearn":

                    if (heroes.containsKey(name)) {
                        if (heroes.get(name).contains(tokens[2])) {
                            heroes.get(name).remove(tokens[2]);
                        } else {
                            System.out.println(String.format("%s doesn't know %s.",name,tokens[2]));
                        }
                    } else {
                        System.out.println(String.format("%s doesn't exist.",name));
                    }
                    break;
            }
            commands = scan.nextLine();
        }
        System.out.println("Heroes:");
        heroes
                .entrySet()
                .stream()
                .sorted((a,b) -> b.getValue().size() - a.getValue().size())
                .forEach(a -> {
                    String arrayList = String.join(", ",a.getValue());
                    System.out.println(("== " + a.getKey() + ": " + arrayList));
                });
    }
}
