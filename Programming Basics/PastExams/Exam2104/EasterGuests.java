package Exam2104;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double kozunaciNum = Math.ceil(guests / 3);
        double eggsNum = guests * 2;
        double kozunaciPrice = 4 * kozunaciNum;
        double eggsPrice = eggsNum * 0.45;
        double totalPrice = eggsPrice + kozunaciPrice;

        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", kozunaciNum, eggsNum);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }
    }
}
