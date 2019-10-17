package ExamsPractice2;

import java.util.Scanner;

public class ChristmasMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double MoneytoBeCollected = Double.parseDouble(scanner.nextLine());
        int FantasyBooks = Integer.parseInt(scanner.nextLine());
        int HorrorBooks = Integer.parseInt(scanner.nextLine());
        int RomanticBooks = Integer.parseInt(scanner.nextLine());

        double totamSumCollected = FantasyBooks*14.90+HorrorBooks*9.80+RomanticBooks*4.30;
        double DDS = totamSumCollected*20/100;
        double sumAfterPayingDDS = totamSumCollected-DDS;
        double Vaznagrajdenie = (sumAfterPayingDDS - MoneytoBeCollected);
        double percentForSellers = Math.floor(Vaznagrajdenie*10/100);
        double sumazaDarqvane = Vaznagrajdenie-percentForSellers;
        double totalSumForCharity = MoneytoBeCollected+sumazaDarqvane;

        if (totalSumForCharity>MoneytoBeCollected){
            System.out.printf("%.02f leva donated.", totalSumForCharity);
            System.out.println();
            System.out.printf("Sellers will receive %.0f leva.", percentForSellers);

        }else {
            System.out.printf("%.02f money needed.", MoneytoBeCollected-sumAfterPayingDDS);
        }

    }
}
