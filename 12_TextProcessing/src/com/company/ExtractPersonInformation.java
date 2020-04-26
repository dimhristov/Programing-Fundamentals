package com.company;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            int firstIndex = input.indexOf('@');
            int secondIndex = input.indexOf('|');
            String name = input.substring(firstIndex+1,secondIndex);
            int ageIndex = input.indexOf('#');
            int ageIndex2 = input.indexOf('*');
            String age = input.substring(ageIndex+1,ageIndex2);
            System.out.println(String.format("%s is %s years old.",name,age));
        }
    }
}
