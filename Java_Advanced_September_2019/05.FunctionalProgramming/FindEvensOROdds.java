package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOROdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int lowerNum = Integer.parseInt(input[0]);
        int upperNum = Integer.parseInt(input[1]);

        String filter = scanner.nextLine();

        IntPredicate condition = null;

        if (filter.equals("odd")) {
            condition = n -> n % 2 != 0;
        } else {
            condition = n -> n % 2 == 0;
        }
        IntStream.range(lowerNum, upperNum + 1)
                .filter(condition)
                .forEach(n -> System.out.print(n + " "));
    }
}
