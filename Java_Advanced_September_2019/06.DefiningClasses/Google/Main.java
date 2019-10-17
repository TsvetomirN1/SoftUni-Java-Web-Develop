package DefiningClasses.Google;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Map<String, Person> personMap = new LinkedHashMap<>();

        while (!"End".equals(input = scanner.nextLine())) {
            List<String> data = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());
            String name = data.get(0);
            personMap.putIfAbsent(name, new Person(name));

            if (data.contains("company")) {
                String companyName = data.get(2);
                String department = data.get(3);
                double salary = Double.parseDouble(data.get(4));
                Company company = new Company();
                company.setName(companyName);
                company.setDepartment(department);
                company.setSalary(salary);

                personMap.get(name).setCompany(company);

            } else if (data.contains("pokemon")) {
                String pokemonName = data.get(2);
                String type = data.get(3);

                personMap.get(name).addPokemon(new Pokemon(pokemonName, type));

            } else if (data.contains("parents")) {
                String parentName = data.get(2);
                String birthday = data.get(3);

                personMap.get(name).addParent(new Parent(parentName, birthday));

            } else if (data.contains("children")) {
                String childName = data.get(2);
                String birthday = data.get(3);

                personMap.get(name).addChild(new Child(childName, birthday));

            } else if (data.contains("car")) {
                String model = data.get(2);
                int speed = Integer.parseInt(data.get(3));
                Car car = new Car();
                car.setModel(model);
                car.setSpeed(speed);

                personMap.get(name).setCar(car);
            }

        }

        String name = scanner.nextLine();

        if (personMap.containsKey(name)) {
            String s = personMap.get(name).toString();
            System.out.println(s);
        }
    }
}
