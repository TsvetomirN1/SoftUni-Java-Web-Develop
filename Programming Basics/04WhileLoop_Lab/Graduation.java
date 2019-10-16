package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = 0;
        double gradeSum = 0.0;

        while (count < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                count++;
                gradeSum += grade;

            }

        }
        System.out.printf("%s graduated. Average grade: %.2f", name, gradeSum / 12);
    }
}
