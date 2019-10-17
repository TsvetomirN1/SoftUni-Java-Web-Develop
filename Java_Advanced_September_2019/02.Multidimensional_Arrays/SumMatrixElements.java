package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] sizes = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = sizes[0];
        int cols = sizes[1];
        int[][] matrix = new int[rows][cols];


        System.out.println(rows);
        System.out.println(cols);

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().split(", ");
            for (int j = 0; j < elements.length; j++) {
                int number = Integer.parseInt(elements[j]);
                matrix[i][j] = number;
                sum+=number;
            }
        }
        System.out.println(sum);
    }
}

