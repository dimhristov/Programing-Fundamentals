package com.company;

//NamingConvention

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class telerikExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (isUpperCase(input)) {
            System.out.println("constant");

        }else if (isLowerCase(input)) {
            System.out.println("field");

        }else if (isPascal(input)) {
            System.out.println("pascal");

        }else if (isElephant(input)) {
            System.out.println("elephant");
        } else {
            System.out.println("mismatch");
        }
    }

    private static boolean isElephant(String input) {
        String regex = "\\b[a-z]+[A-Z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        }
        return false;

    }

    private static boolean isPascal(String input) {
        String regex = "\\b[A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    private static boolean isLowerCase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {

            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isUpperCase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {

            } else {
                return false;
            }
        }
        return true;
    }

}
