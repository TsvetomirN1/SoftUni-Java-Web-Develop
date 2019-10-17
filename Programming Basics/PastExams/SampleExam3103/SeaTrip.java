package SampleExam3103;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyForFoodOneDay = Integer.parseInt(scanner.nextLine());
        int moneyForSouvenirsOneDay = Integer.parseInt(scanner.nextLine());
        int moneyForHotelOneDay = Integer.parseInt(scanner.nextLine());


        double road = 210*2;
        double litresBenzin = (road/100)*7;
        double lvForBenzin = litresBenzin * 1.85;
        double moneyForSouvenirsAndFood = 3 * moneyForFoodOneDay + 3 * moneyForSouvenirsOneDay;
        double dayOneHotel = moneyForHotelOneDay * 0.9;
        double dayTwoHotel = moneyForHotelOneDay * 0.85;
        double dayThreeHotel = moneyForHotelOneDay * 0.8;
        double totalSum = lvForBenzin + moneyForSouvenirsAndFood + dayOneHotel + dayTwoHotel + dayThreeHotel;

        System.out.printf("Money needed: %.02f", totalSum);


    }
}
