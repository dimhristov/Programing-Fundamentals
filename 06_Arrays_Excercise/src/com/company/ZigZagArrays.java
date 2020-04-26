package com.company;

import java.util.Scanner;

public class ZigZagArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentLine = scan.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = currentLine[0];
                secondArr[i] = currentLine[1];
            } else {
                secondArr[i] = currentLine[0];
                firstArr[i] = currentLine[1];
            }

        }
        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));
    }
}
