package DataTypesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int capacity = scanner.nextInt();

        int fullCourses = people / capacity;
        if (people % capacity != 0) {
            fullCourses++;
        }
        System.out.println(fullCourses);
    }
}
