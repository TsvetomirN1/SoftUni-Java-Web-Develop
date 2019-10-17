package MIDEXAMS.Mid_Exam10March.Mid_Exam10March;

import java.util.Scanner;

public class Hunting_Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double totalWater = days * players * water;
        double totalFood = days * players * food;

        for (int i = 1; i <= days; i++) {

            String energyLoss = (scanner.nextLine());
            double energyLost = Double.parseDouble(energyLoss);

            energy -= energyLost;

            if (energy <= 0) {
                break;
            }
            if (i % 2 == 0) {
                energy = energy * 1.05;
                totalWater = totalWater * 0.7;
            }
            if (i % 3 == 0) {
                totalFood = totalFood - totalFood / players;
                energy = energy * 1.10;
            }

        }
        if (energy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }

    }
}
