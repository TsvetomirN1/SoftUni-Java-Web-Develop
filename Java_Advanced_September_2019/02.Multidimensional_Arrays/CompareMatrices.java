package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] firstMatrix = readMatrix(rows, cols, scanner);

        rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        rows = rowsAndCols[0];
        cols = rowsAndCols[1];

        int[][] secondMatrix = readMatrix(rows, cols, scanner);

        if (areMatrixEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }

    }

    private static boolean areMatrixEqual(int[][] firstMatrix, int[][] secondMatrix) {
        boolean areEqual = true;

        if (firstMatrix.length != secondMatrix.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                int[] firstArray = firstMatrix[i];
                int[] secondArray = secondMatrix[i];
                if (firstArray.length != secondArray.length) {
                    areEqual = false;
                    break;
                } else {
                    for (int j = 0; j < firstArray.length; j++) {
                        if (firstArray[j] != secondArray[j]) {
                            areEqual = false;
                            break;
                        }
                    }
                }
            }

        }
        return areEqual;

    }


    private static int[][] readMatrix(int row, int col, Scanner scanner) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (int j = 0; j < elements.length; j++) {
                int number = Integer.parseInt(elements[j]);
                matrix[i][j] = number;
            }
        }
        return matrix;
    }
}
