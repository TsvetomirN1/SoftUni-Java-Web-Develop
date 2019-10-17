package Exam2104;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int clients = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double totalPrice = 0;
        int itemCounter = 0;

        while (!"Finish".equals(command)) {
            for (int i = 0; i < clients; i++) {
                double price = 0;

                if (command.equals("basket")) {
                    price = 1.50;

                } else if (command.equals("wreath")) {
                    price = 3.80;

                } else if (command.equals("chocolate bunny")) {
                    price = 7;

                }


                itemCounter++;
                totalPrice += price;
                command = scanner.nextLine();
            }


        }
        if (command.equals("Finish")) {

            if (itemCounter % 2 == 0) {
                totalPrice = totalPrice * 0.8;
            }
            System.out.printf("You purchased %d items for %.2f leva.", itemCounter, totalPrice);

        }

        double averageBill = totalPrice / clients;
        System.out.printf("Average bill per client is: %.2f leva.", averageBill);

    }
}
