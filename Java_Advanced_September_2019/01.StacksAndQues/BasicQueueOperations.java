package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < input[0]; i++) {
            queue.offer(input2[i]);
        }

        for (int i = 0; i < input[1]; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (queue.contains(input[2])) {
            System.out.println("true");
        } else {
            queue.stream().sorted((f, s) -> f - s).limit(1).forEach(System.out::println);
        }
    }


}

