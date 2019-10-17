package ExamsPractice5;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int peopleCounter = 0;

        for (int i = 0; i < groups; i++) {

            int people = Integer.parseInt(scanner.nextLine());


            if (people <= 5) {
                peopleCounter += people;
                musala += people;

            } else if (people >=6 && people <= 12) {
                peopleCounter += people;
                monblan += people;
            } else if (people >= 13 && people <= 25) {
                peopleCounter += people;
                kilimanjaro += people;
            } else if (people >= 26 && people <= 40) {
                peopleCounter += people;
                k2 += people;
            } else if (people >= 41) {
                peopleCounter += people;
                everest += people;
            }


        }
        double totalPeople = musala + monblan + kilimanjaro + k2 + everest;

        double musalaPercentage = musala / totalPeople * 100;
        double monblanPercentage = monblan / totalPeople * 100;
        double kilimanjaroPercentage = kilimanjaro / totalPeople * 100;
        double k2Percentage = k2 / totalPeople * 100;
        double everestPercentage = everest / totalPeople * 100;

        System.out.printf("%.2f%%%n", musalaPercentage);
        System.out.printf("%.2f%%%n", monblanPercentage);
        System.out.printf("%.2f%%%n", kilimanjaroPercentage);
        System.out.printf("%.2f%%%n", k2Percentage);
        System.out.printf("%.2f%%", everestPercentage);
    }
}
