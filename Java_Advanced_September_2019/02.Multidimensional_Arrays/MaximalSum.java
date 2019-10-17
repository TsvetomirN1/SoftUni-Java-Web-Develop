package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[sizes[0]][sizes[1]];

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < sizes[0]; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int row = 0, col = 0;
        for (int r = 1; r < matrix.length - 1; r++) {
            for (int c = 1; c < matrix[r].length - 1; c++) {
                int sum = getSum(matrix, r, c);
                if (sum > maxSum) {
                    maxSum = sum;
                    row = r;
                    col = c;
                }
            }
        }
        System.out.println("Sum = " + maxSum);


        row--;
        col--;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int r, int c) {

        int sum = 0;

        sum+=matrix[r][c];

        sum+=matrix[r+1][c];
        sum+=matrix[r-1][c];
        sum+=matrix[r][c+1];
        sum+=matrix[r][c-1];

        sum+=matrix[r+1][c+1];
        sum+=matrix[r-1][c-1];
        sum+=matrix[r+1][c-1];
        sum+=matrix[r-1][c+1];


//        r--;
//        c--;
//        for (int i = r; i < r + 3; i++) {
//            for (int j = c; j < c + 3; j++) {
//                sum += matrix[i][j];
//            }
//        }


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
