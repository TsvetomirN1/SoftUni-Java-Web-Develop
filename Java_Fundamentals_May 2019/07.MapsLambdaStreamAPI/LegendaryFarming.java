package MapsLambdaStreamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> junk = new HashMap<>();
        Map<String, Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("fragments", 0);
        keyMaterials.put("shards", 0);
        keyMaterials.put("motes", 0);
        String command = scanner.nextLine();
        boolean isTrue = true;

        while (isTrue) {
            String[] tokens = command.split(" ");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (!keyMaterials.containsKey(material)) {
                        keyMaterials.put(material, quantity);
                        if (keyMaterials.get(material) >= 250) {
                            String name = "";
                            if (material.equals("shards")) {
                                name = "Shadowmourne";
                            } else if (material.equals("fragments")) {
                                name = "Valanyr";
                            } else {
                                name = "Dragonwrath";
                            }
                            System.out.printf("%s obtained!%n", name);
                            int newValue = keyMaterials.get(material) - 250;
                            keyMaterials.put(material, newValue);
                            isTrue = false;
                            break;
                        }
                    } else {
                        int currentValue = keyMaterials.get(material) + quantity;
                        keyMaterials.put(material, currentValue);
                        if (keyMaterials.get(material) >= 250) {
                            String name = "";
                            if (material.equals("shards")) {
                                name = "Shadowmourne";
                            } else if (material.equals("fragments")) {
                                name = "Valanyr";
                            } else {
                                name = "Dragonwrath";
                            }
                            System.out.printf("%s obtained!%n", name);
                            int newValue = keyMaterials.get(material) - 250;
                            keyMaterials.put(material, newValue);
                            isTrue = false;
                            break;
                        }
                    }
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentValue = junk.get(material) + quantity;
                        junk.put(material, currentValue);
                    }
                }

            }
            if (!isTrue) {
                continue;
            }
            command = scanner.nextLine();
        }
        keyMaterials.entrySet().stream().sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                }
        ).forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junk.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue())
        );
    }
}
