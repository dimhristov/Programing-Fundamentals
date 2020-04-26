package com.company;

import java.util.Scanner;

public class WariorsQuest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String commands = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
        }


        while (!commands.equals("For Azeroth")) {
            String[] tokens = commands.split("\\s+");
            String cmd = tokens[0];

            switch (cmd) {
                case "GladiatorStance":
                    input = input.toUpperCase();
                    sb = new StringBuilder(input);
                    System.out.println(input);
                    break;
                case "DefensiveStance":
                    input = input.toLowerCase();
                    sb = new StringBuilder(input);
                    System.out.println(input);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(tokens[1]);
                    String letter = tokens[2];
                    if (index >= 0 && index < input.length()) {
                        sb.setCharAt(index, letter.charAt(0));
                        input = sb.toString();
                        System.out.println("Success!");
                    } else {
                        System.out.println("Dispel too weak.");
                    }
                    break;
                case "Target":

                    String firstSubstring = tokens[2];


                    if (tokens[1].equals("Change")) {
                        String secondSub = tokens[3];
                        input = input.replaceFirst(firstSubstring,secondSub);
                        sb = new StringBuilder(input);

                            System.out.println(input);

                    } else if (tokens[1].equals("Remove")) {
                        input = input.replace(tokens[2],"");
                        sb = new StringBuilder(input);
                        System.out.println(input);
                    } else {
                        System.out.println("Command doesn't exist!");
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");

            }
            commands = scan.nextLine();
        }
    }
}
