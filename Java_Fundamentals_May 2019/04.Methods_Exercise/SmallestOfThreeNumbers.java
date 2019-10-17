package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int min = getMin(getMin(firstNum, secondNum), thirdNum);
        print(min);

    }

    static void print(int number) {
        System.out.println(number);
    }

    public static int getMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}

