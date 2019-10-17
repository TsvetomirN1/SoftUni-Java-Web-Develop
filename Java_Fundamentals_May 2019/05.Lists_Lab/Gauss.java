package List_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gauss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> modified = new ArrayList<>();

        for (int i = 0; i < numbers.size() / 2; i++) {
            int lastIndex = numbers.size() - 1;
            int sum = numbers.get(i) + numbers.get(lastIndex - i);
            modified.add(sum);

        }
        if (numbers.size() % 2 != 0) {
            int middleIndex = numbers.size() / 2;
            modified.add(numbers.get(middleIndex));

        }
        numbers = modified;

        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }
}




