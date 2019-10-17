package List_Arrays.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        int[] specialNumbers = Arrays
                .stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        int specialNum = specialNumbers[0];
        int power = specialNumbers[1];

        while (numbers.contains(specialNum)) {
            int elementIndex = numbers.indexOf(specialNum);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, numbers.size() - 1);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());

    }
}
