package MIDEXAMS.Exams_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        int droppedCount = 0;
        int inCompletedCount = 0;
        int completedCount = 0;

        while (!input[0].equals("End")) {

            switch (input[0]) {
                case "Complete":
                    int indexToComplete = Integer.parseInt(input[1]);

                    if (indexToComplete >= 0 && indexToComplete < numbers.size()) {
                        numbers.set(indexToComplete, 0);
                    }
                    break;
                case "Change":
                    int indexToChange = Integer.parseInt(input[1]);
                    int time = Integer.parseInt(input[2]);
                    if (indexToChange >= 0 && indexToChange < numbers.size()) {
                        numbers.set(indexToChange, time);
                    }
                    break;
                case "Drop":
                    int indexToDrop = Integer.parseInt(input[1]);
                    if (indexToDrop >= 0 && indexToDrop <= numbers.size()) {
                        numbers.set(indexToDrop, -1);
                    }

                    break;
                case "Count":
                    if (input[1].equals("Completed")) {

                        for (Integer number1 : numbers) {
                            if (number1 == 0) {
                                completedCount++;
                            }
                        }
                        System.out.println(completedCount);
                    } else if (input[1].equals("Incomplete")) {

                        for (Integer number1 : numbers) {
                            if (number1 != 0 && number1 > 0) {
                                inCompletedCount++;
                            }
                        }
                        System.out.println(inCompletedCount);
                    } else if (input[1].equals("Dropped")) {

                        for (Integer number : numbers) {
                            if (number < 0) {
                                droppedCount++;
                            }
                        }
                        System.out.println(droppedCount);
                        break;
                    }
            }

            input = scanner.nextLine().split(" ");
        }
        for (Integer number : numbers) {
            if (number > 0) {
                System.out.print(number + " ");
            }
        }
    }
}



