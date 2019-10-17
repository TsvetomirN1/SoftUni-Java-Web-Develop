package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        while (inputs[0]-- > 0) {
            int num = Integer.parseInt(scanner.nextLine());
            firstSet.add(num);

        }

        while (inputs[1]-- > 0) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSet.add(num);
        }

        for (Integer integer : firstSet) {
            if (secondSet.contains(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
