package MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String userName = input[1];


            if (command.equalsIgnoreCase("Register")) {
                String liscencePlate = input[2];
                if (!users.containsKey(userName)) {
                    users.put(userName, liscencePlate);
                    System.out.printf("%s registered %s successfully%n", userName, liscencePlate);
                } else if (users.get(userName).equals(liscencePlate)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", users.get(userName));
                }
            } else {
                if (!users.containsKey(userName)) {
                    System.out.printf("ERROR: user %s not found%n", userName);
                } else {
                    users.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                }


            }


        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }


    }
}
