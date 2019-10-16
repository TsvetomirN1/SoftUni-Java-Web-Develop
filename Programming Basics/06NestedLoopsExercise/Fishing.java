package NestedLoopsExercise;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dailyQuota = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int fishCaught = 0;
        double profit = 0.0;
        double expense = 0.0;


        while (!command.equals("Stop")) {
            String fishName = command;
            double weight = Double.parseDouble(scanner.nextLine());
            int sum = 0;
            for (int i = 0; i < fishName.length(); i++) {
                sum += fishName.charAt(i);
            }
            double priceOfFish = sum / weight;
            if (++fishCaught % 3 == 0) {
                profit += priceOfFish;
            } else {
                expense += priceOfFish;
            }
            if (dailyQuota == fishCaught) {
                System.out.println("Lyubo fulfilled the quota!");
                break;
            }

            command = scanner.nextLine();
        }
        double profitLoss = Math.abs(profit - expense);
        if (profit < expense) {
            System.out.printf("Lyubo lost %.02f leva today.", profitLoss);
        } else {
            System.out.printf("Lyubo's profit from %s fishes is %.02f leva.", fishCaught, profitLoss);
        }

    }
}
