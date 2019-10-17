package Exam2104;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunaci = Integer.parseInt(scanner.nextLine());
        double flourCounter = 0;
        double sugarCounter = 0;
        double maxFlour = 0;
        double maxSugar = 0;

        for (int i = 0; i < kozunaci; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            flourCounter += flour;
            sugarCounter += sugar;
            if (flour > maxFlour) {
                maxFlour = flour;
            }
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
        }
        double sugarPakets = Math.ceil(sugarCounter / 950);
        double totalFlour = Math.ceil(flourCounter / 750);
        System.out.printf("Sugar: %.0f%n", sugarPakets);
        System.out.printf("Flour: %.0f%n", totalFlour);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.", maxFlour, maxSugar);
    }
}
