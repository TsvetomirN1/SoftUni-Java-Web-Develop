package Arrays_Exercise.Arrays_Lab;

import java.util.Scanner;

public class Foreach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] numbers = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
