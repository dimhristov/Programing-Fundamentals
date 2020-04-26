package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NikuldensMeals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("-");

        Map<String, ArrayList<String>> listOfLikedMeals = new TreeMap<>();
        int mealDontLikeCount =0;

        while (!input[0].equals("Stop")) {
            String command = input[0];
            String guest = input[1];
            String meal = input[2];

            switch (command) {
                case "Like":
                    if (!listOfLikedMeals.containsKey(guest)) {
                        ArrayList<String> likedMeals = new ArrayList<>();
                        likedMeals.add(meal);
                        listOfLikedMeals.put(guest,likedMeals);
                    }else {
                        if (!listOfLikedMeals.get(guest).contains(meal)) {
                            listOfLikedMeals.get(guest).add(meal);
                        }
                    }
                    break;
                case "Unlike":
                    if (listOfLikedMeals.containsKey(guest)) {
                        if (listOfLikedMeals.get(guest).contains(meal)) {
                            listOfLikedMeals.get(guest).remove(meal);
                            System.out.println(String.format("%s doesn't like the %s.",guest,meal));
                            mealDontLikeCount++;
                        } else {
                            System.out.println(String.format("%s doesn't have the %s in his/her collection.",guest,meal));
                        }
                    } else {
                        System.out.println(String.format("%s is not at the party.", guest));
                    }
                    break;
            }


            input = scan.nextLine().split("-");
        }

        listOfLikedMeals
                .entrySet()
                .stream()
                .sorted((a1,a2) -> a2.getValue().size() - a1.getValue().size())
                .forEach(a -> {
                            String listAsString = String.join(", ",a.getValue());
                            System.out.println(a.getKey() + ": " + listAsString);
                });

        System.out.println(String.format("Unliked meals: %d",mealDontLikeCount));
    }
}
