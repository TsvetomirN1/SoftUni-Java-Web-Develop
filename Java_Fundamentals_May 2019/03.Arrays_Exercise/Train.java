package Arrays_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            wagons[i] = number;

        }
        int sum = 0;
        for (int index = 0; index < wagons.length; index++) {
            int people = wagons[index];

            sum += people;
            System.out.print(people + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
