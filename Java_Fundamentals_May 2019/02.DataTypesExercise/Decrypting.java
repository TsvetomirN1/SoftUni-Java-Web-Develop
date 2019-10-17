package DataTypesExercise;

import java.util.Scanner;

public class Decrypting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int inChar = input.charAt(0) + key;
            message += (char) inChar;

        }
        System.out.println(message);

    }
}

