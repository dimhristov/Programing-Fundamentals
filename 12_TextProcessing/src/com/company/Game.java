package com.company;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int digit3 = n % 10;
        n = n/10;
        int digit2 = n % 10;
        n = n/10;
        int digit1 = n;
        int b = 0;
        int sum = 0;
        int biggestsum = 0;

        sum = digit1 + digit2 + digit3;
        if (sum > biggestsum) {
            biggestsum = sum;
        }
        sum = digit1 + digit2 * digit3;
        if (sum > biggestsum) {
            biggestsum = sum;
        }
        sum = digit1 * digit2 + digit3;
        if (sum > biggestsum) {
            biggestsum = sum;
        }
        sum = digit1 * digit2 * digit3;
        if (sum > biggestsum) {
            biggestsum = sum;
        }
        System.out.println(biggestsum);
    }
}
