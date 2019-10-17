package FinalExamTests;

import java.util.*;

public class PracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> racers = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("->");
            String type = tokens[0];
            switch (type) {
                case "Add": {
                    String road = tokens[1];
                    String racer = tokens[2];
                    if (!racers.containsKey(road)) {
                        racers.put(road, new ArrayList<>());
                        racers.get(road).add(racer);
                    } else {
                        racers.get(road).add(racer);
                    }
                    break;
                }
                case "Move": {
                    String currentRoad = tokens[1];
                    String racer = tokens[2];
                    String nextRoad = tokens[3];

                    if (racers.get(currentRoad).contains(racer)) {
                        racers.get(currentRoad).remove(racer);
                        racers.get(nextRoad).add(racer);
                    }
                    break;
                }
                case "Close": {
                    String road = tokens[1];
                    if (racers.containsKey(road)) {
                        racers.get(road).clear();
                        racers.remove(road);
                    }
                    break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Practice sessions:");
        racers.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().size() - f.getValue().size();
            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(e -> {
            System.out.printf("%s%n", e.getKey());
            e.getValue().stream().forEach(e1 -> System.out.printf("++%s%n", e1));
        });
    }
}
