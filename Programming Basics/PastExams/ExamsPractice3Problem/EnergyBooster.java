package ExamsPractice3;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int numOrders = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (fruit.equals("Watermelon")) {
            if (set.equals("small")) {
                price = 2 * 56;

            } else if (set.equals("big")) {
                price = 5 * 28.70;
            }
        } else if (fruit.equals("Mango")) {
            if (set.equals("small")) {
                price = 2 * 36.66;
            } else if (set.equals("big")) {
                price = 5 * 19.60;
            }
        } else if (fruit.equals("Pineapple")) {
            if (set.equals("small")) {
                price = 2 * 42.10;
            } else if (set.equals("big")) {
                price = 5 * 24.80;
            }
        } else if (fruit.equals("Raspberry")) {
            if (set.equals("small")) {
                price = 2 * 20;
            } else if (set.equals("big")) {
                price = 5 * 15.20;
            }
        }

        double totalPrice = price * numOrders;

        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice > 1000) {
            totalPrice = totalPrice * 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);


    }
}
