package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evens = Arrays.stream(scanner.nextLine().split(", "))
                .map(s -> Integer.parseInt(s))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<String> toPrint = evens.stream().map(n -> n.toString())
                .collect(Collectors.toList());

        String evenString = String.join(", ", toPrint);
        System.out.println(evenString);

        evens = evens.stream().sorted().collect(Collectors.toList());


        toPrint.clear();

        List<String> toPrint2 = evens.stream().map(n -> n.toString())
                .collect(Collectors.toList());


        evenString = String.join(", ", toPrint2);
        System.out.println(evenString);

    }
}
