package Methods_Exercise;

import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int result = sum(number1, number2) - number3;
        System.out.println(result);

    }

    static int sum(int a, int b) {
        int combo = a + b;

        return combo;
    }

}

