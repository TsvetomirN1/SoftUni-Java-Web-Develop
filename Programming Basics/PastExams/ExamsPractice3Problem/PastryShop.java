package ExamsPractice3;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dessert = scanner.nextLine();
        int dessertNum = Integer.parseInt(scanner.nextLine());
        int dayBeforeChristmas = Integer.parseInt(scanner.nextLine());

        double price = 0;


        if (dayBeforeChristmas <= 15) {

            switch (dessert) {
                case "Cake":
                    price = dessertNum * 24;
                    break;
                case "Souffle":
                    price = dessertNum * 6.66;
                    break;
                case "Baklava":
                    price = dessertNum * 12.60;
                    break;

            }

        } else if (dayBeforeChristmas > 15 ) {

            switch (dessert) {
                case "Cake":
                    price = dessertNum * 28.70;
                    break;
                case "Souffle":
                    price = dessertNum * 9.80;
                    break;
                case "Baklava":
                    price = dessertNum * 16.98;
                    break;
            }

        }
        if (dayBeforeChristmas <= 22) {
            if (price > 100 && price <= 200) {
                price = price * 0.85;
            } else if (price > 200) {
                price = price * 0.75;

            }
            if (dayBeforeChristmas <= 15) {
                price = price * 0.90;
            }
        }


        System.out.printf("%.2f", price);
    }
}
