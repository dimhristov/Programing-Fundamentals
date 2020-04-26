package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        //positive lookahead и negative lookahead  -info za parvata i posledna skoba
        String regex = "(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+)(@)([a-zA-Z]+([\\.\\-_][A-Za-z]+)+))(\\b|(?=\\s))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);

        }
    }
}
