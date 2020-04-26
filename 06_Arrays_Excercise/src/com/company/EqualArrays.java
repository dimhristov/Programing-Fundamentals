package com.company;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] firstArr = new int[input.length];

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = Integer.parseInt(input[i]);
        }
        String[] inputSecond = scan.nextLine().split(" ");
        int[] secondArr = new int[inputSecond.length];

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = Integer.parseInt(inputSecond[i]);
        }
        int counter = 0;
        int sum = 0;
        boolean isIdentical = false;
        for (int i = 0; i < firstArr.length; i++) {

            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
                counter++;
                isIdentical = true;
            } else if (firstArr[i] != secondArr[i]) {

                isIdentical = false;
                break;
            }



        }


        if (isIdentical) {
            System.out.println(String.format("Arrays are identical. Sum: %d", sum));
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", counter);
        }

    }
}




