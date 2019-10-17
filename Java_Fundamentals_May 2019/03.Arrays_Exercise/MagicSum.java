package Arrays_Exercise;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int[] numbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        int n = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbers.length; index++) {
            for (int j = index + 1; j < numbers.length; j++) {
                if (numbers[index] + numbers[j] == n) {
                    System.out.printf("%s %s%n", numbers[index], numbers[j]);
                }

            }
        }
    }
}
