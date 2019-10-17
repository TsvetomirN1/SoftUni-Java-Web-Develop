package MIDEXAMS.MidExam2March;

import java.util.Scanner;

public class CookingMasterClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double freeFlour = students / 5 * flourPrice;


        double itemsPrice = apronPrice * Math.ceil(students * 1.2) + eggPrice * 10 * (students)
                + flourPrice * students;


        double total = itemsPrice - freeFlour;
        if (total <= budget) {
            System.out.printf("Items purchased for %.2f$.", total);
        } else {
            System.out.printf("%.2f$ more needed.", total - budget);
        }
    }
}

