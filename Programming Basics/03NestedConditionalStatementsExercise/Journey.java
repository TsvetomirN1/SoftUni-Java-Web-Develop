package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String location = "";
        double spent = 0;

        if (budget <= 100) {
            location = "Bulgaria";

            if (season.equals("summer")) {
                place = "Camp";
                spent = budget *0.3;

            } else if (season.equals("winter")) {
                place = "Hotel";
                spent = budget *0.7;
            }

        } else if (budget > 100 && budget <= 1000) {
            location = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                spent = budget *0.4;

            } else if (season.equals("winter")) {
                place = "Hotel";
                spent = budget *0.8;

            }

        } else if (budget > 1000) {
            location = "Europe";
            place = "Hotel";
            spent = budget * 0.9;
        }
        System.out.printf("Somewhere in %s", location);
        System.out.println();
        System.out.printf("%s - %.2f", place, spent);
    }

}
