package SampleExam3103;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int stops = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= stops; i++) {

            people -= Integer.parseInt(scanner.nextLine());
            people += Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                people += 2;

            } else
                people -= 2;
        }

        System.out.printf("The final number of passengers is : %d", people);
    }
}

