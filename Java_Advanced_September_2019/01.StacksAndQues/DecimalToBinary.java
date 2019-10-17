package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (number == 0) {
            System.out.println(0);
            return;
        }

        while (number > 0) {
            int leftover = number % 2;
            stack.push(leftover);

            number = number / 2;
        }
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
