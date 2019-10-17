package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < input[0]; i++) {
            for (int j = 0; j < input[1]; j++) {
                System.out.print(String.format("%c%c%c ",
                        (char) 97 + i, (char) 97 + j + i, (char) 97 + i));
            }
            System.out.println();
        }
    }
}
