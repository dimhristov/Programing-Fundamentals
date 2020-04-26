package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while (!"end".equals(line)){
            String reversed = "";
            for (int i = line.length()-1; i >=0 ; i--) {
                reversed += line.charAt(i);
            }


            System.out.print(String.format("%s = %s%n", line, reversed));
            line = scan.nextLine();
        }
    }
}
