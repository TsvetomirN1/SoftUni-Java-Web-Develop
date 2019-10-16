package WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int bonusSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += bonusSteps;
                break;
            }

            int steps = Integer.parseInt(input);
            totalSteps += steps;
        }
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}
