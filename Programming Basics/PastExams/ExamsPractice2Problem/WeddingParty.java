package ExamsPractice2;

import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int kuvertPrice = guests * 20;

        if (kuvertPrice <= budget) {
            int moneyLeft = budget - kuvertPrice;
            int fireworks = (moneyLeft *40)/100;
            int donating = moneyLeft - fireworks;
            System.out.printf("Yes! %d lv are for fireworks and %d lv are for donation.", fireworks, donating);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", kuvertPrice - budget);
        }

    }
}
