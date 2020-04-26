package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "([@*])([A-Z][a-z][a-z]+)(\\1): \\[([\\w])\\]\\|\\[([\\w])\\]\\|\\[([\\w])\\]\\|$";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < n; i++) {
            String input =scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Valid message not found!");

            } else {
                int a = matcher.group(4).charAt(0);
                int b = matcher.group(5).charAt(0);
                int c = matcher.group(6).charAt(0);


                System.out.println(String.format("%s: %d %d %d",matcher.group(2),a,b,c));
            }


        }
    }
}
