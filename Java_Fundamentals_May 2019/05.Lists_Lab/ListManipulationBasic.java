package List_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(numToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert, numToInsert);
                    break;
            }

        }
        for (int number:numbers) {
            System.out.print(number+" ");
        }

    }
}
