package NestedLoopsExercise;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNum = scanner.nextLine();

        for (int i = inputNum.length() - 1; i >= 0; i--) {
            char currentDigit = inputNum.charAt(i);
            int currentDigitToNum = Integer.parseInt("" + currentDigit);

            if (currentDigitToNum == 0) {
                System.out.println("ZERO");
                continue;
            }
            for (int n = 1; n <= currentDigitToNum; n++) {
                System.out.print((char) (currentDigitToNum + 33));
            }
            System.out.println();

        }
    }
}
