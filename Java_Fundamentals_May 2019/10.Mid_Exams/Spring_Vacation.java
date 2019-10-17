package MIDEXAMS.Mid_Exam10March.Mid_Exam10March;

import java.util.Scanner;

public class Spring_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int groupPeople = Integer.parseInt(scanner.nextLine());
        double priceFuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPersonPerDay = Double.parseDouble(scanner.nextLine());
        double priceForOneNight = Double.parseDouble(scanner.nextLine());

        double foodExpenses = foodExpensesPerPersonPerDay * groupPeople * days;
        double hotelPrice = priceForOneNight * groupPeople * days;
        if (groupPeople > 10) {
            hotelPrice = hotelPrice * 0.75;
        }

        double currentExpenses = foodExpenses + hotelPrice;
        double totalExpenses = 0;
        for (int i = 1; i <= days; i++) {

            double travelledDistance = Double.parseDouble(scanner.nextLine());
            double consumedFuel = travelledDistance * priceFuelPerKm;
            currentExpenses += consumedFuel;

            if (budget < currentExpenses) {
                break;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                double currentAdd = 0.4 * currentExpenses;
                currentExpenses += currentAdd;
            }
            if (i == 7) {
                double moneyReceived = currentExpenses / groupPeople;
                currentExpenses -= moneyReceived;
            }

            totalExpenses = currentExpenses;

        }

        if (budget >= totalExpenses) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - totalExpenses);
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", Math.abs(budget - totalExpenses));
        }

    }
}
