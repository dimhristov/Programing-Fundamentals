package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String anagram = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        char[] anagramArray = anagram.toCharArray();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            char[] words = word.toCharArray();
            if (words.length != anagramArray.length) {
                System.out.println("No");
            }

            //(int j= 0; j <words.length; j++) {
//                if (String.valueOf(words[j]).equals( String.valueOf(anagramArray[j]))) {
//                    count++;
//                }
        }
        if (count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        count = 0;
    }
}


