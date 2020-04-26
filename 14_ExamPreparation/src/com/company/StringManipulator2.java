package com.company;

import java.util.Scanner;

public class StringManipulator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String commands = scan.nextLine();

        while (!commands.equals("End")) {
            String[] tokens = commands.split("\\s+");
            String cmd = tokens[0];

            switch (cmd) {

                case "Translate":
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
                case "Start":
                    int startIndex = 0;
                    int endIndex = tokens[1].length() - 1;
                    String toCompare = input.substring(startIndex, endIndex + 1);
                    if (tokens[1].equals(toCompare)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    int lastIndex = input.lastIndexOf(tokens[1]);
                    System.out.println(lastIndex);
                    break;
                case "Remove":
                    String stringToRemove = input.substring(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[1]+ Integer.parseInt(tokens[2])));
                    input = input.replace(stringToRemove,"");
                    System.out.println(input);
            }


            commands = scan.nextLine();
        }
    }
}
