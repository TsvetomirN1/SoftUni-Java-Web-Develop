package Arrays_Exercise.Arrays_Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String str[] = input.split(" ");
        int num[] = new int[str.length];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(str[i]);
            if (num[i] % 2 == 0) {
                sum += num[i];
            }

        }
        System.out.println(sum);
    }
}
