package SampleExam3103;

import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int singer = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int price = 0;
        int totalPeople = 0;
        double totalPrice = 0;


        while (!command.equals("The restaurant is full")) {
            int people = Integer.parseInt(command);

            if (people < 5) {
                price = people * 100;
                totalPeople += people;
                totalPrice += price;

            }
            if (people>=5) {
                price = people * 70;
                totalPeople += people;
                totalPrice += price;

            }

            command = scanner.nextLine();
        }
        if (totalPrice >= singer) {
            System.out.printf("You have %d guests and %.0f leva left.", totalPeople, totalPrice - singer);
        } else {
            System.out.printf("You have %d guests and %.0f leva income, but no singer.", totalPeople, totalPrice);
        }
    }
}
