package ExamsPractice6;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        int firstSymbol = 35;
        int secondSymbol = 64;
        int counter = 0;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf("%c%c%d%d%c%c|", (char) firstSymbol, (char) secondSymbol,
                        i, j, (char) secondSymbol, (char) firstSymbol);
                counter++;
                firstSymbol++;

                if (firstSymbol > 55) {
                    firstSymbol = 35;
                }
                secondSymbol++;

                if (secondSymbol > 96) {
                    secondSymbol = 64;
                }

                if (counter == maxPasswords) {
                    return;
                }

            }
        }
    }
}

