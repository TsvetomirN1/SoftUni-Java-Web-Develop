package ExamsPractice6;

import java.util.Scanner;

public class ChristmasDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int sumItem = 0;
        int remainBudget = budget;

        while (!(input.equals("Stop"))) {
            for(int i = 0; i < input.length(); i++) {
                int ascii = input.charAt(i);
                sumItem += ascii;
            }
            if(sumItem <= remainBudget) {
                System.out.println("Item successfully purchased!");
                remainBudget -= sumItem;
                sumItem = 0;
                input = scanner.nextLine();
                continue;
            } else {
                System.out.println("Not enough money!");
                break;
            }
        }
        if (input.equals("Stop")) {
            System.out.println("Money left: " + remainBudget);
        }

    }
}