package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTransactions = Integer.parseInt(scanner.nextLine());
        int i = 0;
        double sum = 0.0;

        while (i < numberTransactions) {

            double amount = Double.parseDouble(scanner.nextLine());

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += amount;
            System.out.printf(" Increase: %.2f%n", amount);
            i++;

        }
        System.out.printf("Total: %.2f", sum);
    }
}
