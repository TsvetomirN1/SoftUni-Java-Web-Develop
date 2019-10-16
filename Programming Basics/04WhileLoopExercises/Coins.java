package WhileLoopExercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double coins = Math.floor(change * 100.0);
        int coinCounter = 0;

        while (coins != 0) {

            if (coins - 200 >= 0) {
                coins -= 200;

            } else if (coins - 100 >= 0) {
                coins -= 100;
            } else if (coins - 50 >= 0) {
                coins -= 50;
            } else if (coins - 20 >= 0) {
                coins -= 20;
            } else if (coins - 10 >= 0) {
                coins -= 10;
            } else if (coins - 5 >= 0) {
                coins -= 5;
            } else if (coins - 2 >= 0) {
                coins -= 2;
            } else if (coins - 1 >= 0) {
                coins -= 1;
            }


            coinCounter++;
        }
        System.out.println(coinCounter);


    }
}
