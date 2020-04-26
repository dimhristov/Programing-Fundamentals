package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "U\\$(?<name>[A-Z][a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}[0-9]+)P@\\$";
        Pattern pattern = Pattern.compile(regex);
        int countRegistrations = 0;


        for (int i = 0; i < n; i++) {
            String registration = scan.nextLine();
            Matcher matcher = pattern.matcher(registration);
            if (matcher.find()) {
                String name = matcher.group("name");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s",name,password));
                countRegistrations++;
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println(String.format("Successful registrations: %d",countRegistrations));
    }
}
