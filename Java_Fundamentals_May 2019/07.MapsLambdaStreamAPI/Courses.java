package MapsLambdaStreamAPI;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> students = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("end")) {

            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            students.putIfAbsent(courseName, new ArrayList<>());
            students.get(courseName).add(studentName);


            input = scanner.nextLine();

        }

        students.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(s -> System.out.println(String.format("-- %s", s)));

                });
    }
}
