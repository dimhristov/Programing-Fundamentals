package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;

        ArrayList<String> attacked = new ArrayList<>();
        ArrayList<String> destroyed = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            StringBuilder message = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (input.charAt(j) == 's' || input.charAt(j) == 'S' || input.charAt(j) == 't' || input.charAt(j) == 'T' || input.charAt(j) == 'a' || input.charAt(j) == 'A' || input.charAt(j) == 'r' || input.charAt(j) == 'R' ) {
                    count++;
                }
            }
            for (int j = 0; j < input.length(); j++) {
                char letter = (char)(input.charAt(j) - count);
                message.append(letter);
            }
            String regex = "@(?<planetName>[A-Z][a-z]+)(?:[^@:!>\\-]*):(?<population>[0-9]+)(?:[^@:!>\\-]*)!(?<type>[AD])!(?:[^@:!>\\-]*)->(?<count>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String population = matcher.group("population");
                String type = matcher.group("type");
                int soldierCount = Integer.parseInt(matcher.group("count"));
                if (type.equals("A")) {
                    attacked.add(planetName);
                } else if (type.equals("D")) {
                    destroyed.add(planetName);
                }
            }
            count = 0;
        }

        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked
                .stream()
                .sorted()
                .forEach(e ->{
                    System.out.println(String.format("-> %s",e));
                });
        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed
                .stream()
                .sorted()
                .forEach(e -> {
                    System.out.println(String.format("-> %s",e));
                });
    }
}
