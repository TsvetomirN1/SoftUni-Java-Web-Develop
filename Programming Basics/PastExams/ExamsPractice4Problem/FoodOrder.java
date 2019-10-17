package ExamsPractice4;

import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        int productNumbers = 0;
        double totalPrice = 2.50;

        String command = scanner.nextLine();

        while (!command.equals("Order")) {

            double currentPrice = Double.parseDouble(scanner.nextLine());

            totalPrice += currentPrice;
            productNumbers++;


            if (budget < totalPrice) {
                totalPrice -= currentPrice;
                productNumbers--;
                System.out.printf("You will exceed the budget if you order this!%n");


            }
            command = scanner.nextLine();
        }

        System.out.printf("You ordered %d items!%n", productNumbers);
        System.out.printf("Total: %.2f", totalPrice);

    }
}


