package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacters(input);

    }

    static void printMiddleCharacters(String input) {
        if (input.length() % 2 == 0) {
            System.out.printf("%c", input.charAt(input.length() / 2 - 1));
            System.out.printf("%c", input.charAt(input.length() / 2));
        } else {
            System.out.printf("%c", input.charAt(input.length() / 2));
        }
    }
}
