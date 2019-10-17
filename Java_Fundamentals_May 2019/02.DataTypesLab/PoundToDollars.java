package DataTypesExercise.DataTypesLab;

import java.util.Scanner;

public class PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        double inputInCents = input/ 100.0;
        double dollarsInCents = inputInCents*1.31;
        double dollars = dollarsInCents*100;
        System.out.printf("%.3f",dollars);



    }
}
