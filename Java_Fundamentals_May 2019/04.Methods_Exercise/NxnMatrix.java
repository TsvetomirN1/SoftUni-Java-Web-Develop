package Methods_Exercise;

import java.util.Scanner;

public class NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printSquareMatrix(n);
    }

    static void printSquareMatrix(int n) {

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                System.out.print(n + " ");

            }
            System.out.println();
        }

    }
}

