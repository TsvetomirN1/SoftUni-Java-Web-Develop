package Arrays_Exercise;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
        for (int begin = 0; begin < numbers.length; begin++) {

            int element = numbers[begin];
            boolean isTopNum = true;
            for (int i = begin + 1; i < numbers.length; i++) {
                if (element <= numbers[i]) {
                    isTopNum = false;
                    break;
                }
            }

            if (isTopNum) {
                System.out.print(element + " ");
            }
        }
    }
}
