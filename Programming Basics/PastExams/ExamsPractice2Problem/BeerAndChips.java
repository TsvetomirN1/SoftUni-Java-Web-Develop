package ExamsPractice2;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FanName = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double beerPrice = beers*1.20;
        double chipsPrice = beerPrice*45/100;
        double TotalchipsPrice = Math.ceil(chips*chipsPrice);
        double totalMoney = beerPrice+TotalchipsPrice;


        if (totalMoney<=budget){
            System.out.printf( "%s bought a snack and has %.02f leva left.", FanName, budget-totalMoney);
        }else {
            System.out.printf("%s needs %.02f more leva!", FanName, totalMoney - budget);
        }
    }
}
