package SampleExam3103;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int firstDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number / 100 % 10;

        for (int firstMultiplier = 1; firstMultiplier <= firstDigit; firstMultiplier++) {
            for (int secondMultiplier = 1; secondMultiplier <= secondDigit; secondMultiplier++) {
                for (int thirdMultiplier = 1; thirdMultiplier <= thirdDigit; thirdMultiplier++) {
                    int result = firstMultiplier * secondMultiplier * thirdMultiplier;
                    System.out.printf("%d * %d * %d = %d;%n", firstMultiplier, secondMultiplier, thirdMultiplier, result);
                }
            }
        }
    }
}
