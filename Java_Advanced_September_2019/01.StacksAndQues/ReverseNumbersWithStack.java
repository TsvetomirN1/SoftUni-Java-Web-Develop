package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(Integer.parseInt(input[i]));

        }
        while (!numbers.isEmpty()) {
            int reversed = numbers.pop();
            System.out.print(reversed + " ");
        }

    }
}

