package MIDEXAMS.MidExam4nov2018;

import java.util.Scanner;

public class DungeonedDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int coins = 0;

        String[] dungeonRooms = scanner.nextLine().split("\\|");
        for (int i = 0; i <dungeonRooms.length ; i++) {
            String[] tokens = dungeonRooms[i].split(" ");
            String itemOrMonster = tokens[0];


            int number = Integer.parseInt(tokens[1]);

            switch (tokens[0]) {

                case "potion":
                    int addHealth = Integer.parseInt(tokens[1]);
                    if (health + addHealth > 100) {
                        addHealth =100-health;
                        health=100;
                        System.out.println(String.format("You healed for %d hp.", addHealth));
                        System.out.println(String.format("Current health: %d hp.", health));
                    } else {
                        health+= addHealth;
                        System.out.println(String.format("You healed for %d hp.", addHealth));
                        System.out.println(String.format("Current health: %d hp.", health));
                    }
                    break;
                case "chest":
                    int coinsFound = Integer.parseInt(tokens[1]);
                    coins+=coinsFound;
                    System.out.println(String.format("You found %d coins.", coinsFound));
                    break;
                default:
                    String monster = tokens[0];
                    int attackOfMonster = Integer.parseInt(tokens[1]);
                    health -= attackOfMonster;
                    if (health > 0) {
                        System.out.println(String.format("You slayed %s.", monster));
                    } else {
                        System.out.println(String.format("You died! Killed by %s.", monster));
                        System.out.println(String.format("Best room: %s", i+1));
                        return;
                    }

                    break;

            }
        }
        System.out.println("You've made it!");
        System.out.println(String.format("Coins: %d", coins));
        System.out.println(String.format("Health: %d", health));


    }
}
