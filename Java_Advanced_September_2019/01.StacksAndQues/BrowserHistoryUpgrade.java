package StacksAndQues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stackB = new ArrayDeque<>();
        ArrayDeque<String> stackFw = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stackB.size() > 1) {
                    String url = stackB.pop();
                    stackFw.push(url);
                    System.out.println(stackB.peek());

                } else {

                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {

                if (stackFw.isEmpty()) {
                    System.out.println("no next URLs");
                } else {

                    String url = stackFw.pop();
                    System.out.println(url);
                    stackB.push(url);
                }
            } else {
                stackFw.clear();
                stackB.push(input);
                System.out.println(stackB.peek());
            }

            input = scanner.nextLine();
        }
    }
}


