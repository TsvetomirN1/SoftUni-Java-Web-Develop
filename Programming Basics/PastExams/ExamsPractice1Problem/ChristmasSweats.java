package ExamsPractice1;

import java.util.Scanner;

public class ChristmasSweats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BaklavaPrice = Double.parseDouble(scanner.nextLine());
        double MuffinsPrice = Double.parseDouble(scanner.nextLine());
        double ShtolensKG = Double.parseDouble(scanner.nextLine());
        double BonbonsKG = Double.parseDouble(scanner.nextLine());
        int BiscuitsKG = Integer.parseInt(scanner.nextLine());

        double ShtolenPrice = BaklavaPrice * 1.6;
        double TotalShtolenPrice = ShtolenPrice * ShtolensKG;
        double BonbonsPrice = MuffinsPrice * 1.8;
        double TotalBonbonsPrice = BonbonsPrice * BonbonsKG;
        double BiscuitsPrice = BiscuitsKG * 7.50;

        double TotalPrice = TotalBonbonsPrice + TotalShtolenPrice + BiscuitsPrice;

        System.out.printf("%.2f", TotalPrice);



    }
}
