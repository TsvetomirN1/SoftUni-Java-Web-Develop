package BasicsSyntax;

import java.util.Scanner;

public class Gaming_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        double price = 0;
        String input = scanner.nextLine();
        boolean isFound = true;
        double totalSpent = 0;

        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4":
                    isFound = true;
                    price = 39.99;
                    break;
                case "CS: OG":
                    isFound = true;
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    isFound = true;
                    price = 19.99;
                    break;
                case "Honored 2":
                    isFound = true;
                    price = 59.99;
                    break;
                case "RoverWatch":

                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    isFound = true;
                    price = 39.99;
                    break;
                default:
                    isFound = false;
                    System.out.println("Not Found");
                    break;
            }

            if (isFound) {
                if (balance >= price) {
                    balance -= price;
                    totalSpent += price;
                    System.out.printf("Bought %s%n", input);

                } else {
                    System.out.println("Too Expensive");
                }
            }
            if (balance <= 0) {
                System.out.print("Out of money!");
            }
            input = scanner.nextLine();
        }
        if (balance >= 0) {
            System.out.printf("Total spent: $%.2f. ", totalSpent);
            System.out.printf("Remaining: $%.2f", balance);
        }
    }
}
