package List_Arrays.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];


            switch (command) {
                case "Add":
                    int number = Integer.parseInt(tokens[1]);
                    addNumber(numbers, number);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    insertNumber(numbers, numberToInsert, index);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    removeIndex(numbers, indexToRemove);
                    break;
                case "Shift":
                    String direction = tokens[1];
                    if (direction.equals("left")) {
                        int shiftsLeft = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < shiftsLeft; i++) {
                            int firstElement = numbers.remove(0);
                            numbers.add(firstElement);
                        }
                        break;

                    }
                    if (direction.equals("right")) {
                        int shiftsRight = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < shiftsRight; i++) {
                            int lastElement = numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastElement);
                        }
                        break;
                    }
            }

            line = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }


    private static void removeIndex(List<Integer> numbers, int index) {
        if (index < 0 || index > numbers.size()) {
            System.out.println("Invalid index");
        } else {
            numbers.remove(index);
        }
    }

    private static void insertNumber(List<Integer> numbers, int number, int index) {
        if (index < 0 || index > numbers.size()) {
            System.out.println("Invalid index");
        } else {
            numbers.add(index, number);

        }
    }

    private static void addNumber(List<Integer> numbers, int number) {
        if (!numbers.contains(number)) {
            numbers.add(number);
        }
    }
}



