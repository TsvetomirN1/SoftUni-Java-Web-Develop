package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            int firstNum = Integer.parseInt(input[0]);
            int secondNum = Integer.parseInt(input[1]);
            if (i % 2 == 0) {
                firstArr[i] = firstNum;
                secondArr[i] = secondNum;
            } else {
                secondArr[i] = firstNum;
                firstArr[i] = secondNum;
            }

        }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");

        }
    }
}
