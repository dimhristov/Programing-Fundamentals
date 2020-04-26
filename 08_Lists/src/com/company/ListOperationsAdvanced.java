package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperationsAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String values = scan.nextLine();
        List<String> items = Arrays.stream(values.split("\\s+")).collect(Collectors.toList());
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i <items.size() ; i++) {
            number.add(Integer.parseInt(items.get(i)));
        }

       // List<Integer> number = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!"end".equals(command)) {
            String[] input = command.split("\\s+");

            switch (input[0]) {
                case "Contains":
                    if (number.contains(Integer.parseInt(input[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }

                    break;
                case "Print":
                    if (input[1].equals("even")) {
                        for (Integer num : number) {
                            if (num % 2 == 0){
                                System.out.print(num+ " ");
                            }
                        }
                        System.out.println();
                    } else if (input[1].equals("odd")) {
                        for (Integer num : number) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer num : number) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (input[1].equals(">")) {
                        for (Integer num : number) {
                            int sravnenie = Integer.parseInt(input[2]);
                            if (num > sravnenie) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    } else if (input[1].equals("<")) {
                        for (Integer num : number) {
                            int sravnenie = Integer.parseInt(input[2]);
                            if (num < sravnenie) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();

                    } else if (input[1].equals(">=")) {
                        for (Integer num : number) {
                            int sravnenie = Integer.parseInt(input[2]);
                            if (num >= sravnenie) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();

                    } else if (input[1].equals("<=")) {
                        for (Integer num : number) {
                            int sravnenie = Integer.parseInt(input[2]);
                            if (num <= sravnenie) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();

                    }
                        break;
                        default:
                            break;
                    }
            command = scan.nextLine();
        }


    }
}


