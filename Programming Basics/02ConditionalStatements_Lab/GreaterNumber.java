package ConditionalStatements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = Integer.parseInt(scanner.nextLine());

        if (numA % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}