package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<Integer> bracketIndexes = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == ' ') {
                continue;
            }
            if (expression.charAt(i) == '(') {
                bracketIndexes.push(i);

            } else if (expression.charAt(i) == ')') {
                int opening = bracketIndexes.pop();

                String current = expression.substring(opening, i + 1);

                System.out.println(current);
            }

        }


    }
}
