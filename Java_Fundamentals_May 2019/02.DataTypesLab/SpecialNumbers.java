package DataTypesExercise.DataTypesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        int num = 0;
        boolean isSpecialNum = false;
        for (int i = 1; i <= n; i++) {
            num = i;

            while (i > 0) {
                sumOfDigits += i % 10;
                i = i / 10;

            }
            if (isSpecialNum = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11)) {

                System.out.printf("%d -> True%n", num);
            }else{
                System.out.printf("%d -> False%n", num);
            }
            sumOfDigits = 0;
            i = num;
        }
    }
}
