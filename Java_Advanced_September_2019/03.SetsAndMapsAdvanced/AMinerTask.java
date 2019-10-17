package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Long> resources = new LinkedHashMap<>();

        String line;
        while (!"stop".equals(line = scanner.nextLine())) {
            long amount = Long.parseLong(scanner.nextLine());

            resources.putIfAbsent(line, 0L);
            long updatedCount = resources.get(line) + amount;
            resources.put(line, updatedCount);
        }

        for (Map.Entry<String, Long> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }


}

