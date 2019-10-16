package NestedLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());

        for (int floor = floorCount; floor > 0; floor--) {

            for (int room = 0; room < roomsCount; room++) {
                if (floor == floorCount) {
                    System.out.printf("%s%d%d ", "L", floor, room);
                } else if (floor % 2 != 0) {
                    System.out.printf("%s%d%d ", "A", floor, room);
                } else {
                    System.out.printf("%s%d%d ", "O", floor, room);

                }

            }
            System.out.println();
        }
    }
}
