package MIDEXAMS.Mid_Exam10March.Mid_Exam10March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelloFrance {
    private static double checkPriceReturnBudget(double priceBuy, double maxPrice, double budget, List<Double> prices) {
        if (priceBuy <= budget) {
            if (priceBuy <= maxPrice) {
                budget -= priceBuy;
                prices.add(priceBuy * 1.40);
                prices.add(priceBuy);
            }
        }
        return budget;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("[|\\->]"))
                .filter(e -> !e.equals("")).collect(Collectors.toList());

        double budget = Double.parseDouble(scanner.nextLine());

        double profit = 0;

        int one = 0;
        int two = 1;

        double clothesMax = 50;
        double shoesMax = 35.00;
        double accessoriesMax = 20.50;

        List<Double> prices = new ArrayList<>();

        while (two < items.size()) {
            String type = items.get(one);
            double price = Double.parseDouble(items.get(two));
            switch (type) {
                case "Clothes":
                    budget = checkPriceReturnBudget(price, clothesMax, budget, prices);
                    break;
                case "Shoes":
                    budget = checkPriceReturnBudget(price, shoesMax, budget, prices);
                    break;
                case "Accessories":
                    budget = checkPriceReturnBudget(price, accessoriesMax, budget, prices);
                    break;
            }
            if (budget < 0) {
                break;
            }
            one += 2;
            one += 2;

        }
        for (int i = 0; i < prices.size(); i++) {
            profit += prices.get(i) - prices.get(++i);

        }
        for (int i = 0; i < prices.size(); i += 2) {
            System.out.print(String.format("%.2f ", prices.get(i)));
        }
        double outMoney = 0;

        for (int i = 1; i <= prices.size() - 1; i += 2) {
            outMoney += prices.get(i);
        }

        System.out.println();
        System.out.println(String.format("Profit: %.2f", profit));
        double totalBudget = profit + budget + outMoney;
        if (totalBudget >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }
    }


}

