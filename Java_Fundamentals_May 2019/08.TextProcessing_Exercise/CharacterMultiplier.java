package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String first = input.substring(0, input.indexOf(" ")).trim();
        String second = input.substring(input.indexOf(" ") + 1).trim();

        int sum = calcSumChars(first, second);
        System.out.println(sum);

    }

    public static int calcSumChars(String first, String second) {
        int sum = 0;

        for (int i = 0; i < first.length() && i < second.length(); i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        if (first.length() > second.length()) {
            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);

            }
        } else {
            for (int i = first.length(); i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }
        return sum;
    }
}

