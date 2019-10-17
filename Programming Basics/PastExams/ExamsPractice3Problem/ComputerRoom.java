package ExamsPractice3;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int numPeople = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double price = 0;


        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (dayOrNight.equals("day")) {
                price = 10.5;
            } else if (dayOrNight.equals("night")) {
                price = 8.4;
            }
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (dayOrNight.equals("day")) {
                price = 12.6;
            } else if (dayOrNight.equals("night")) {
                price = 10.20;
            }
        }


        if (numPeople >=4 ) {
            price = price * 0.9;
            if (hours >= 5) {
                price = price * 0.5;

            }
        }

        double totalCost = (price * hours) * numPeople;


            System.out.printf("Price per person for one hour: %.2f", price);
            System.out.println();
            System.out.printf("Total cost of the visit: %.2f", totalCost);

        }

    }





