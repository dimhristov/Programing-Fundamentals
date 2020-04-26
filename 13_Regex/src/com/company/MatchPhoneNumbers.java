package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> matchedPhones = new ArrayList<>();

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ",matchedPhones));
    }
}
