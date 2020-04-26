package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
               .map(Integer::parseInt)
               .sorted((n1,n2) -> n2.compareTo(n1))
               .limit(3)
               .collect(Collectors.toList());


        for (Integer number : numbers) {
            System.out.println(number + " ");
        }

        }

    }



