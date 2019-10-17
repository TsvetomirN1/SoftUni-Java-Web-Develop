package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split(" ");
            matrix[i] = arr;

        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] command = input.split("\\s+");
//            String swapCommand = command[0];
            if (isValid(command)) {

                int rowA = Integer.parseInt(command[1]);
                int colA = Integer.parseInt(command[2]);
                int rowB = Integer.parseInt(command[3]);
                int colB = Integer.parseInt(command[4]);
                if (isInBounds(matrix, rowA, colA, rowB, colB)) {
                    String current = matrix[rowA][colA];
                    matrix[rowA][colA] = matrix[rowB][colB];
                    matrix[rowB][colB] = current;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + " ");

                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isValid(String[] command) {
        if (!command[0].equals("swap") || command.length != 5) {
            return false;
        }

        return true;
    }

    private static boolean isInBounds(String[][] matrix, int a, int b, int c, int d) {
        if (a > -1 && a < matrix.length && b > -1 && b < matrix[a].length
                && c > -1 && c < matrix.length && d > -1 && d < matrix[c].length) {
            return true;

        }
        return false;
    }
}
