package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MessagesManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<Integer>> users = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Statistics")) {
            String[] tokens = input.split("=");
            String cmd = tokens[0];

            switch (cmd) {
                case "Add":
                    String username = tokens[1];
                    int sendMessages = Integer.parseInt(tokens[2]);
                    int receivedMessages = Integer.parseInt(tokens[3]);
                    users.putIfAbsent(username, new ArrayList<>());
                    users.get(username).add(0, sendMessages); // index 0 - sendMessages
                    users.get(username).add(1, receivedMessages); // index 1 - receivedMessages
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];
                    if (users.containsKey(sender) && users.containsKey(receiver)) {
                        int oldSendMessages = users.get(sender).get(0);
                        users.get(sender).set(0, oldSendMessages + 1);
                        int oldReceivedMessages = users.get(receiver).get(1);
                        users.get(receiver).set(1, oldReceivedMessages + 1);

                        if (users.get(sender).get(0) + users.get(sender).get(1) >= capacity) {
                            users.remove(sender);
                            System.out.println(String.format("%s reached the capacity!", sender));
                        }

                        if (users.get(receiver).get(1) + users.get(receiver).get(0) >= capacity) {
                            users.remove(receiver);
                            System.out.println(String.format("%s reached the capacity!", receiver));
                        }

                    }
                    break;
                case "Empty":
                    if (users.containsKey(tokens[1])) {
                        users.remove(tokens[1]);
                    }
                    if (tokens[1].equals("All")) {
                        users.clear();
                    }
                    break;
            }


            input = scan.nextLine();
        }
        System.out.println(String.format("Users count: %d", users.size()));
        users
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().get(1) - e1.getValue().get(1))
                .forEach(e -> System.out.println(String.format("%s - %d", e.getKey(), e.getValue().get(0) + e.getValue().get(1))));
    }
}
