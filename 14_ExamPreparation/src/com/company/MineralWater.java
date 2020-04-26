package com.company;

import java.util.Scanner;

public class MineralWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int smallBottles = Integer.parseInt(scan.nextLine());
        int bigBottles = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        if (capacity - bigBottles * 5 == 0) {
            System.out.println(0);
        } else if (capacity - bigBottles * 5 > 0) {
            int leftOver = capacity - bigBottles*5;
            if (smallBottles >= leftOver) {
                System.out.println(leftOver);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }
}
