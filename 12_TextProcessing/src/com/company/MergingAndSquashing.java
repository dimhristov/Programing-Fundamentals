package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MergingAndSquashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> concat = new ArrayList<>();
        ArrayList<Integer> squashed = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            int num0 = Integer.parseInt(scan.nextLine());

            for (int j = 0; j < n/2; j++) {
                int firstChar0 = num0 / 10;
                int secondChar0 = num0 % 10;

                int num1 = Integer.parseInt(scan.nextLine());

                int firstChar = num1 / 10;
                int secondChar = num1 % 10;
                concat.add(Integer.parseInt("" + secondChar0 + firstChar));
                num0 = num1;
            }

        }


//            firstChars.add(firstChar);
//            secondChars.add(secondChar);
    }
}
