package ExamsPractice5;

import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int price = 0;
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            if (command.equals("hoodie")) {
                price = 30;
               totalSum+=price;
            } else if (command.equals("keychain")) {
                price = 4;
                totalSum+=price;
            } else if (command.equals("T-shirt")) {
                price = 20;
                totalSum+=price;
            } else if (command.equals("flag")) {
                price = 15;
                totalSum+=price;
            } else if (command.equals("sticker")) {
                price = 1;
                totalSum+=price;
            }


        }
        double moneyLeft = budget - totalSum;
        double moneyNeeded = totalSum-budget;

        if (budget >= totalSum) {
            System.out.printf("You bought %d items and left with %.0f lv.", n,moneyLeft);
        }else {
            System.out.printf("Not enough money, you need %.0f more lv.",moneyNeeded);
        }

    }
}
