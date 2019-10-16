package ForLoopExercices;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double evenSum = 0;

        double MAXIMUM = 1000000000.0;
        double MINIMUM = -1000000000.0;

        double oddMin = MAXIMUM;
        double oddMax = MINIMUM;

        double evenMin = MAXIMUM;
        double evenMax = MINIMUM;

        for (int position = 1; position <= n; position++) {

            double number = Double.parseDouble(scanner.nextLine());

            if (position % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;

                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }

        }

        boolean hasEvenCategoryChanged = !(evenMin == MAXIMUM && evenMax == MINIMUM);
        boolean hasOddCategoryChanged = !(oddMin == MAXIMUM && oddMax == MINIMUM);

        System.out.printf("OddSum=%.2f,%n", oddSum);
        System.out.println(hasOddCategoryChanged ? String.format("OddMin=%.2f,", oddMin) : "OddMin=No,");
        System.out.println(hasOddCategoryChanged ? String.format("OddMax=%.2f,", oddMax) : "OddMax=No,");
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        System.out.println(hasEvenCategoryChanged ? String.format("EvenMin=%.2f,", evenMin) : "EvenMin=No,");
        System.out.println(hasEvenCategoryChanged ? String.format("EvenMax=%.2f", evenMax) : "EvenMax=No");
    }
}
