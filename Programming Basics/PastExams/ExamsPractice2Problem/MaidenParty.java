package ExamsPractice2;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfMaiden = Double.parseDouble(scanner.nextLine());
        int loveStories = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyRings = Integer.parseInt(scanner.nextLine());
        int caricaturas = Integer.parseInt(scanner.nextLine());
        int luckyNum = Integer.parseInt(scanner.nextLine());

        double totalSum = (loveStories * 0.60) + (roses * 7.20) +
                (keyRings * 3.60) + (caricaturas * 18.20) + (luckyNum * 22);
        int artikuls = loveStories + roses + keyRings + caricaturas + luckyNum;

        if (artikuls > 25) {
            double discount = (totalSum * 35) / 100;
            totalSum = totalSum - discount;
        }
        double hosting = totalSum * 0.1;
        double finalProfit = totalSum - hosting;

        if (finalProfit > priceOfMaiden) {
            System.out.printf("Yes! %.02f lv left.", finalProfit - priceOfMaiden);
        } else {
            System.out.printf("Not enough money! %.02f lv needed.", priceOfMaiden - finalProfit);
        }

    }
}
