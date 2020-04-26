package com.company;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        String command = scan.nextLine();

        while (!command.equals("Complete")) {
            String[] tokens = command.split("\\s+");
            String cmd = tokens[0];

            switch (cmd) {
                case "Make":
                    String option = tokens[1];
                    if (option.equals("Upper")) {
                        email = email.toUpperCase();
                        System.out.println(email);
                    } else if (option.equals("Lower")) {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(tokens[1]);
                    int lenght = email.length();
                    String lastChars = email.substring(lenght - count, lenght);
                    System.out.println(lastChars);
                    break;
                case "Replace":
                    String charToReplace = tokens[1];
                    email = email.replaceAll(charToReplace, "-");
                    System.out.println(email);
                    break;
                case "GetUsername":
                    int indexOfAt = email.indexOf("@");
                    if (email.contains("@")) {
                        String nameOnly = email.substring(0, indexOfAt);
                        System.out.println(nameOnly);
                    } else {
                        System.out.println(String.format("The email %s doesn't contain the @ symbol.", email));
                    }

                    break;
                case "Encrypt":

                    for (int i = 0; i < email.length() -1; i++) {
                        System.out.print((int)email.charAt(i) + " ");
                    }
                    System.out.print((int)email.charAt(email.length()-1));
                    break;
            }


            command = scan.nextLine();
        }
    }
}
