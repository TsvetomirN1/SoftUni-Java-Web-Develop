package TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstDigit = scanner.nextLine();
        int secondDigit = Integer.parseInt(scanner.nextLine());
        StringBuilder sum = new StringBuilder();
        int rest = 0;
        for (int i = firstDigit.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(firstDigit.substring(i, i + 1));
            int currentResult = digit * secondDigit;
            currentResult += rest;
            sum.append((currentResult % 10));
            rest = currentResult / 10;
        }
        if (rest != 0) {
            sum.append(rest);
        }

        if (secondDigit == 0) {
            System.out.println(0);
            return;
        } else {
            StringBuilder output = new StringBuilder();
            boolean trailing = true;
            for (int i = sum.length() - 1; i >= 0; i--) {
                if (Integer.parseInt(sum.substring(i, i + 1)) == 0 && trailing) {

                } else {
                    trailing = false;
                    output.append(sum.charAt(i));
                }
            }
            System.out.println(output.toString());
        }

    }
}
