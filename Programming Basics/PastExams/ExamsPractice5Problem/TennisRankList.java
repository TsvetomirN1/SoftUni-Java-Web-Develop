package ExamsPractice5;

import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double finalPoints = 0;
        double percentageCounter = 0;

        for (int i = 0; i < tournaments; i++) {
            String etap = scanner.nextLine();

            if (etap.equals("W")) {
                finalPoints += 2000;
                percentageCounter++;

            } else if (etap.equals("F")) {
                finalPoints += 1200;
            } else {
                finalPoints += 720;
            }

        }
        double averagePoints = Math.floor(finalPoints / tournaments);
        finalPoints += startingPoints;
        double totalPercentage = (percentageCounter / tournaments) * 100;

        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.02f%%", totalPercentage);
    }
}





