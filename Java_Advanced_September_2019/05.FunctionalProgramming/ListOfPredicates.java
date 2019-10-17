package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        BiPredicate<int[], Integer> anyMatch = (divisors, number) -> {
            for (int divisor : divisors) {
                if (number % divisor != 0) {
                    return false;
                }
            }
            return true;
        };
        int n = Integer.parseInt(scanner.nextLine());
        int[] divisors = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .distinct()
                .toArray();

        for (int i = 1; i <= n; i++) {
            if (anyMatch.test(divisors, i)) {
                numbers.add(i);
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
