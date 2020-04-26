package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsleOfManTTRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex="([#$%*&])([A-Za-z]+)(\\1)=([0-9]+)!!(.*)$";
        Pattern pattern = Pattern.compile(regex);

        boolean isTrue = false;

        while (!isTrue) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Nothing found!");
            } else {
                int geoHashSize = matcher.group(5).length();
                int size = Integer.parseInt(matcher.group(4));
                String newGeoHashCode = "";
                StringBuilder sb = new StringBuilder();
                if (size == geoHashSize) {
                    for (int i = 0; i < geoHashSize; i++) {
                        int toAppend = matcher.group(5).charAt(i) + size;
                        char toAppendChar = (char)toAppend;
                        sb.append(toAppendChar);

                    }

                    System.out.println(String.format("Coordinates found! %s -> %s",matcher.group(2),sb.toString()));
                    return;

                } else if (size != geoHashSize) {
                    System.out.println("Nothing found!");
                }
            }
        }
    }
}
