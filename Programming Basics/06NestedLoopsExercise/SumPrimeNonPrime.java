package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;

        String command = scanner.nextLine();

        while (!command.equals("stop")) {
            int possiblePrime = Integer.parseInt(command);
            boolean isPrime = true;

            if (possiblePrime < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            } else if (possiblePrime == 1) {
                nonPrimeSum += possiblePrime;
                command = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < possiblePrime; i++) {
                if (possiblePrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeSum += possiblePrime;
            } else {
                nonPrimeSum += possiblePrime;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);


    }
}
