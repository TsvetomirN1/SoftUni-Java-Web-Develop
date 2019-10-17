package MIDEXAMS.MidExam;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        double oneStep = Double.parseDouble(scanner.nextLine());
        int neededDistanceInMeters = Integer.parseInt(scanner.nextLine());

        double distance = 0;

        for (int i = 1; i <= steps; i++) {
            if (i % 5 == 0) {
                distance += oneStep * 0.7;
            } else {
                distance += oneStep;
            }

        }
        double percentage = distance * 100.00 / neededDistanceInMeters / 100.00;


        System.out.printf("You travelled %.2f%% of the distance!", percentage);
    }
}
