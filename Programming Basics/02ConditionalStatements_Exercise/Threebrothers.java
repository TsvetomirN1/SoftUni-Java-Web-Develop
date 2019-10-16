package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Threebrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double BrotherOne = Double.parseDouble(scanner.nextLine());
        double BrotherTwo = Double.parseDouble(scanner.nextLine());
        double BrotherThree = Double.parseDouble(scanner.nextLine());
        double timeForFishing = Double.parseDouble(scanner.nextLine());

        double timeNeededForBrotherOne = 1/BrotherOne;
        double timeNeededForBrotherTwo = 1/BrotherTwo;
        double timeNeededForBrotherThree = 1/BrotherThree;

        double totalTimeNeededInHoursForBrothers = timeNeededForBrotherOne +
                timeNeededForBrotherTwo +timeNeededForBrotherThree;

        double TotalTimeNeeded = 1/totalTimeNeededInHoursForBrothers;
        double totalTimeWithBreak = TotalTimeNeeded*1.15;
        double difference = Math.abs(totalTimeWithBreak - timeForFishing);

        System.out.printf("Cleaning time: %.2f%n", totalTimeWithBreak);
        if (timeForFishing>=totalTimeWithBreak){
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(difference) );
        }else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(difference) );
        }




    }
}
