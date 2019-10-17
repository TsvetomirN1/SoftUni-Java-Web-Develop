package ExamsPractice5;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double between5and6 = 0;
        double between4and499 = 0;
        double between3and399 = 0;
        double fail = 0;

        double gradesCounter = 0;
        double evaluationSum = 0;


        while (students > 0) {
            double evaluation = Double.parseDouble(scanner.nextLine());

            if (evaluation < 3) {
                fail++;
                evaluationSum += evaluation;

            } else if (evaluation >= 3 && evaluation <= 3.99) {
                between3and399++;
                evaluationSum += evaluation;

            } else if (evaluation >= 4 && evaluation <= 4.99) {
                between4and499++;
                evaluationSum += evaluation;

            } else if (evaluation >= 5) {
                between5and6++;
                evaluationSum += evaluation;
            }

        }
        double averageGrade = evaluationSum / students;
        double topPercentage = between5and6 * 100 / students;
        double between4and5 = between4and499 * 100 / students;
        double between3and4 = between3and399 * 100 / students;
        double failPercentage = fail * 100 / students;


        System.out.printf("Top students: %.02f%%%n", topPercentage);
        System.out.printf("Between 4.00 and 4.99: %.02f%%%n", between4and5);
        System.out.printf("Between 3.00 and 3.99: %.02f%%%n", between3and4);
        System.out.printf("Fail: %.02f%%%n", failPercentage);
        System.out.printf("Average: %.02f%%", averageGrade);


    }
}
