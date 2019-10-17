package ExamsPractice5;

import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityCounter = 0;
        double waterCounter = 0;
        double internetCounter = 0;
        double othersCounter = 0;

        for (int i = 0; i < months; i++) {

            double electricity = Double.parseDouble(scanner.nextLine());

            electricityCounter += electricity;
            waterCounter = months*20;
            internetCounter = months*15;
            othersCounter+=(electricity +20+15)*1.2;
        }
        double averageMonthly = (electricityCounter+waterCounter+internetCounter+othersCounter)/months;

        System.out.printf("Electricity: %.2f lv%n",electricityCounter);
        System.out.printf("Water: %.2f lv%n",waterCounter);
        System.out.printf("Internet: %.2f lv%n",internetCounter);
        System.out.printf("Other: %.2f lv%n",othersCounter);
        System.out.printf("Average: %.2f lv",averageMonthly);

    }
}
