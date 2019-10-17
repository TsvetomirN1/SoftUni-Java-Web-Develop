package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();


        Function<List<Integer>, Integer> getMin = integers -> {
            int min = integers.get(0);
            for (int i = 1; i < integers.size(); i++) {
                if (integers.get(i) < min) {
                    min = integers.get(i);
                }
            }
            return min;
        };

        numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(getMin.apply(numbers));
    }
}
