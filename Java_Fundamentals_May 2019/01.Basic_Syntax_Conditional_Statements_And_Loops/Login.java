package BasicsSyntax;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";
        int counter = 1;
        for (int index = userName.length() - 1; index >= 0; index--) {
            password += userName.charAt(index);
        }
        String entry = scanner.nextLine();
        while (!entry.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            entry = scanner.nextLine();
            counter++;
            if (counter >= 4) {
                break;
            }
        }
        if (entry.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        } else {
            System.out.printf("User %s blocked!%n", userName);
        }
    }
}
