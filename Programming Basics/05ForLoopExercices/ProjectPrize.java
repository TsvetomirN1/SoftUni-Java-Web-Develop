package ForLoopExercices;

import java.util.Scanner;

public class ProjectPrize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int projectParts = Integer.parseInt(scanner.nextLine());
        double projectProfit = Double.parseDouble(scanner.nextLine());
        int totalPoints = 0;
        double totalSum = 0;

        for (int i = 1; i <= projectParts; i++) {
            int points = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                points = points * 2;
                totalPoints += points;
            } else {
                totalPoints += points;
            }
        }
        totalSum = projectProfit * totalPoints;

        System.out.printf("The project prize was %.2f lv.", totalSum);
    }
}
