package Methods_Exercise.Methods_Lab;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String result = repeatString(s, repeatCount);
        System.out.println(result);

    }

    private static String repeatString(String s, int repeatCount) {
        String[] repetition = new String[repeatCount];
        for (int i = 0; i < repeatCount; i++) {
            repetition[i] = s;

        }
        return String.join("", repetition);
    }
}
