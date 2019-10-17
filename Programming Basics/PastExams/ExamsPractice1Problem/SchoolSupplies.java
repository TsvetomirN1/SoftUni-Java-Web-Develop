package ExamsPractice1;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double litres = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pensPrice = 5.80 * pens;
        double markersPrice = 7.20 * markers;
        double litresPrice = litres * 1.20;

        double totalPrice = pensPrice + litresPrice + markersPrice;

        double priceWithDiscount = totalPrice- (totalPrice * percentDiscount / 100);

        System.out.printf("%.03f", priceWithDiscount);

    }
}
