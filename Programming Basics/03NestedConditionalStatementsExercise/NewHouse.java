package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowerNum = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double price = 0;


        switch (flower) {
            case "Roses":
                price = 5 * flowerNum;
                break;
            case "Dahlias":
                price = 3.80 * flowerNum;
                break;
            case "Tulips":
                price = 2.80 * flowerNum;
                break;
            case "Narcissus":
                price = 3 * flowerNum;
                break;
            case "Gladiolus":
                price = 2.5 * flowerNum;
                break;

        }

        if (flowerNum > 80 && flower.equals("Roses")) {
            price = price * 0.9;

        } else if (flowerNum > 90 && flower.equals("Dahlias")) {
            price = price * 0.85;

        } else if (flowerNum > 80 && flower.equals("Tulips")) {
            price = price * 0.85;

        } else if (flowerNum < 120 && flower.equals("Narcissus")) {
            price = price * 1.15;

        } else if (flowerNum < 80 && flower.equals("Gladiolus")) {
            price = price * 1.20;
        }


        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNum, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }


    }


}

