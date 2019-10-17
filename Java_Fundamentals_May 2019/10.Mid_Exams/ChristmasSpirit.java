package MIDEXAMS.MidExam18Dec2018;

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int ornament = 2;
        int treeSkirt = 5;
        int treeGarland = 3;
        int treeLights = 15;

        int spirit = 0;
        int budget = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 2 == 0) {
                budget += ornament * quantity;
                spirit += 5;

            }
            if (i % 3 == 0) {
                budget += treeSkirt * quantity;
                budget += treeGarland * quantity;
                spirit += 13;
            }
            if (i % 5 == 0) {
                budget += treeLights * quantity;
                spirit += 17;
                if (i % 3 == 0) {
                    spirit += 30;
                }

            }
            if (i % 10 == 0) {
                spirit -= 20;
                budget += (treeSkirt + treeGarland + treeLights);

            }
            if (i % 11 == 0 && i > 10) {
                quantity = quantity * 2;

            }
            if (i++ == 10 && i == days) {
                spirit -= 30;
            }

        }
        System.out.printf("Total cost: %d%n", budget);
        System.out.printf("Total spirit: %d", spirit);
    }
}
