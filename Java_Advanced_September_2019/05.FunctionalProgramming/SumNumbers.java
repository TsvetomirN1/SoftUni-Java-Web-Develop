package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Function<String, Integer> parseInt = str -> Integer.parseInt(str);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(parseInt)
                .collect(Collectors.toList());


        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + numbers.stream().mapToInt(n -> n).sum());
    }


}
