package FinalExamTests;

import java.util.*;

public class WayToAnnapurna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> storeAndItems = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("END")) {

            String[] tokens = line.split("->");
            String type = tokens[0];


            switch (type) {

                case "Add": {
                    String store = tokens[1];
                    String[] items = tokens[2].split(",");
                    storeAndItems.putIfAbsent(store, new ArrayList<>());
                    for (int i = 0; i < items.length; i++) {
                        storeAndItems.get(store).add(items[i]);
                    }
                    break;
                }
                case "Remove":
                    String store = tokens[1];
                    if (storeAndItems.containsKey(store)) {
                        storeAndItems.get(store).clear();
                        storeAndItems.remove(store);
                    }

                    break;
            }

            line = scanner.nextLine();
        }
        System.out.println("Stores list:");
        storeAndItems.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().size() - f.getValue().size();
            if (result == 0) {
                result = s.getKey().compareTo(f.getKey());
            }
            return result;

        }).forEach(e -> {
            System.out.printf("%s\n", e.getKey());
            e.getValue().forEach(p -> System.out.printf("<<%s>>\n", p));
        });

    }
}
