package WhileLoop;

import java.util.Scanner;

public class NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (!(number > 0) || !(number < 101)) {
            System.out.println("Invalid number!");
            number = Integer.parseInt(scanner.nextLine());

        }

        System.out.printf("The number is: %d", number);
    }
}
