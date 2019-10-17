package ExamsPractice4;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nightsCounter = 1;
        int currentAltitude = 5364;
        int targetAltitude = 8848;
        boolean targetReached = false;
        boolean daysExpired = false;

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String decision = command;
            int currentAlt = Integer.parseInt(scanner.nextLine());


            if (("Yes".equals(decision))) {
                nightsCounter++;
            }
            if (nightsCounter > 5) {
                daysExpired = true;
                break;
            }
            currentAltitude += currentAlt;

            if (currentAltitude >= targetAltitude) {
                targetReached = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (daysExpired) {
            System.out.println("Failed!");
            System.out.println(currentAltitude);

        } else if (targetReached) {
            System.out.printf("Goal reached for %d days!", nightsCounter);

        } else {
            System.out.println("Failed!");
            System.out.println(currentAltitude);

        }

    }
}
