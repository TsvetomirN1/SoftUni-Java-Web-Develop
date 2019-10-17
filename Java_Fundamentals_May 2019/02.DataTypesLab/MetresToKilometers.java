package DataTypesExercise.DataTypesLab;

import java.util.Scanner;

public class MetresToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double kilometres = number/1000.0;
        System.out.printf("%.2f",kilometres);
    }
}
