package WhileLoopExercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int areaOfCake = width * height;

        int cakeTaken = 0;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int pieceOfCake = Integer.parseInt(command);
            cakeTaken += pieceOfCake;
            if (areaOfCake - cakeTaken < 0) {
                break;
            }
            command = scanner.nextLine();

        }
        double difference = Math.abs(cakeTaken - areaOfCake);
        if (cakeTaken >= areaOfCake) {
            System.out.printf("No more cake left! You need %.0f pieces more.", difference);
        } else {
            System.out.printf("%.0f pieces are left.", difference);
        }

    }
}
