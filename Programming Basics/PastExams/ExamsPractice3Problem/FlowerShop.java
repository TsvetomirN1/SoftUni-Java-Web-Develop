package ExamsPractice3;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numHrizantemi = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        double numFlowers = numHrizantemi + numRoses + numTulips;

        if (season.equals("Spring") || season.equals("Summer")) {
            price = numHrizantemi * 2 + numRoses * 4.10 + numTulips * 2.50;

            if (day.equals("Y")) {
                price = price * 1.15;
            } else if (day.equals("N")) {
                price = price * 1;
            }

        } else if (season.equals("Autumn") || season.equals("Winter")) {
            price = numHrizantemi * 3.75 + numRoses * 4.50 + numTulips * 4.15;

            if (day.equals("Y")) {
                price = price * 1.15;
            } else if (day.equals("N")) {
                price = price * 1;
            }
        }
        if (season.equals("Spring")) {
            if (numTulips > 7) {
                price = price * 0.95;
            } else {
                price = price * 1;
            }
        } else if (numRoses >= 10) {
            if (season.equals("Winter")) {
                price = price * 0.9;
            } else {
                price = price * 1;
            }

        }
        if (numFlowers > 20) {
            if (season.equals("Spring") || season.equals("Summer") ||
                    season.equals("Autumn") || season.equals("Winter")) {
                price = price * 0.8;
            } else {
                price = price * 1;
            }
        }


        System.out.printf("%.2f", price + 2);


    }
}


