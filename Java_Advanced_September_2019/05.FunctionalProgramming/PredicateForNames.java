package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int length = Integer.parseInt(scanner.nextLine());

        Predicate<String> validation = str-> str.length() <= length;
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(validation)
                .forEach(System.out::println);
    }
}
