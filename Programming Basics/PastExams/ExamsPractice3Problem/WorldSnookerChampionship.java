package ExamsPractice3;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String etap = scanner.nextLine();
        String ticket = scanner.nextLine();
        int ticketNum = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();

        double price = 0;


        if (etap.equals("Quarter final")) {
            switch (ticket) {
                case "Standard":
                    price = 55.50;
                    break;
                case "Premium":
                    price = 105.20;
                    break;
                case "VIP":
                    price = 118.90;
                    break;
            }
        } else if (etap.equals("Semi final")) {
            switch (ticket) {
                case "Standard":
                    price = 75.88;
                    break;
                case "Premium":
                    price = 125.22;
                    break;
                case "VIP":
                    price = 300.40;
                    break;
            }
        } else if (etap.equals("Final")) {
            switch (ticket) {
                case "Standard":
                    price = 110.10;
                    break;
                case "Premium":
                    price = 160.66;
                    break;
                case "VIP":
                    price = 400;
                    break;
            }

        }

        double totalPrice = ticketNum * price;



            if (totalPrice > 4000) {
                totalPrice = totalPrice * 0.75;

            }
            else if (totalPrice > 2500) {
                if (picture.equals("Y")) {
                    double pictures = ticketNum * 40;
                totalPrice = totalPrice * 0.9;
                totalPrice = totalPrice + pictures;
            }

        }

        System.out.printf("%.02f",totalPrice);
    }
}






