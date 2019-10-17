package MIDEXAMS.MidExam2March;

import java.util.*;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        int energy = 100;
        int coins = 100;
        String element = "";
        for (int i = 0; i < input.length; i++) {
            element = input[i];
        }
        String[] tokens = element.split("-");
        String event = tokens[0];
        int number = Integer.parseInt(tokens[1]);

        switch (tokens[0]) {
            case "rest":
                int addEnergy = Integer.parseInt(tokens[1]);
                if (energy + addEnergy < 100) {
                    energy += addEnergy;
                    System.out.println(String.format("You gained %d energy.", addEnergy));
                } else {
                    int energyToAdd = 100 - energy;
                    energy += energyToAdd;
                    System.out.println(String.format("You gained %d energy.", energyToAdd));
                }
                System.out.println(String.format("Current energy: %d.", energy));
                break;
            case "order":
                if (energy >= 30) {
                    coins += Integer.parseInt(tokens[1]);
                    energy -= 30;
                    System.out.println(String.format("You earned %s coins.", tokens[1]));
                } else {
                    energy += 50;
                    System.out.println("You had to rest!");
                }
                break;
            default:
                if (coins - Integer.parseInt(tokens[1]) > 0) {
                    coins -= Integer.parseInt(tokens[1]);
                    System.out.println(String.format("You bought %s.", tokens[0]));
                } else {
                    System.out.println(String.format("Closed! Cannot afford %s.", tokens[0]));
                    return;
                }
                break;
        }
        System.out.println("Day completed!");
        System.out.println(String.format("Coins: %d", coins));
        System.out.println(String.format("Energy: %d", energy));
    }
}
