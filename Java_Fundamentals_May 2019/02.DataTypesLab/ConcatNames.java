package DataTypesExercise.DataTypesLab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s%s%s",firstName,delimeter,lastName);
    }
}
