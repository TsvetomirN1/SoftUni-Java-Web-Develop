package WhileLoopExercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        String lastProblem = "";
        int gradesCounter = 0;
        String command = scanner.nextLine();
        int badGradeCounter = 0;
        double sumOfGrades = 0.0;

        while (!command.equals("Enough")) {

            String problemName = command;
            int problemGrade = Integer.parseInt(scanner.nextLine());
            if (problemGrade <= 4) {
                badGradeCounter++;

            }

            gradesCounter++;
            sumOfGrades += problemGrade;
            lastProblem = problemName;
            if (badGradeCounter == badGrades) {
                break;
            }
            command = scanner.nextLine();

        }
        double averageGrade = sumOfGrades / gradesCounter;

        if (command.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %s%n", gradesCounter);
            System.out.printf("Last problem: %s", lastProblem);


        } else {
            System.out.printf("You need a break, %s poor grades.", badGradeCounter);
        }

    }
}
