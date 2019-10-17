package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int i = 0; i < sequence.length(); i++) {
            char symbol = sequence.charAt(i);

            if (symbol == '{' || symbol == '[' || symbol == '(') {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()){
                    areBalanced=false;break;
                }
                char last = stack.pop();

                if (last == '{' && symbol != '}') {
                    areBalanced = false;
                    break;
                } else if (last == '[' && symbol != ']') {
                    areBalanced = false;
                    break;
                } else if (last == '(' && symbol != ')') {
                    areBalanced = false;
                    break;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
