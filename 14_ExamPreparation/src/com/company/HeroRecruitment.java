package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, ArrayList<String>> heroes = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String cmd = tokens[0];
            String heroName = tokens[1];

            switch (cmd) {
                case "Enroll":
                    if (!heroes.containsKey(heroName)) {
                        heroes.put(heroName, new ArrayList<String>());
                    } else {
                        System.out.println(String.format("%s is already enrolled.", heroName));
                    }
                    break;
                case "Learn":
                    if (!heroes.containsKey(heroName)) {
                        System.out.println(String.format("%s doesn't exist.", heroName));
                        break;
                    } else {
                        String spell = tokens[2];
                        if (heroes.get(heroName).contains(spell)) {
                            System.out.println(String.format("%s has already learnt %s.", heroName, spell));
                        } else {
                            heroes.get(heroName).add(spell);
                        }
                    }
                    break;
                case "Unlearn":
                    String spell = tokens[2];
                    if (!heroes.containsKey(heroName)) {
                        System.out.println(String.format("%s doesn't exist.", heroName));
                        break;
                    } else {
                        if (heroes.get(heroName).contains(spell)) {
                            heroes.get(heroName).remove(spell);
                        } else {
                            System.out.println(String.format("%s doesn't know %s.", heroName, spell));
                        }
                    }
                    break;

            }

            input = scan.nextLine();
        }
        System.out.println("Heroes:");
        heroes
                .entrySet()
                .stream()
                .sorted((a1,a2) -> a2.getValue().size() - a1.getValue().size())
                .forEach(e ->{
//                   String arrayList = String.join(",",e.getValue());
                    System.out.println("== " + e.getKey() + ": " + String.join(", ",e.getValue()));
                });
    }
}
