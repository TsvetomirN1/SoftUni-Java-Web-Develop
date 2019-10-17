package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long factoriel = calcFactoriel(firstNum);
        long secondFactoriel = calcFactoriel(secondNum);

       double difference = factoriel/(secondFactoriel*1.00);
        System.out.printf("%.2f",difference);

    }
    static long calcFactoriel(int number){
        long factoriel = 1;
        for (int i = 2; i <= number; i++) {
            factoriel *= i;

        }
        return factoriel;
    }
}
