package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> digits = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if (Character.isDigit(input[i].charAt(0))) {
                digits.push(Integer.parseInt(input[i]));
            } else if (input[i].charAt(0) == '+') {
                addOrSubstract(input[i + 1], digits, '+');
                i++;
            } else if (input[i].charAt(0) == '-') {
                addOrSubstract(input[i + 1], digits, '-');
                i++;
            }

        }
        System.out.println(digits.peek());
    }

    private static void addOrSubstract(String s, ArrayDeque<Integer> digits, char operation) {
        int left = digits.pop();
        int right = Integer.parseInt(s);
        int result = 0;

        if (operation == '+') {
            result = left + right;
        } else {
            result = left - right;
        }
        digits.push(result);

    }
}
