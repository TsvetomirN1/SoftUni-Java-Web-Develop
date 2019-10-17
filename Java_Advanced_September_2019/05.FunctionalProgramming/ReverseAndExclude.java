package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        int n = Integer.parseInt(scanner.nextLine());
        BiFunction<ArrayList<Integer>, Integer, ArrayList<Integer>> reverseAndExclude = ((arr, num) -> {
            Collections.reverse(arr);
            return arr.stream()
                    .filter(el -> el % num != 0)
                    .collect(Collectors.toCollection(ArrayList::new));
        });

        reverseAndExclude.apply(number, n).forEach(el -> System.out.print(el + " "));
    }
}
