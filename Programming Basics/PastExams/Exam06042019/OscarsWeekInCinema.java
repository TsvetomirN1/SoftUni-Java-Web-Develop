package Exam06042019;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (movie.equals("A Star Is Born")) {
            switch (hall) {
                case "normal":
                    price = 7.50;
                    break;
                case "luxury":
                    price = 10.50;
                    break;
                case "ultra luxury":
                    price = 13.50;
                    break;
            }
        } else if (movie.equals("Bohemian Rhapsody")) {
            switch (hall) {
                case "normal":
                    price = 7.35;
                    break;
                case "luxury":
                    price = 9.45;
                    break;
                case "ultra luxury":
                    price = 12.75;
                    break;
            }
        } else if (movie.equals("Green Book")) {
            switch (hall) {
                case "normal":
                    price = 8.15;
                    break;
                case "luxury":
                    price = 10.25;
                    break;
                case "ultra luxury":
                    price = 13.25;
                    break;
            }
        } else if (movie.equals("The Favourite")) {
            switch (hall) {
                case "normal":
                    price = 8.75;
                    break;
                case "luxury":
                    price = 11.55;
                    break;
                case "ultra luxury":
                    price = 13.95;
                    break;
            }
        }
        double income = tickets * price;
        System.out.printf("%s -> %.02f lv.", movie, income);
    }
}
