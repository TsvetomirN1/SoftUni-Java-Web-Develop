package List_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        int index = 0;
        while (index < numbers.size() - 1) {

            double curr = numbers.get(index);
            double next = numbers.get(index + 1);
            if (curr == next) {
                double sum = curr + next;
                numbers.set(index, sum);
                numbers.remove(index + 1);
                index = 0;
            } else {
                index++;
            }
        }
        for (double number : numbers) {
            System.out.print( number + " ");

        }

    }
}
