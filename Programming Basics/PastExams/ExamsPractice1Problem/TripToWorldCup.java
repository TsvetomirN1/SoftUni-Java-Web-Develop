package ExamsPractice1;

import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double departureTicketPrice = Double.parseDouble(scanner.nextLine());
        double returnTicketPrice = Double.parseDouble(scanner.nextLine());
        double matchTicketPrice = Double.parseDouble(scanner.nextLine());
        int matches = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalTicketPrice = 6 * (departureTicketPrice + returnTicketPrice);
        double ticketPriceAfterDiscount = totalTicketPrice - (totalTicketPrice * discount / 100);
        double totalMatchTicketPrice = matches * matchTicketPrice * 6;
        double totalPrice = ticketPriceAfterDiscount + totalMatchTicketPrice;
        double priceForOne = totalPrice / 6;
        System.out.printf("Total sum: %.02f lv.%n", totalPrice);
        System.out.printf("Each friend has to pay %.02f lv.", priceForOne);
    }
}
