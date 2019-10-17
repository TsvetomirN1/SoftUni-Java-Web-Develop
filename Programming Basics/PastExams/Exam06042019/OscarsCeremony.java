package Exam06042019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naem = Integer.parseInt(scanner.nextLine());

        double statuetkiPrice = naem * 0.7;
        double cateringPrice = statuetkiPrice * 0.85;
        double ozvuchavanePrice = cateringPrice * 0.5;

        double totalPrice = naem + statuetkiPrice + cateringPrice + ozvuchavanePrice;

        System.out.printf("%.02f", totalPrice);
    }
}
