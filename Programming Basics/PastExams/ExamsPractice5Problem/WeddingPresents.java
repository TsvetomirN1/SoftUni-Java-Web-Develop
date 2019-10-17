package ExamsPractice5;

import java.util.Scanner;

public class WeddingPresents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double presents = Integer.parseInt(scanner.nextLine());
        double aPresentCounter = 0;
        double bPresentCounter = 0;
        double vPresentCounter = 0;
        double gPresentCounter = 0;


        for (int i = 0; i < presents; i++) {

            String category = scanner.nextLine();

            if (category.equals("A")) {
                aPresentCounter++;
            } else if (category.equals("B")) {
                bPresentCounter++;
            } else if (category.equals("V")) {
                vPresentCounter++;
            } else if (category.equals("G")) {
                gPresentCounter++;
            }
        }
        double aPresentsPercentage = (aPresentCounter / presents) * 100;
        double bPresentsPercentage = (bPresentCounter / presents) * 100;
        double vPresentsPercentage = (vPresentCounter/presents) * 100;
        double gPresentsPercentage = (gPresentCounter / presents) * 100;
        double totalPercentage = (presents / guests) * 100;

        System.out.printf("%.2f%%%n", aPresentsPercentage);
        System.out.printf("%.2f%%%n", bPresentsPercentage);
        System.out.printf("%.2f%%%n", vPresentsPercentage);
        System.out.printf("%.2f%%%n", gPresentsPercentage);
        System.out.printf("%.2f%%%n", totalPercentage);
    }
}
