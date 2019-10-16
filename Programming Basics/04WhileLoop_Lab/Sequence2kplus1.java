package WhileLoop;

import java.util.Scanner;

public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number2kPlus1 = 1;

        while (n >= number2kPlus1) {
            System.out.println(number2kPlus1);

            number2kPlus1 = number2kPlus1 * 2 + 1;
        }

    }
}
