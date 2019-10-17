package Arrays_Exercise.Arrays_Lab;

import java.util.Scanner;

public class OneLine {
    public static int[] parseLineOfNumbers(String line) {
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        return  numbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] numbers = parseLineOfNumbers(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");

            }
        }
    }
}
