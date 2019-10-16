package ConditionalStatements_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecFor1Meter = Double.parseDouble(scanner.nextLine());

        double DistanceinSec = distanceInMeters * timeInSecFor1Meter;
        double saprotivlenieInMeters = Math.floor(distanceInMeters / 15);
        double saprotivlenieInSec = saprotivlenieInMeters * 12.5;
        double totalTime = DistanceinSec + saprotivlenieInSec;

        double NotEnoughTime = totalTime - recordSec;

        if (recordSec <= totalTime) {
            System.out.printf("No, he failed! He was %.02f seconds slower.", NotEnoughTime);

        } else {
            System.out.printf(" Yes, he succeeded! The new world record is %.02f seconds.", totalTime);
        }




    }
}
