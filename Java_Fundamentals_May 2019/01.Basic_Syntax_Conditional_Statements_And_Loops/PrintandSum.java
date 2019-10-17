package BasicsSyntax;

import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int number = startNum; number <= endNum; number++) {
            System.out.print(number + " ");

            sum += number;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
