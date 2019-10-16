package NestedLoopsExercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int symbolOne = 1; symbolOne <= n; symbolOne++) {
            for (int symbolTwo = 1; symbolTwo <= n; symbolTwo++) {
                for (char symbolThree = 'a'; symbolThree < 'a' + l; symbolThree++) {
                    for (char symbolFour = 'a'; symbolFour < 'a' + l; symbolFour++) {
                        for (int symbolFive = 1; symbolFive <= n; symbolFive++) {
                            if (symbolFive > symbolOne && symbolFive > symbolTwo) {
                                System.out.printf("%d%d%s%s%d ",
                                        symbolOne, symbolTwo, symbolThree, symbolFour, symbolFive);
                            }
                        }
                    }

                }
            }
        }
    }
}
