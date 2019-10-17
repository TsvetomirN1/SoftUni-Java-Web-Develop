package List_Arrays.ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> symbols = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            if (input.equals("merge")) {
                int startIndex = Math.max(0, Integer.parseInt(tokens[1]));
                int endIndex = Math.min(Integer.parseInt(tokens[2]), symbols.size() - 1);

                for (int i = startIndex; i < endIndex; i++) {
                    symbols.set(startIndex, symbols.get(startIndex) + symbols.get(startIndex + 1));
                    symbols.remove(startIndex + 1);
                }

            } else if (input.equals("divide")) {
                int indexToDivide = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);
                String currentString = symbols.get(indexToDivide);

                List<String> dividedStrings = new ArrayList<>();

                if (currentString.length() % partitions == 0) {

                    int partitionLength = currentString.length() / partitions;

                    int charIndex = 0;

                    for (int i = 0; i < partitions; i++) {

                        String concat = "";

                        for (int j = 0; j < partitionLength; j++) {

                            char symbol = currentString.charAt(charIndex);

                            concat += symbol;

                            charIndex++;

                        }
                        dividedStrings.add(concat);

                    }
                } else {
                    int partitionsLength = currentString.length() / partitions;

                    int charIndex = 0;

                    for (int i = 0; i < partitions; i++) {

                        String concat = "";

                        if (i == partitions - 1) {

                            for (int j = charIndex; j < currentString.length(); j++) {

                                char symbol = currentString.charAt(charIndex);
                                concat += symbol;
                                charIndex++;

                            }
                        } else {

                            for (int j = 0; j < partitionsLength; j++) {

                                char symbol = currentString.charAt(charIndex);

                                concat += symbol;

                                charIndex++;

                            }
                        }

                        dividedStrings.add(concat);

                    }

                }

                symbols.remove(indexToDivide);
                symbols.addAll(indexToDivide, dividedStrings);


            }
            input = scanner.nextLine();
        }

        for (String s : symbols) {

            System.out.print(s + " ");
        }

    }
}
