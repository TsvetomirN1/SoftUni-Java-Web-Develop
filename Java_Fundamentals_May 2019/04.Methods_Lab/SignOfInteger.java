package Methods_Exercise.Methods_Lab;

import java.util.Scanner;

public class SignOfInteger {
    static void printSign(int number) {
        String signType;
        if (number > 0) {
            signType = "positive";
        } else if (number < 0) {
            signType = "negative";
        } else {
            signType = "zero";
        }
        System.out.printf("The number %d is %s.", number, signType);

    }

    public static void main(String[] args) {
        printSign(new Scanner(System.in).nextInt());



    }
}
