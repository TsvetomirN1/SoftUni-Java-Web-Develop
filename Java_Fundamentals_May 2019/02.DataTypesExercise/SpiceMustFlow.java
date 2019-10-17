package DataTypesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int leftPerday = 0;
        int daysOpen = 0;
        if (startingYield < 100) {
            leftPerday = 0;
        } else {
            while (startingYield >= 100) {

                leftPerday += startingYield - 26;
                daysOpen++;
                startingYield -= 10;
            }
            leftPerday -= 26;
        }

        System.out.println(daysOpen);
        System.out.println(leftPerday);
    }
}
