package MIDEXAMS.Exams_Practice;

import java.util.Scanner;

public class GiftBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sizeOfSide = Double.parseDouble(scanner.nextLine());
        int numberOfSheets = Integer.parseInt(scanner.nextLine());
        double areaOfSingleAreaCover = Double.parseDouble(scanner.nextLine());


        double areaOfGiftBox = sizeOfSide * sizeOfSide * 6;
        int quarterArea = 0;

        for (int i = 1; i <= numberOfSheets; i++) {
            if (i % 3 == 0) {
                quarterArea++;
            }
        }

        numberOfSheets -= quarterArea;

        double coveredArea = (numberOfSheets * areaOfSingleAreaCover) + (quarterArea * (areaOfSingleAreaCover * 0.25));
        double percentageCovered = (coveredArea / areaOfGiftBox) * 100;


        System.out.printf("You can cover %.2f%% of the box.", percentageCovered);


    }
}
