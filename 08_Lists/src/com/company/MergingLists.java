package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MergingLists {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstInput = scan.nextLine().split("\\s+");
        String[] secondInput = scan.nextLine().split("\\s+");
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();

        ArrayList<String> result = new ArrayList<>();

        for (String element : firstInput) {
            firstList.add(element);
        }

        for (String element : secondInput) {
            secondList.add(element);
        }
        int index = 0;
        for (int i = 0; i < firstList.size() && i < secondList.size(); i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
            index++;
        }


        System.out.print(String.join(" ", result));
        System.out.print(" ");

        if (firstList.size() < secondList.size()) {
            for (int i = index; i < secondList.size(); i++) {
                System.out.print(secondList.get(i) + " ");

            }


        } else if (firstList.size() > secondList.size()) {
            for (int i = index; i < firstList.size(); i++) {
                System.out.print(firstList.get(i) + " ");

            }

        }
    }
}
