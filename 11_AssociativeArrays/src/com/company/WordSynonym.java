package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonym {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, ArrayList<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!synonyms.containsKey(word)) {
                synonyms.put(word, new ArrayList<>());
            }
                synonyms.get(word).add(synonym);

        }
        for (Map.Entry<String, ArrayList<String>> entry : synonyms.entrySet()) {

        }

        for (Map.Entry<String, ArrayList<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s",entry.getKey(),String.join(", ",entry.getValue())).println();
        }
    }
}
