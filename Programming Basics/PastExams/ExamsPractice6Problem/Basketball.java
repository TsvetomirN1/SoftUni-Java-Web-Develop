package ExamsPractice6;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournament = scanner.nextLine();
        String command = "";
        int matchCounter = 0;
        int winCounter = 0;
        int loseCounter = 0;
        int diff = 0;

        while (!tournament.equals("End of tournaments")) {
            int matches = Integer.parseInt(scanner.nextLine());
            while (matches!=matchCounter) {

                int desiPoints = Integer.parseInt(scanner.nextLine());
                int otherPoints = Integer.parseInt(scanner.nextLine());

                if (desiPoints > otherPoints) {
                    winCounter += 1;
                    matchCounter++;
                    diff = desiPoints - otherPoints;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", matchCounter, tournament, diff);
                    tournament = command;

                } else if (desiPoints < otherPoints) {
                    loseCounter += 1;
                    matchCounter++;
                    diff = otherPoints - desiPoints;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", matchCounter, tournament, diff);
                }
                if (matchCounter == matches) {
                    break;
                }

            }

            tournament = scanner.nextLine();
        }
        double percentageWin = winCounter / matchCounter * 100;
        double percentageLost = winCounter / matchCounter * 100;
        System.out.printf("%.2f%% matches win", percentageWin);
        System.out.printf("%.2f%% matches lost", percentageLost);
    }
}

