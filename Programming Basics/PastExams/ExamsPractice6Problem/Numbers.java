package ExamsPractice6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int thirdDigit = n % 10;
        int secondDigit = n / 10 % 10;
        int firstDigit = n / 100 % 10;
        int sumRows = firstDigit + secondDigit;
        int sumCollums = firstDigit + thirdDigit;

        for (int i = 0; i < sumRows; i++) {
            for (int j = 0; j < sumCollums; j++) {
                if (n % 5 == 0) {
                    n -= firstDigit;
                } else if (n % 3 == 0) {
                    n -= secondDigit;
                } else {
                    n += thirdDigit;
                }
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
    }
}

