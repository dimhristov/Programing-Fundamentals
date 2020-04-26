package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, ArrayList<Integer>> people = new TreeMap<>();

        while (!input.equals("Results")) {
            String[] tokens = input.split(":");
            String cmd = tokens[0];
            String name = tokens[1];

            switch (cmd) {
                case "Add":
                    int health = Integer.parseInt(tokens[2]);   //index 0
                    int energy = Integer.parseInt(tokens[3]);   //index 1

                    if (!people.containsKey(name)) {
                        people.put(name,new ArrayList<>());
                        people.get(name).add(0,health); // add health on index 0
                        people.get(name).add(1,energy); // add enertgy on index 1
                    } else {
                        int oldHealth = people.get(name).get(0);
                        people.get(name).set(0,oldHealth+health);
                    }
                    break;
                case "Attack":
                    String attackerName = name;
                    String defenderName = tokens[2];
                    int damage = Integer.parseInt(tokens[3]);

                    if (people.containsKey(attackerName) && people.containsKey(defenderName)) {
                        int newHealth = people.get(defenderName).get(0) - damage;
                        people.get(defenderName).set(0,newHealth);

                        int oldEnergy = people.get(attackerName).get(1);
                        people.get(attackerName).set(1, oldEnergy - 1);

                        if (people.get(attackerName).get(1) <= 0) {
                            people.remove(attackerName);
                            System.out.println(String.format("%s was disqualified!",attackerName));
                        }

                        if (people.get(defenderName).get(0) <= 0) {
                            people.remove(defenderName);
                            System.out.println(String.format("%s was disqualified!",defenderName));
                        }
                    }

                    break;
                case "Delete":
                    if (name.equals("All")) {
                        people.clear();
                    } else {
                        people.remove(name);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("People count: %d",people.size()));
        people
                .entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().get(0) - e1.getValue().get(0))
                .forEach(e1 -> System.out.println(String.format("%s - %d - %d",e1.getKey(),e1.getValue().get(0),e1.getValue().get(1))));


    }
}
