package ExamsPractice4;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameA = scanner.nextLine();
        String nameB = scanner.nextLine();

        String cardA = scanner.nextLine();
        boolean isWar = false;
        int scoreA = 0;
        int scoreB = 0;

        while (!cardA.equals("End of game")) {
            String cardB = scanner.nextLine();
            int pointsPlayerA = Integer.parseInt(cardA);
            int pointsPlayerB = Integer.parseInt(cardB);

            if (pointsPlayerA > pointsPlayerB) {
                scoreA += pointsPlayerA - pointsPlayerB;

            } else if (pointsPlayerA < pointsPlayerB) {
                scoreB += pointsPlayerB - pointsPlayerA;

            } else {
                System.out.println("Number wars!");
                isWar = true;
                int tempA = Integer.parseInt(scanner.nextLine());
                int tempB = Integer.parseInt(scanner.nextLine());
                if (tempA > tempB) {
                    System.out.printf("%s is winner with %d points", nameA, scoreA);
                } else {
                    System.out.printf("%s is winner with %d points", nameB, scoreB);
                }
                break;
            }
            cardA = scanner.nextLine();
        }
        if (!isWar) {
            System.out.printf("%s has %d points%n", nameA, scoreA);
            System.out.printf("%s has %d points", nameB, scoreB);
        }

    }
}



