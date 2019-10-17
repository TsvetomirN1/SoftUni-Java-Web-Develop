package ObjectExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String firstName = tokens[0];
            String secondName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);
            Student student = new Student(firstName, secondName, grade);
            students.add(student);

        }

        List<Student> sortedList = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade)
                        .reversed())
                .collect(Collectors.toList());

        for (Student s : sortedList) {
            System.out.println(s);
        }

    }

    static class Student {
        private String firstName;
        private String secondName;
        private double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.secondName = lastName;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public double getGrade() {
            return this.grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName, secondName, grade);
        }
    }
}


