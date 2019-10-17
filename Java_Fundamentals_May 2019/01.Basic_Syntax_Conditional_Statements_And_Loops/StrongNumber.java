package BasicsSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.nextLine();
        int factSum = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            int digit = inputNumber.charAt(i) - '0';
            int factorial = 1;
            for (int b = 2; b <= digit; b++) {
                factorial = factorial * b;


            }
            factSum += factorial;
        }
        int expectedSum = Integer.parseInt(inputNumber);
        if (factSum == expectedSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
