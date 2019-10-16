package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double savings = 0;
            while (savings < minBudget) {
                savings += Double.parseDouble(scanner.nextLine());

            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }


    }
}
