package com.company;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int target = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <numbers.length - 1 ; i++) {
            int firstNumber = numbers[i];
            for (int j = i+1; j <numbers.length ; j++) {
                int secondNumber = numbers[j];
                if (firstNumber + numbers[j] == target) {
                    System.out.println(firstNumber + " " + secondNumber);
                }

            }

        }


        }
    }


    //int specialNumber = Integer.parseInt(scan.nextLine());
//
//        for (int i = 0; i <numbers.length ; i++) {
//            for (int j = i+1; j <numbers.length ; j++) {
//                if (numbers[i] + numbers[j] == specialNumber) {
//
//                }
//            }
//            System.out.println( numbers[i] );
