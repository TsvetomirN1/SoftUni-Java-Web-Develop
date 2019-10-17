package FinalExamTests;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FeedAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, Integer> animals = new LinkedHashMap<>();
        Map<String, Integer> areas = new LinkedHashMap<>();

        while (!line.equals("Last Info")) {

            String[] tokens = line.split(":");

            String name = tokens[1];
            int food = Integer.parseInt(tokens[2]);
            String area = tokens[3];

            if (tokens[0].equals("Add")) {
                if (!animals.containsKey(name)) {
                    animals.put(name, food);
                    if (!areas.containsKey(area)){
                        areas.put(area,1);
                    }else {
                        areas.put(area,areas.get(area)+1);
                    }
                } else {
                    int newFoodValue = animals.get(name) + food;
                    animals.put(name, newFoodValue);
                }


            } else {
                if (animals.containsKey(name)) {
                    int newFood = animals.get(name) - food;
                    if (newFood <= 0) {
                        animals.remove(name);
                        System.out.println(name + " was successfully fed");

                        areas.put(area,areas.get(area)-1);

                    } else {
                        animals.put(name, newFood);
                    }
                }
            }

            line = scanner.nextLine();
        }
        System.out.println("Animals:");

        animals.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().compareTo(f.getValue());

            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }

            return result;

        }).forEach(entry -> {
            System.out.printf("%s -> %dg%n", entry.getKey(), entry.getValue());
        });
        System.out.println("Areas with hungry animals:");

        areas.entrySet().stream()
                .filter(e -> e.getValue()>0)
                .sorted((f,s)-> s.getValue().compareTo(f.getValue()))
                .forEach(entry ->{
                    System.out.printf("%s : %d%n ",entry.getKey(),entry.getValue());
                });
    }
}
