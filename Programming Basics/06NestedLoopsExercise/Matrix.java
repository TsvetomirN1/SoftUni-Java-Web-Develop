package NestedLoopsExercise;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int topLeft = a; topLeft <= b; topLeft++) {
            for (int topRight = a; topRight <= b; topRight++) {
                if (topLeft == topRight) {
                    continue;
                }
                for (int bottomLeft = c; bottomLeft <= d; bottomLeft++) {
                    for (int bottomRight = c; bottomRight <= d; bottomRight++) {
                        if (bottomLeft != bottomRight) {
                            int leftDiagonal = topLeft + bottomRight;
                            int rightDiagonal = topRight + bottomLeft;
                            if (leftDiagonal == rightDiagonal) {
                                System.out.printf("%s%s%n%s%s%n", topLeft, topRight, bottomLeft, bottomRight);
                                System.out.println();
                            }

                        }
                    }
                }
            }
        }
    }
}
