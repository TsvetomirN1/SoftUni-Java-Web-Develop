package DataTypesExercise.DataTypesLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);
        char symbolThree = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c ",symbolThree,symbolTwo,symbolOne);
    }
}
