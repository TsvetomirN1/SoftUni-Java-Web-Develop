package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> upperCase = s -> Character.isUpperCase(s.charAt(0));
        Consumer<String> print = s -> System.out.println(s);

        List<String> upperCaseString = Arrays.stream(scanner.nextLine().split(" "))
                .filter(s -> upperCase.test(s))
                .collect(Collectors.toList());

        System.out.println(upperCaseString.size());
        upperCaseString.forEach(print);

    }
}
