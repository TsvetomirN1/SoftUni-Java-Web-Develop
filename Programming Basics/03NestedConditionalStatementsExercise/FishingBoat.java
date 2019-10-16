package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());
        int rent = 0;
        double discount = 1;
        double seasonalDiscount = 1;

        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishermans % 2 == 0) seasonalDiscount = 0.95;
                break;
            case "Summer":
                rent = 4200;
                if (fishermans % 2 == 0) seasonalDiscount = 0.95;
                break;
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                if (fishermans % 2 == 0) seasonalDiscount = 0.95;
                rent = 2600;
        }

        if (fishermans <= 6) discount = 0.9;
        else if (fishermans >= 7 && fishermans <= 11) discount = 0.85;
        else if (fishermans >= 12) discount = 0.75;
        double totalCost = rent * discount * seasonalDiscount;
        double difference = Math.abs(budget - totalCost);
        if (budget >= totalCost) System.out.printf(
                "Yes! You have %.2f leva left.", difference);
        else System.out.printf(
                "Not enough money! You need %.2f leva.", difference);
    }
}


