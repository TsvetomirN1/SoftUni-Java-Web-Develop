package ExamsPractice2;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double timeInSeconds = distanceInMetres * timeInSecondsForOneMeter;
        double naklon = Math.floor(distanceInMetres / 50)*30;
        double totalTime = timeInSeconds + naklon;

        if (recordInSeconds <= totalTime) {
            System.out.printf("No! He was %.02f seconds slower.", totalTime - recordInSeconds);
        } else {
            System.out.printf("Yes! The new record is %.02f seconds.", totalTime);
        }
    }
}
