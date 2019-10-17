package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.equals("print")){
                numbers.forEach(e-> System.out.print(e + " "));
                System.out.println();
            }else {
                numbers = operations(command,numbers);
            }

            command = scanner.nextLine();

        }

    }

    public static List<Integer> operations(String command, List<Integer> numbers) {

        Function<List<Integer>, List<Integer>> function = list -> {

            for (int i = 0; i < list.size(); i++) {
                if (command.equals("add")) {
                    list.set(i, list.get(i) + 1);

                } else if (command.equals("multiply")) {
                    list.set(i, list.get(i) * 2);
                } else if (command.equals("subtract")) {
                    list.set(i, list.get(i) - 1);
                }
            }
            return list;
        };
        return function.apply(numbers);
    }
}
