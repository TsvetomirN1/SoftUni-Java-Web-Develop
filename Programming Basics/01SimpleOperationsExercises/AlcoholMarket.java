package SimpleOperationsExercises;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double WhiskeyPrice = Double.parseDouble(scanner.nextLine());
        double BeerLitres = Double.parseDouble(scanner.nextLine());
        double WineLitres = Double.parseDouble(scanner.nextLine());
        double RakiaLitres = Double.parseDouble(scanner.nextLine());
        double WhiskeyLitres = Double.parseDouble(scanner.nextLine());

        double RakiaPrice = WhiskeyPrice * 0.5;
        double WinePrice = RakiaPrice * 0.6;
        double BeerPrice = RakiaPrice * 0.2;

        double TotalWhiskey = WhiskeyLitres * WhiskeyPrice;
        double TotalRakia = RakiaLitres * RakiaPrice;
        double TotalWine = WineLitres * WinePrice;
        double TotalBeer = BeerLitres * BeerPrice;

        double TotalPrice = TotalWhiskey + TotalRakia + TotalWine + TotalBeer;

        System.out.printf("%.2f", TotalPrice);


    }
}
