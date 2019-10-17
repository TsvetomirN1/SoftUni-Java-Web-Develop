package MapsLambdaStreamAPI;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new TreeMap<>();

        String input = "";

        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {

            String[] data = input.split(" -> ");

            String company = data[0];
            String id = data[1];

            companies.putIfAbsent(company, new ArrayList<>());

            if (!companies.get(company).contains(id)) {

                companies.get(company).add(id);

            }

        }

        companies.entrySet().stream().forEach(key -> {
            System.out.printf("%s%n", key.getKey());

            key.getValue().forEach(e -> System.out.println("-- " + e));
        });
    }
}
