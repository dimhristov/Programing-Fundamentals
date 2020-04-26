package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, ArrayList<Integer>> towns = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            //String cmd = tokens[0];
            String name = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);
            towns.putIfAbsent(name, new ArrayList<>(Arrays.asList(0,0)));
            int oldPopulation = towns.get(name).get(0);
            int oldGOld = towns.get(name).get(1);
            towns.get(name).set(0, population + oldPopulation);
            towns.get(name).set(1, gold + oldGOld);

            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("=>");
            String cmd = tokens[0];

            switch (cmd) {
                case "Plunder":
                    System.out.println(String.format("%s plundered! %s gold stolen, %s citizens killed.", tokens[1], tokens[2], tokens[3]));
                    String city = tokens[1];
                    int peopleKilled = Integer.parseInt(tokens[2]);
                    int goldTaken = Integer.parseInt(tokens[3]);
                    int oldPopulation = towns.get(city).get(0);
                    int oldGold = towns.get(city).get(1);

                    towns.get(city).set(0, oldPopulation - peopleKilled);
                    towns.get(city).set(1, oldGold - goldTaken);

                    if (towns.get(city).get(0) <= 0) {
                        System.out.println(String.format("%s has been wiped off the map!", city));
                        towns.remove(city);
                    } else if (towns.get(city).get(1) <= 0) {
                        System.out.println(String.format("%s has been wiped off the map!", city));
                        towns.remove(city);
                    }
                    break;
                case "Prosper":
                    String name = tokens[1];
                    int gold = Integer.parseInt(tokens[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        int oldGold2 = towns.get(name).get(1);
                        towns.get(name).set(1, oldGold2 + gold);
                    }

                    break;
            }


            input = scan.nextLine();
        }
        System.out.println(String.format("Ahoy, Captain! There are %d wealthy settlements to go to:", towns.size()));
        towns
                .entrySet()
                .stream()
                .sorted((a,b) -> b.getValue().get(1) - a.getValue().get(1))
                .forEach(e -> System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg",e.getKey(),e.getValue().get(0),e.getValue().get(1))));
    }
}
