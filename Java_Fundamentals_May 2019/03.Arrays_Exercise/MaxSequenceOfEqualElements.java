package Arrays_Exercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int[] numbers = new int[array.length];
        int startIndex = 0;
        int endIndex = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);

        }
        for (int index = 0; index < numbers.length; index++) {
            int currentCount = 0;
            for (int j = index; j < numbers.length; j++) {

                if (numbers[index] == numbers[j]) {
                    currentCount++;
                    if (currentCount > count) {
                        count = currentCount;
                        startIndex = index;
                        endIndex = j;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
