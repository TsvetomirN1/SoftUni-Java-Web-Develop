package MIDEXAMS.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Switch":
                    int index = Integer.parseInt(tokens[1]);

                    if (index >= 0 && index <= numbers.size()) {
                        int newValue = numbers.get(index) * (-1);
                        numbers.set(index, newValue);
                    }

                    break;

                case "Change":
                    int indexToChange = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);

                    if (indexToChange >= 0 && indexToChange <= numbers.size()) {
                        numbers.set(indexToChange, value);
                    }

                    break;

                case "Sum":
                    switch (tokens[1]) {
                        case "Negative":
                            int sumNegative = 0;
                            for (Integer number : numbers) {
                                if (number < 0) {
                                    sumNegative += number;
                                }
                            }

                            System.out.println(sumNegative);
                            break;

                        case "Positive":
                            int sumPositive = 0;
                            for (Integer number : numbers) {
                                if (number >= 0) {
                                    sumPositive += number;
                                }
                            }

                            System.out.println(sumPositive);
                            break;

                        case "All":
                            int sum = 0;
                            for (Integer number : numbers) {
                                sum += number;
                            }
                            System.out.println(sum);
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            if (number >= 0) {
                System.out.print(number + " ");
            }
        }
    }

}