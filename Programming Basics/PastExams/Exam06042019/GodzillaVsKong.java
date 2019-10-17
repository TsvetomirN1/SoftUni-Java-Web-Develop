package Exam06042019;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double peopleClothingForOne = Double.parseDouble(scanner.nextLine());

        double decorSum = budget * 0.1;
        double clothingSum = people * peopleClothingForOne;
        if (people > 150) {
            clothingSum = clothingSum * 0.9;
        }

        double totalPrice = decorSum + clothingSum;


        if (totalPrice > budget) {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.02f leva more.", totalPrice - budget);
        } else {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.02f leva left.", budget - totalPrice);
        }


    }
}
