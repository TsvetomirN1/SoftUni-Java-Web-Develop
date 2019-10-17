package Arrays_Exercise.Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean identical = true;
        int firstDifferenceIndex = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]) {
                identical = false;
                firstDifferenceIndex = i;
                break;
            }
        }

        int sum = 0;
        if (identical) {
            for (int i : firstArr) {
                sum += i;
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", firstDifferenceIndex);
        }

    }

}

