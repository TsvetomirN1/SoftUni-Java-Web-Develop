package MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

        int mainDiagonal = getMainDiagonalSum(matrix);
        int secondDiagonal = getSecondDiagonalSum(matrix);
        System.out.println(Math.abs(mainDiagonal-secondDiagonal));
    }

    private static int getSecondDiagonalSum(int[][] matrix) {
        int sum = 0;
        int row = matrix.length-1;
        int col = 0;
        while (row >= 0 && col < matrix[row].length) {
            sum += matrix[row][col];
            row--;
            col++;
        }
        return sum;
    }

    private static int getMainDiagonalSum(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = 0;
        while (row < matrix.length && col < matrix[row].length) {
            sum += matrix[row][col];
            row++;
            col++;
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
