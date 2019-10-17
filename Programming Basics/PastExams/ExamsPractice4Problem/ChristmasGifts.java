package ExamsPractice4;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int adultsCounter = 0;
        int kidsCounter = 0;
        int totalToysPrice = 0;
        int totalSweatersPrice = 0;

        String input = scanner.nextLine();


        while (!input.equals("Christmas")) {
            int years = Integer.parseInt(input);

            if (years <= 16) {
                kidsCounter++;
                int toysPrice = 5;
                totalToysPrice += toysPrice;

            } else {
                adultsCounter++;
                int sweatersPrice = 15;
                totalSweatersPrice += sweatersPrice;

            }


            input = scanner.nextLine();
        }


        System.out.printf("Number of adults: %d%n", adultsCounter);
        System.out.printf("Number of kids: %d%n", kidsCounter);
        System.out.printf("Money for toys: %d%n", totalToysPrice);
        System.out.printf("Money for sweaters: %d", totalSweatersPrice);


    }
}
