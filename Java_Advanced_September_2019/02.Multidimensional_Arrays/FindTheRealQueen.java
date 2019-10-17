package MultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 8;

        char[][] board = new char[size][size];

        for (int i = 0; i < size; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                board[i][j] = line[j].charAt(0);
            }
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (board[r][c] == 'q') {
                    boolean isColValid = checkQueenCol(board, c);
                    boolean isRowValid = checkQueenRow(board, r);
                    boolean isDiagonalValidUpLeft = checkQueenDiagonalUpLeft(board, r, c);
                    boolean isDiagonalValidDownAndRight = checkQueenDiagonalDownRight(board, r, c);
                    boolean isDiagonalValidUpRight = checkQueenDiagonalUpRight(board, r, c);
                    boolean isDiagonalValidDownLeft = checkQueenDiagonalDownLeft(board, r, c);

                    if (isColValid && isRowValid && isDiagonalValidUpLeft && isDiagonalValidDownAndRight
                            && isDiagonalValidUpRight && isDiagonalValidDownLeft) {
                        System.out.println(r + " "+ c);
                        return;
                    }
                }
            }
        }
    }

    private static boolean checkQueenDiagonalDownLeft(char[][] board, int row, int col) {

        row++;
        col--;
        while (row<8 && col>=0) {
            if (board[row++][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenDiagonalUpRight(char[][] board, int row, int col) {
        row--;
        col++;
        while (row >= 0 && col < 8) {
            if (board[row--][col++] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenDiagonalDownRight(char[][] board, int row, int col) {

        row++;
        col++;
        while (row < 8 && col < 8) {
            if (board[row++][col++] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenDiagonalUpLeft(char[][] board, int row, int col) {

        row--;
        col--;
        while (row >= 0 && col >= 0) {
            if (board[row--][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenRow(char[][] board, int r) {
        int queens = 0;

        for (int i = 0; i < board.length; i++) {
            char symbol = board[r][i];
            if (symbol == 'q') {
                queens++;
            }
        }
        return queens == 1;
    }

    private static boolean checkQueenCol(char[][] board, int col) {
        int queens = 0;

        for (int i = 0; i < board.length; i++) {
            char symbol = board[i][col];
            if (symbol == 'q') {
                queens++;
            }
        }
        return queens == 1;

    }
}
