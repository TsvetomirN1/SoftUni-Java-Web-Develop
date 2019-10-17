package BasicsSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = lostGames / 2;
        int trashedMouse = lostGames / 3;
        int trashedKeyboards = lostGames / 6;
        int trashedDisplays = lostGames / 12;

        double headsetCost = trashedHeadset * headsetPrice;
        double mouseCost = trashedMouse * mousePrice;
        double keyboardCost = trashedKeyboards * keyboardPrice;
        double displayCost =  trashedDisplays * displayPrice;
        double gamesCost =  headsetCost + mouseCost+ keyboardCost+displayCost;
        System.out.printf("Rage expenses: %.2f lv.",gamesCost);




    }
}
