package ExamsPractice4;

import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int matchPlayed = Integer.parseInt(scanner.nextLine());

        int allGoalsConceded = 0;
        int allGoalsScored = 0;


        int pointsCounter = 0;
        int difference = 0;


        while (matchPlayed > 0) {
            matchPlayed--;
            int goalsNetted = Integer.parseInt(scanner.nextLine());
            int goalsReceived = Integer.parseInt(scanner.nextLine());

            allGoalsScored += goalsNetted;
            allGoalsConceded += goalsReceived;

            if (goalsNetted > goalsReceived) {
                pointsCounter += 3;
                difference = goalsNetted - goalsReceived;

            } else if (goalsNetted < goalsReceived) {
                difference = goalsNetted - goalsReceived;

            } else if (goalsNetted == goalsReceived) {

                pointsCounter += 1;
            }

        }
        difference = allGoalsScored - allGoalsConceded;

        if (difference >= 0) {
            System.out.printf("%s has finished the group phase with %d points.", teamName, pointsCounter);
            System.out.println();
            System.out.printf("Goal difference: %d.", difference);

        } else {
            System.out.printf("%s has been eliminated from the group phase.", teamName);
            System.out.println();
            System.out.printf("Goal difference: %d.", difference);
        }


    }
}
