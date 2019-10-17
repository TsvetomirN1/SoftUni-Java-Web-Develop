package ExamsPractice3;

import java.util.Scanner;

public class WeddingInvestments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        String type = scanner.nextLine();
        String addedDessert = scanner.next();
        int months = Integer.parseInt(scanner.nextLine());

        boolean dessert = false;
        double price = 0.0;


        if (year.equals("one")) {
            switch (type) {
                case ("Small"):
                    price = 9.98;
                    break;
                case "Middle":
                    price = 18.99;
                    break;
                case "Large":
                    price = 25.98;
                    break;
                case "ExtraLarge":
                    price = 35.99;
                    break;
            }
        } else if (year.equals("two")) {
            switch (type) {
                case "Small":
                    price = 8.58;
                    break;
                case "Middle":
                    price = 17.09;
                    break;
                case "Large":
                    price = 23.59;
                    break;
                case "ExtraLarge":
                    price = 31.79;
                    break;
            }

        } else if ((addedDessert.equals("yes"))) {
            dessert = true;

        }
        double finalPrice = price * months;


        if (dessert) {
            if (price <= 10) {
                price = price + 5.50;
            } else if (price <= 30) {
                price = price + 4.35;
            } else {
                price = price + 3.85;
            }

        }
        if (year.equals("two")) {
            finalPrice = finalPrice * 3.75 / 100;
        }
        System.out.printf("%.2f lv", finalPrice);

    }
}






