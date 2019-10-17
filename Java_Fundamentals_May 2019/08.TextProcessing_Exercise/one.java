package TextProcessingExercise;

import java.util.Scanner;

public class one {

    private static boolean validateUsername(String userName) {
        if (userName.length() < 3 || userName.length() > 16) {
            return false;
        }
        for (int i = 0; i < userName.length(); i++) {
            char symbol = userName.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String userName : userNames) {
            if (validateUsername(userName)) {
                System.out.println(userName);
            }
        }
    }
}




