package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class TelerikMockExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        double rem = 0.0;
        double sum = 0.0;


        StringBuilder converse = new StringBuilder();
        converse.append(Double.toString(num));
        String test = converse.toString();
        int index = converse.indexOf(".");
        String newConverse = test.replace(".","");
        num = Integer.parseInt(newConverse);

        if (num < 0) {
            num = Math.abs(num);
        }

        while (num >= 9) {
            while (num > 0 ) {
                rem = num % 10;
                sum += rem;
                num = (int)(num/10) ;
            }
            num = sum;
            sum = 0;
        }
        System.out.println(String.format("%.0f",num));
    }
}
