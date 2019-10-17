package ExamsPractice3;

import java.util.Scanner;

public class Honeymoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String city = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;

        if (city.equals("Cairo")) {
            price = nights * (250 * 2);
            totalPrice = 600 + price;
            if (nights >=1 && nights <= 4) {
                totalPrice = totalPrice * 0.97;
            } else if (nights >= 5 && nights <= 9) {
                totalPrice = totalPrice * 0.95;
            } else if (nights >= 10 && nights <= 24) {
                totalPrice = totalPrice * 0.90;
            } else if (nights >= 25 && nights <= 49) {
                totalPrice = totalPrice * 0.83;
            } else if (nights >= 50) {
                totalPrice = totalPrice * 0.70;
            }

        } else if (city.equals("Paris")) {
            price = nights * (150 * 2);
            totalPrice = 350 + price;
            if (nights >= 5 && nights <= 9) {
                totalPrice = totalPrice * 0.93;
            } else if (nights >= 10 && nights <= 24) {
                totalPrice = totalPrice * 0.88;
            } else if (nights >= 25 && nights <= 49) {
                totalPrice = totalPrice * 0.78;
            } else if (nights >= 50) {
                totalPrice = totalPrice * 0.70;
            }

        } else if (city.equals("Lima")) {
            price = nights * (400 * 2);
            totalPrice = price + 850;
            if (nights >= 25 && nights <= 49) {
                totalPrice = totalPrice * 0.81;
            } else if (nights >= 50) {
                totalPrice = totalPrice * 0.70;
            }

        } else if (city.equals("New York")) {
            price = nights * (300 * 2);
            totalPrice = price + 650;
            if (nights > 1 && nights <= 4) {
                totalPrice = totalPrice * 0.97;
            } else if (nights >= 5 && nights <= 9) {
                totalPrice = totalPrice * 0.95;
            } else if (nights >= 10 && nights <= 24) {
                totalPrice = totalPrice * 0.88;
            } else if (nights >= 25 && nights <= 49) {
                totalPrice = totalPrice * 0.81;
            } else if (nights >= 50) {
                totalPrice = totalPrice * 0.70;
            }

        } else if (city.equals("Tokyo")) {
            price = nights * (350 * 2);
            totalPrice = price + 700;
            if (nights >= 10 && nights <= 24) {
                totalPrice = totalPrice * 0.88;
            } else if (nights >= 25 && nights <= 49) {
                totalPrice = totalPrice * 0.83;
            } else if (nights >= 50) {
                totalPrice = totalPrice * 0.70;
            }
        }

        if (budget > totalPrice) {
            double leftMoney = budget - totalPrice;
            System.out.printf("Yes! You have %.02f leva left.", leftMoney);

        } else if (budget < totalPrice) {
            double notEnoughMoney = totalPrice- budget;
            System.out.printf("Not enough money! You need %.02f leva.", notEnoughMoney);
        }


    }
}
