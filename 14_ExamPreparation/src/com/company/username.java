package com.company;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        String cmd = scan.nextLine();

        while (!cmd.equals("Sign up")) {
            String[] tokens = cmd.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Case":
                    if (tokens[1].equals("lower")) {
                        username = username.toLowerCase();
                        System.out.println(username);
                    } else if (tokens[1].equals("upper")) {
                        username = username.toUpperCase();
                        System.out.println(username);
                    }
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    System.out.println(reverseString(username,startIndex,endIndex));
                    break;
                case "Cut":
                    String substring = tokens[1];
                    if (username.contains(substring)) {
                       username= username.replace(substring,"");
                        System.out.println(username);
                    } else {
                        System.out.println(String.format("The word %s doesn't contain %s.",username,substring));
                    }
                    break;
                case "Replace":
                    String charToReplace = tokens[1];
                    username = username.replaceAll(charToReplace, "*");
                    System.out.println(username);
                    break;
                case "Check":
                    String symbolToCheck = tokens[1];
                    if (username.contains(symbolToCheck)) {
                        System.out.println("Valid");
                    } else {
                        System.out.println(String.format("Your username must contain %s.",symbolToCheck));
                    }
                    break;
            }
            cmd = scan.nextLine();
        }


    }

    private static String reverseString(String username, int startIndex, int endIndex) {
        String reversed = "";
        StringBuilder reversedSubstring = new StringBuilder();
        if (startIndex >= 0 && endIndex < username.length()) {
            reversed = username.substring(startIndex, endIndex + 1);
            for (int i = reversed.length()-1; i >= 0; i--) {
                reversedSubstring.append(reversed.charAt(i));
            }
        }

        return reversedSubstring.toString();
    }

}



