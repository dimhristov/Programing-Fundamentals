package com.company;

import java.util.Scanner;

public class WariorsQuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String command = scan.nextLine();



        while (!command.equals("For Azeroth")) {
            String[] commands = command.split("\\s+");
            String cmd = commands[0];

            switch (cmd) {
                case "GladiatorStance":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "DefensiveStance":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;
                case "Dispel":
                    if (Integer.parseInt(commands[1]) >= input.length() || Integer.parseInt(commands[1]) < 0) {
                        System.out.println("Dispel too weak.");
                    } else {
                        StringBuilder sb =new StringBuilder(input);
                        sb.setCharAt(Integer.parseInt(commands[1]), commands[2].charAt(0));
                        input = sb.toString();
                        System.out.println("Success!");
                    }
                    break;
                case "Target":
                    switch (commands[1]) {
                        case "Change":
                            if (input.contains(commands[2])) {
                                input = input.replace(commands[2],commands[3]);
                                System.out.println(input);
                            } else {
                                System.out.println("Command doesn't exist!");
                            }
                            break;
                        case "Remove":
                            if (input.contains(commands[2])) {
                                input = input.replace(commands[2],"");
                                System.out.println(input);
                            }else {
                                System.out.println("Command doesn't exist!");
                                break;
                            }
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");

                    break;
            }

            command = scan.nextLine();
        }
    }
}
