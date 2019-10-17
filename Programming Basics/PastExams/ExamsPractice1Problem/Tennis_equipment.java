package ExamsPractice1;

import java.util.Scanner;

public class Tennis_equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rocketPrice = Double.parseDouble(scanner.nextLine());
        int rocketNum = Integer.parseInt(scanner.nextLine());
        int sneakersNum = Integer.parseInt(scanner.nextLine());

        double allRocketsPrice = rocketNum * rocketPrice;
        double sneakersPrice = rocketPrice /6;
        double totalSneakersPrice = sneakersNum * sneakersPrice;
        double otherPrice = (allRocketsPrice + totalSneakersPrice) * 0.2;
        double totalPrice = allRocketsPrice + totalSneakersPrice + otherPrice;

        double priceDjokovic = Math.floor(totalPrice / 8);
        double priceSponsors = Math.ceil(totalPrice * 7 / 8);

        System.out.printf("Price to be paid by Djokovic %.0f%n", priceDjokovic);
        System.out.printf("Price to be paid by sponsors %.0f", priceSponsors);


    }
}
