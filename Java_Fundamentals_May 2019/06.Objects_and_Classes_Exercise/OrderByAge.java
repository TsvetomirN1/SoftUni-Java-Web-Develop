package ObjectExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person {
        String name;
        String id;
        int age;

        Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;

        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    this.name, this.id, this.age);
        }

        public int getAge() {
            return this.age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person p = new Person(name, id, age);

            people.add(p);

            input = scanner.nextLine();
        }

        people.sort((f, s) -> f.getAge() - s.getAge());

        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}

