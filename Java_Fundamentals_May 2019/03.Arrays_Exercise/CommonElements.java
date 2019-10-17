package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        for (int index = 0; index < arrTwo.length; index++) {
            String currentElement = arrTwo[index];
            for (int i = 0; i < arrOne.length; i++) {
                String compareElement = arrOne[i];
                if (currentElement.equals(compareElement)) {
                    System.out.print(currentElement + " ");
                }

            }
        }
    }
}
