package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> number = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!"end".equals(command)) {
            String[] input = command.split(" ");

            switch (input[0]) {
                case "Add":
                    number.add(input[1]);
                    break;
                case "Remove":
                    number.remove(input[1]);
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(input[1]);
                    number.remove(indexRemove);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[2]);
                    number.add(index, input[1]);
                    break;
                default:
                    break;
            }
            command = scan.nextLine();
        }

        System.out.println(String.join(" ", number));

    }
}

