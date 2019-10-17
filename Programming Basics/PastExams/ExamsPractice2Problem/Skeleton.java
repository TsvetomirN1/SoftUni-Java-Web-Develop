package ExamsPractice2;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        int contolaInSeconds = minutes * 60 + seconds;
        double time = length / 120;
        double totalTime = time * 2.5;
        double timeMarin = (length / 100) * secondsFor100Meters - totalTime;

        if (timeMarin <= contolaInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.03f.", timeMarin);
        } else {
            System.out.printf("No, Marin failed! He was %.03f second slower.", Math.abs(contolaInSeconds - timeMarin));
        }

    }
}
