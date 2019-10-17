package BasicsSyntax;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double coinSum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (!(coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2)) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                coinSum += coins;
            }

            input = scanner.nextLine();
        }
        double price = 0;
        String product = scanner.nextLine();
        boolean isValid = false;
        while (!product.equals("End")) {
            input = product;
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    isValid = true;
                    break;
                case "Water":
                    price = 0.7;
                    isValid = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isValid = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isValid = true;
                    break;
                case "Coke":
                    price = 1.0;
                    isValid = true;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValid = false;
                    break;
            }

            if (coinSum - price >= 0 && isValid) {
                coinSum -= price;
                System.out.printf("Purchased %s%n", product);

            } else {
                if (isValid)
                    System.out.println("Sorry, not enough money");
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinSum);
    }
}

