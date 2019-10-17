package ExamsPractice1;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sectors = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());

        double sectorIncome = (capacity*ticketPrice)/sectors;
        double totalProfit = sectorIncome*sectors;
        double moneyForCharity = (totalProfit-(sectorIncome*0.75))/8;

        System.out.printf("Total income - %.02f BGN%n",totalProfit);
        System.out.printf("Money for charity - %.02f BGN",moneyForCharity);

    }
}
