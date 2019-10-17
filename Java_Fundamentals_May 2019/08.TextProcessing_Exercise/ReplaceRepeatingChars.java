package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char firstChar = ' ';
        for (int i = 0; i < input.length(); i++) {
            if (firstChar != input.charAt(i)) {
                firstChar = input.charAt(i);
                System.out.print(firstChar);
            }
        }
    }
}
