package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());


        double weekendsInSofia = 48 - h;
        double weekendsInHomeTown = 48 - weekendsInSofia;
        double saturdayGamesInSofia = weekendsInSofia * (3.0 / 4);

        double GamesInSofiaInPraznici = p * (2.0 / 3);
        double totalGames = saturdayGamesInSofia + weekendsInHomeTown + GamesInSofiaInPraznici;

        if (year.equals("leap")) {
            totalGames = totalGames * 1.15;
            System.out.printf("%.0f", Math.floor(totalGames));
        } else if (year.equals("normal")) {
            totalGames = totalGames * 1;
            System.out.printf("%.0f", Math.floor(totalGames));

        }


    }
}
