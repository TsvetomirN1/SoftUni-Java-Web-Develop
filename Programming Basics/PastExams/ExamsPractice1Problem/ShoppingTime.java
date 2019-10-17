package ExamsPractice1;

import java.util.Scanner;

public class ShoppingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForRest = Integer.parseInt(scanner.nextLine());
        double priceForOnePart = Double.parseDouble(scanner.nextLine());
        double priceForOneProgram = Double.parseDouble(scanner.nextLine());
        double frappePrice = Double.parseDouble(scanner.nextLine());

        int timeWithFrappe = timeForRest - 5;
        int timeForOnePart = 3 * 2;
        int timeForOneProgram = 2 * 2;
        int timeForRelaxing = timeWithFrappe - timeForOnePart - timeForOneProgram;
        double totalPriceForPeriferia = priceForOnePart * 3;
        double totalPriceForPrograms = priceForOneProgram * 2;

        double totalSpendMoney = totalPriceForPeriferia + totalPriceForPrograms + frappePrice;

        System.out.printf("%.02f%n", totalSpendMoney);
        System.out.printf("%d", timeForRelaxing);

    }
}
