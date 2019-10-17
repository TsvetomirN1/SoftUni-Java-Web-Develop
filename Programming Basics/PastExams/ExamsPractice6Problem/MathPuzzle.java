package ExamsPractice6;

import java.util.Scanner;

public class MathPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int result = 0;
        boolean combo = false;

        for (int i = 1; i <= 30; i++) {
            for (int k = 1; k <= 30; k++) {
                for (int m = 1; m <= 30; m++) {
                    if (i < k && k < m) {
                        sum = i + k + m;
                        if (sum == number) {
                            System.out.printf("%d + %d + %d = %d%n", i, k, m, number);
                            combo = true;
                        }
                    }
                    if (i > k && k > m) {
                        result = i * k * m;
                        if (result == number) {
                            System.out.printf("%d * %d * %d = %d%n", i, k, m, number);
                            combo = true;
                        }
                    }
                }
            }
        }

        if (!combo) {
            System.out.println("No!");
        }
    }
}
