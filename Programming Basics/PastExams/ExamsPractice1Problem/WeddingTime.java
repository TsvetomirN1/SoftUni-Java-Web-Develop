package ExamsPractice1;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double waterLitres = Double.parseDouble(scanner.nextLine());
        double wineLitres = Double.parseDouble(scanner.nextLine());
        double champagneLitres = Double.parseDouble(scanner.nextLine());
        double whiskeyLitres = Double.parseDouble(scanner.nextLine());

        double champagnePrice = whiskeyPrice * 0.5;
        double winePrice = champagnePrice * 0.4;
        double waterPrice = champagnePrice * 0.1;

        double totalPrice = whiskeyPrice * whiskeyLitres + waterPrice * waterLitres +
                winePrice * wineLitres + champagnePrice * champagneLitres;
        System.out.printf("%.02f", totalPrice);


    }
}
