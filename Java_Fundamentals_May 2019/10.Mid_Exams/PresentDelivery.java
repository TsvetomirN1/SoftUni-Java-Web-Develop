package MIDEXAMS.MidExam18Dec2018;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] jumps = scanner.nextLine().split(" ");
        int position = 0;
        boolean fail = false;
        while (!jumps[0].equals("Merry")) {
            int length = Integer.parseInt(jumps[1]);
            if (position + length <= houses.size() - 1) {
                position += length;
                if (houses.get(position) >= 2) {
                    houses.set(position, houses.get(position) - 2);
                } else {
                    houses.set(position, 0);
                    System.out.printf("House %d will have a Merry Christmas.%n", position);
                }
            } else {
                position += length;
                while (position > houses.size() - 1) {
                    position -= houses.size();
                }
                if (houses.get(position) >= 2) {
                    houses.set(position, houses.get(position) - 2);
                } else {
                    houses.set(position, 0);
                    System.out.printf("House %d will have a Merry Christmas.%n", position);
                }
            }
            jumps = scanner.nextLine().split(" ");
        }
        int failCount = 0;
        for (int house : houses) {
            if (house != 0) {
                failCount++;
                fail = true;
            }
        }
        System.out.printf("Santa's last position was %d.%n", position);
        if (fail) {
            System.out.printf("Santa has failed %d houses.", failCount);
        }else {
            System.out.println("Mission was successful.");
        }
    }
}