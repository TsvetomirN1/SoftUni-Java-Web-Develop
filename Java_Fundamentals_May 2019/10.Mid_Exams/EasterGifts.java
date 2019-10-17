package MIDEXAMS.MidExam16April;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EasterGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<String> gifts = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            gifts.add(input[i]);
        }
        String[] command = scanner.nextLine().split("\\s+");
        while (!"No".equals(command[0])) {

            if ("OutOfStock".equals(command[0])) {
                // find the object in the list and remove it:
                String removed = (command[1]);
                for (int i = 0; i < gifts.size(); i++) {
                    while (gifts.get(i).equals(removed)) {
                        gifts.set(i, "None");
                    }
                }
            } else if ("Required".equals(command[0])) {

                String replaced = (command[1]);
                int index = Integer.parseInt(command[2]);

                if (index >= 0 && index < gifts.size()) {
                    gifts.set(index, replaced);
                }
            } else if ("JustInCase".equals(command[0])) {

                String replaced = (command[1]);
                int index = gifts.size() - 1;
                gifts.set(gifts.size() - 1, replaced);
            }


            command = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < gifts.size(); i++) {
            gifts.remove("None");
        }
        System.out.println(gifts.toString().replaceAll("[\\[\\],]", ""));
    }
}


