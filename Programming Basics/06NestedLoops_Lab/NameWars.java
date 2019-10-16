package NestedLoops;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int winnerScore = 0;
        String winnerName = "";
        while (!name.equals("STOP")) {
            int tempSum = 0;

            for (int i = 0; i < name.length(); i++) {
                char currentChar = name.charAt(i);
                int score = currentChar;
                tempSum += score;
            }
            if (tempSum > winnerScore) {
                winnerScore = tempSum;
                winnerName = name;
            }

            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", winnerName, winnerScore);
    }
}
