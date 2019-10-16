package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int beginNumber = 1;
        int iterations = 1;
        boolean breakMe = false;
        while (true) {

            for (int i = 0; i < iterations; i++) {
                System.out.print(beginNumber++ + " ");
                if (beginNumber > n) {
                    breakMe = true;
                    break;
                }
            }
            System.out.println();
            iterations++;
            if (breakMe) {
                break;
            }

        }


    }
}
