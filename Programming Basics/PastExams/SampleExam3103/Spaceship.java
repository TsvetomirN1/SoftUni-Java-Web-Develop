package SampleExam3103;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double rocket = w * l * h;
        double oneRoomSize = (height + 0.4) * 2 * 2;
        double astronauts = Math.floor(rocket / oneRoomSize);

        if (astronauts < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (astronauts >= 3 && astronauts < 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", astronauts);
        } else {
            System.out.println("The spacecraft is too big.");
        }

    }
}
