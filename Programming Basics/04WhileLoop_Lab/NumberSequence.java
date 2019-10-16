package WhileLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        String input = scanner.nextLine();


        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            input = scanner.nextLine();


        }

        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);


    }
}
