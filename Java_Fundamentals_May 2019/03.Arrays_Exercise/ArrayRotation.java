package Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < rotations; index++) {
            int firstElement = numbers[0];

            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];

            }
            numbers[numbers.length - 1] = firstElement;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

