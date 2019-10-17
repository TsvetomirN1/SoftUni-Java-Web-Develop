package MIDEXAMS.MidExam16April;

import java.util.Scanner;

public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double flourPricePerKg = Double.parseDouble(scanner.nextLine());

        double eggsPack = flourPricePerKg * 0.75;
        double milkPrice = (flourPricePerKg * 1.25) / 4;

        double cozonacPrice = flourPricePerKg + eggsPack + milkPrice;

        int cozonacCount = 0;
        int coloredEggs = 0;


        while (budget > 0) {

            if (budget <= cozonacPrice) {
                break;
            }

            budget -= cozonacPrice;
            cozonacCount++;
            coloredEggs += 3;

            if (cozonacCount % 3 == 0) {
                int eggsLose = cozonacCount-2;
                coloredEggs-= eggsLose;
            }
        }


        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",
                cozonacCount, coloredEggs, budget);
    }
}
