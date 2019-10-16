package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int k = 0; k < currentNum.length(); k++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(k));
                if (k % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
