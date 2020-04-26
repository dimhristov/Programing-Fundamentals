package com.company;

import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        boolean isTrue = false;
        int balancedSum =0;
        while (!isTrue) {
            int digit3 = input % 10;
            input = input/10;
            int digit2 = input % 10;
            input = input/10;
            int digit1 = input;

            int sum = digit1 + digit3;
            if (sum == digit2){
                int balancedNum =Integer.parseInt(""+digit1 + digit2 +digit3);
                balancedSum +=balancedNum;

            } else {
                isTrue = true;
                break;
            }


            input = Integer.parseInt(scan.nextLine());
        }
        System.out.println(balancedSum);
    }
}
