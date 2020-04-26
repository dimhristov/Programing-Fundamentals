package com.company;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String command = scan.nextLine();

        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
            String cmd = tokens[0];

            switch (cmd) {
                case "Change":
                    input = input.replaceAll(tokens[1], tokens[2]);
                    System.out.println(input);
                    break;
                case "Includes":
                    if (input.contains(tokens[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    int index = input.indexOf(tokens[1]);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = startIndex  + Integer.parseInt(tokens[2]);
                    String substring = input.substring(startIndex, endIndex);
                    System.out.println(substring);
                    break;
                case "End":
                    int indexLast = input.lastIndexOf(tokens[1]);
                    if (input.length() - indexLast == tokens[1].length()) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
            }


            command = scan.nextLine();
        }
    }
}
