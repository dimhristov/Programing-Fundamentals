package com.company;

import java.util.Scanner;

public class AlienTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String english = scan.nextLine();
        String spanish =scan.nextLine();

        StringBuilder alienski = new StringBuilder();

        String bigger = biggerText(english,spanish);
        String smaller = smallerText(english,spanish);

        for (int i = 0; i < smaller.length(); i++) {
            if (smaller.charAt(i) == '-' || bigger.charAt(i) == '-') {
                alienski.append('-');
            } else if (smaller.charAt(i) == ' ' || bigger.charAt(i) == ' ') {
                alienski.append(' ');
            }else {
                int currentChar = Math.abs(smaller.charAt(i) - bigger.charAt(i));
                char symbol = (char) (currentChar + 97);
                alienski.append((symbol));
            }
        }

        for (int i = smaller.length(); i <bigger.length() ; i++) {
            if (bigger.charAt(i) == '-') {
                alienski.append('-');
            } else if (bigger.charAt(i) == ' ') {
                alienski.append(' ');
            } else {
                alienski.append(bigger.charAt(i));
            }
        }
        System.out.println(alienski.toString());

    }

    private static String smallerText(String english, String spanish) {
        if (english.length() < spanish.length()) {
            return english;
        } else {
            return spanish;
        }
    }

    private static String biggerText(String english, String spanish) {
        if (english.length() > spanish.length()) {
            return english;
        } else {
            return spanish;
        }
    }
}
