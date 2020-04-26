package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String content = scan.nextLine();
        String input = scan.nextLine();
        ArrayList<String> comments = new ArrayList<>();

        System.out.println(String.format("<h1>%n%s%n</h1>%n<article>%n%s%n</article>",title,content));

        while (!input.equals("end of comments")) {
            comments.add(input);
            input = scan.nextLine();

        }
        for (String comment : comments) {
            System.out.println(String.format("<div>%n%s%n</div>",comment));

        }


    }


}
