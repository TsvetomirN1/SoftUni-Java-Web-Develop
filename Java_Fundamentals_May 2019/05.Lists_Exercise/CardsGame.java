package List_Arrays.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < playerOne.size(); i++) {

            if (playerOne.isEmpty() || playerTwo.isEmpty()) {
                break;
            } else {
                if (playerOne.get(i) > playerTwo.get(i)) {
                    playerOne.add(playerOne.get(i));
                    playerOne.add(playerTwo.get(i));
                    playerTwo.remove(i);
                    playerOne.remove(i);
                    i--;
                } else if (playerOne.get(i).equals(playerTwo.get(i))) {
                    playerTwo.remove(i);
                    playerOne.remove(i);
                    i--;
                } else {
                    playerTwo.add(playerTwo.get(i));
                    playerTwo.add(playerOne.get(i));
                    playerOne.remove(i);
                    playerTwo.remove(i);
                    i--;
                }
            }

        }
        if (playerOne.size() > 0) {
            for (Integer cards : playerOne) {
                sum += cards;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (playerTwo.size() > 0) {
            for (Integer cards : playerTwo) {
                sum += cards;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
