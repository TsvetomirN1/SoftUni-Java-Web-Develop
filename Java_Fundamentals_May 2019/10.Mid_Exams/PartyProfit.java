package MIDEXAMS.Exams_Practice;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int companions = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double coins = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 10 == 0) {
                companions -= 2;
            }
            if (i % 15 == 0) {
                companions += 5;
            }
            coins += 50;
            coins -= (companions * 2);

            if (i % 3 == 0) {
                coins -= (companions * 3);
            }
            if (i % 5 == 0) {
                coins += (companions * 20);
                if (i % 3 == 0) {
                    coins -= (companions * 2);
                }
            }
        }
        double totalCoins = Math.floor(coins / companions);
        System.out.printf("%d companions received %d coins each.", companions, (int) totalCoins);
    }
}
