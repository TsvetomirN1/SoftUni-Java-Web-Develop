package Arrays_Exercise;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);

        }
        String output = "no";
        for (int i = 0; i < numbers.length; i++) {
            int lefSum = 0;
            int rightSum = 0;

            for (int l = 0; l < i; l++) {
                lefSum += numbers[l];
            }
            for (int r = i + 1; r < numbers.length; r++) {
                rightSum += numbers[r];
            }
            if (lefSum == rightSum) {
                output = i + "";
                break;
            }

        }
        System.out.println(output);
    }
}

