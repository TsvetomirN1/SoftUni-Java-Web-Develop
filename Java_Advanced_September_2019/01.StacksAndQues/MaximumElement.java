package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int command = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < command; i++) {
            String[] nCommands = scanner.nextLine().split(" ");

                if (nCommands[0].equals("1")) {
                    int number = Integer.parseInt(nCommands[1]);
                    stack.push(number);

                } else if (nCommands[0].equals("2")) {
                    stack.pop();

                } else if (nCommands[0].equals("3")) {
                        int maxArray = Collections.max(stack);
                        System.out.println(maxArray);
                    }

                }
            }
        }





