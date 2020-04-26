package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PractiseSessions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, ArrayList<String>> racers = new TreeMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split("->");
            String cmd = tokens[0];
            String road = tokens[1];

            switch (cmd) {
                case "Add":
                    String racer = tokens[2];
                    if (!racers.containsKey(road)) {
                        racers.put(road,new ArrayList<>());
                        racers.get(road).add(racer);
                    } else {
                        racers.get(road).add(racer);
                    }
                    break;
                case "Move":
                    String nextRoad =tokens[3];
                    String racer2 = tokens[2];
                    if (racers.containsKey(road)) {
                        if (racers.get(road).contains(racer2)) {
                            racers.get(nextRoad).add(racer2);
                            racers.get(road).remove(racer2);
                        }
                    }
                    break;
                case "Close":
                    if (racers.containsKey(road)) {
                        racers.remove(road);
                    }
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println("Practice sessions:");


        racers
                .entrySet()
                .stream()
                .sorted((e1,e2)->e2.getValue().size() - e1.getValue().size())
                .forEach(e->{
                    System.out.println(String.format("%s", e.getKey()));
                    for (String racer : e.getValue()) {
                        System.out.println(String.format("++%s",racer));
                    }
                });
    }
}
