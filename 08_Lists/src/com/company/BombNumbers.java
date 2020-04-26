package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> numbers = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

        String bombAndPower = scan.nextLine();
        String[] bombAndPowerArray = bombAndPower.split("\\s+");

        String bomb = bombAndPowerArray[0];
        int power = Integer.parseInt(bombAndPowerArray[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (bomb.equals(numbers.get(i))) {
                int bombIndex =i;

                int leftBound = Math.max(bombIndex- power,0 );
                int rightBound = Math.min(bombIndex + power, numbers.size() - 1);

                for (int j = rightBound; j >=leftBound ; j--) {
                    numbers.remove(j);

                }


//                for (int j = 0; j <power ; j++) {
//                    numbers.remove(i-1);
//                    numbers.remove(i+1);
//                }

            }

        }
        int sum = 0;
        for (String number : numbers) {
            int ostatuk = Integer.parseInt(number);
            sum +=ostatuk;


        }
        System.out.println(sum);
    }
}
