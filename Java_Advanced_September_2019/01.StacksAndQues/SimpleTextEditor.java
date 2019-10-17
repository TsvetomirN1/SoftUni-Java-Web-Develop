package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operations = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (operations-- > 0) {

            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            if (command.equals("4")) {
                if (!stack.isEmpty()) {
                    stringBuilder.delete(0, stringBuilder.length()).append(stack.pop());
                }

            } else {
                String text = tokens[1];

                if (command.equals("1")) {
                    stack.push(stringBuilder.toString());
                    stringBuilder.append(text);

                } else if (command.equals("2")) {
                    int count = Integer.parseInt(text);
                    if (stringBuilder.length() >= count) {
                        stack.push(stringBuilder.toString());
                        stringBuilder.replace(stringBuilder.length() - count,
                                stringBuilder.length() + 1, "");
                    }

                } else if (command.equals("3")) {

                    int index = Integer.parseInt(text) - 1;
                    if (index >= 0) {

                        System.out.println(stringBuilder.charAt(index));
                    }
                }
            }
        }
    }
}

