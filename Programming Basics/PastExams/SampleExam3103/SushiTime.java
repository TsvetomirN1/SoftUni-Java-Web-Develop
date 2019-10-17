package SampleExam3103;

import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sushiType = scanner.nextLine();
        String restaurant = scanner.nextLine();
        int portions = Integer.parseInt(scanner.nextLine());
        String order = scanner.nextLine();

        double price = 0;
        boolean isError = false;

        if (restaurant.equals("Sushi Zone")) {
            switch (sushiType) {
                case "sashimi":
                    price = 4.99;
                    break;
                case "maki":
                    price = 5.29;
                    break;
                case "uramaki":
                    price = 5.99;
                    break;
                case "temaki":
                    price = 4.29;
                    break;
                default:
                    isError = true;
                    break;
            }

        } else if (restaurant.equals("Sushi Time")) {
            switch (sushiType) {
                case "sashimi":
                    price = 5.49;
                    break;
                case "maki":
                    price = 4.69;
                    break;
                case "uramaki":
                    price = 4.49;
                    break;
                case "temaki":
                    price = 5.19;
                    break;
                default:
                    isError = true;
                    break;
            }
        } else if (restaurant.equals("Sushi Bar")) {
            switch (sushiType) {
                case "sashimi":
                    price = 5.25;
                    break;
                case "maki":
                    price = 5.55;
                    break;
                case "uramaki":
                    price = 6.25;
                    break;
                case "temaki":
                    price = 4.75;
                    break;
                default:
                    isError = true;
                    break;
            }
        } else if (restaurant.equals("Asian Pub")) {
            switch (sushiType) {
                case "sashimi":
                    price = 4.50;
                    break;
                case "maki":
                    price = 4.80;
                    break;
                case "uramaki":
                    price = 5.50;
                    break;
                case "temaki":
                    price = 5.50;
                    break;
                default:
                    isError = true;
                    break;
            }
        } else {
            isError = true;
        }
        double orderPrice = portions * price;

        if (isError) {
            System.out.printf("%s is invalid restaurant!", restaurant);
        } else if (order.equals("Y")) {
            double discount = orderPrice * 0.2;
            double totalPrice = discount + orderPrice;
            System.out.printf("Total price: %.0f lv.", Math.ceil(totalPrice));
        } else if (order.equals("N")) {
            orderPrice = portions * price;
            System.out.printf("Total price: %.0f lv.", Math.ceil(orderPrice));

        }
    }
}
