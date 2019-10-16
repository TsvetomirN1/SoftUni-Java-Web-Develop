package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsLeftRightPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum = "" + i;
            int leftSum = 0;
            int rightSum = 0;
            int middleNum = 0;

            for (int k = 0; k < currentNum.length(); k++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(k));



            }


        }


    }
}
