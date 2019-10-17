package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input[0]; i++) {
            stack.push(input2[i]);
        }

        for (int i = 0; i < input[1]; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (stack.contains(input[2])) {
            System.out.println("true");
        } else {
            stack.stream().sorted((f, s) -> f - s).limit(1).forEach(System.out::println);
        }
    }


}



