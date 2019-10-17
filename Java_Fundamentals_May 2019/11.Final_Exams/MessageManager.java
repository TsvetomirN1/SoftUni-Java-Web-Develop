package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessageManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messagesCapacity = Integer.parseInt(scanner.nextLine());


        Map<String, Integer> userSend = new LinkedHashMap<>();
        Map<String, Integer> userReceive = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Statistics")) {
            String[] tokens = line.split("=");

            switch (tokens[0]) {
                case "Add":
                    String userName = tokens[1];
                    int send = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);

                    if (!userSend.containsKey(userName)) {
                        userSend.put(userName, send);
                    }
                    if (!userReceive.containsKey(userName)) {
                        userReceive.put(userName, received);
                    }
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];
                    if (userSend.containsKey(sender)) {
                        userSend.put(sender, userSend.get(sender) + 1);
                        if (userSend.get(sender) + userReceive.get(sender) == messagesCapacity) {
                            userSend.remove(sender);
                            System.out.printf("%s reached the capacity!%n", sender);
                        }
                    }

                    if (userReceive.containsKey(receiver)) {
                        userReceive.put(receiver, userReceive.get(receiver) + 1);
                        if (userSend.get(receiver) + userReceive.get(receiver) == messagesCapacity) {
                            userReceive.remove(receiver);
                            System.out.printf("%s reached the capacity!%n", receiver);
                        }
                    }

                    break;
                case "Empty":
                    String userName1 = tokens[1];
                    if (userName1.equals("All")) {
                        userSend.clear();
                        userReceive.clear();
                    }


                    if (userSend.containsKey(userName1)) {
                        userSend.remove(userName1);
                    }
                    if (userReceive.containsKey(userName1)) {
                        userSend.remove(userName1);
                    }

                    break;
            }


            line = scanner.nextLine();
        }
        System.out.println("Users count: " + userSend.size());


        userReceive.entrySet().
                stream().
                sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());

                    }
                    return result;
                }).forEach(entry -> {
            System.out.printf("%s - %d%n",
                    entry.getKey(), entry.getValue() + userSend.get(entry.getKey()));

        });
    }

}