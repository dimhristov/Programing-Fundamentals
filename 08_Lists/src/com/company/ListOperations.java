package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputList = scan.nextLine();
        String input = scan.nextLine();
        List<String> items = new ArrayList<>();
        items = Arrays.stream(inputList.split("\\s+")).collect(Collectors.toList());

        while (!"End".equals(input)) {


            String[] separateInput = input.split("\\s+");

            if ("Add".equals(separateInput[0])) {
                items.add(separateInput[1]);

            } else if ("Remove".equals(separateInput[0])) {
                int index = Integer.parseInt(separateInput[1]);
                if (index >= 0 && index < items.size()) {
                    items.remove(items.get(index));
                } else {
                    System.out.println("Invalid index");
                }


            } else if ("left".equals(separateInput[1])) {
                int moveCount = Integer.parseInt(separateInput[2]);

                //ZAVURTANE NA LISTOVE-------------------------------------------------------------

                for (int i = 0; i < moveCount; i++) {
                    String temp = items.get(0);
                    for (int j = 0; j < items.size() - 1; j++) {
                        String nextElement = items.get(j + 1);
                        items.set(j, nextElement);
                    }
                    items.set(items.size() - 1, temp);
                }


            } else if ("right".equals(separateInput[1])) {
                String temp = items.get(items.size() - 1);

                for (int i = items.size() - 1; i > 0; i--) {
                    items.set(i, items.get(i - 1));
                }
                items.set(0, temp);


            } else if ("Insert".equals(separateInput[0])) {
                int index = Integer.parseInt(separateInput[2]);
                if (index >= 0 && index < items.size()) {
                    items.add(index, separateInput[1]);
                } else {
                    System.out.println("Invalid index");
                }

            }

            input = scan.nextLine();
        }
        System.out.println(String.join(" ", items));

    }
}
