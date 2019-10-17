package RetakeMidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Loot":

                    for (int i = 0; i < tokens.length; i++) {
                        String lootToAdd = tokens[i];
                        if (!chest.contains(lootToAdd)) {
                            chest.add(0, lootToAdd);
                        }
                    }
                    break;
                case "Drop":
                    int indexToDrop = Integer.parseInt(tokens[1]);

                    if (indexToDrop >= 0 && indexToDrop <= chest.size()) {

                        String element = chest.get(indexToDrop);
                        chest.add(element);
                        chest.remove(indexToDrop);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    if (count > chest.size()) {

                        for (int i = chest.size() - 1; i > count; i--) {
                            chest.remove(i);
                        }

                        for (String s : chest) {
                            if (chest.indexOf(s) == chest.size() - 1) {
                                System.out.print(s);
                            } else {
                                System.out.print(s + ", ");
                            }
                        }

                    }

                    System.out.println();
                    break;

            }
            command = scanner.nextLine();
        }


        int sum = 0;
        int count = chest.size();
        int[] numbers = new int[chest.size()];
        for (int i = 0; i < chest.size(); i++) {
            sum += numbers[i];

        }
        double average = sum * 1.00 / count * 1.00;
        if (average > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}



