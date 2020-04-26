package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// READING ARRAYLIST
        ArrayList<Integer> playerOne = readIntegerList(scan);
        ArrayList<Integer> playerTwo = readIntegerList(scan);

//LOGIC
        while (playerOne.size() != 0 && playerTwo.size() != 0) {
            if (playerOne.get(0).equals(playerTwo.get(0))) {
                playerOne.remove(0);
                playerTwo.remove(0);
                continue;
            } else if (playerOne.get(0) > playerTwo.get(0)) {
                int tempWeakCard = playerTwo.get(0);
                playerTwo.remove(0);
                int tempFirstCard = playerOne.get(0);
                playerOne.remove(0);
                playerOne.add(tempFirstCard);
                playerOne.add(tempWeakCard);
                continue;
            } else if (playerOne.get(0) < playerTwo.get(0)) {
                int tempWeakCard = playerOne.get(0);
                int tempFirstCard = playerTwo.get(0);
                playerOne.remove(0);
                playerTwo.remove(0);
                playerTwo.add(tempFirstCard);
                playerTwo.add(tempWeakCard);
                continue;
            }
        }
        int sum = 0;
        if (playerOne.size() == 0) {

            for (Integer integer : playerTwo) {
                sum +=integer;
            }

            System.out.print(String.format("Second player wins! Sum: %d",sum));
        } else if (playerTwo.size() == 0) {
            for (Integer integer : playerOne) {
                sum +=integer;
            }
            System.out.print(String.format("First player wins! Sum: %d",sum));
        }


    }

    public static ArrayList<Integer> readIntegerList(Scanner scanner) {
        ArrayList<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            output.add(number);
        }
        return output;
    }
}

