package WhileLoopExercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookOfInterest = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());

        int checkedBooks = 0;

        while (capacity > checkedBooks) {
            String bookName = scanner.nextLine();
            if (bookName.equals(bookOfInterest)) {
                System.out.printf("You checked %s books and found it. ", checkedBooks);
                break;
            }

            checkedBooks++;
        }

        if (checkedBooks == capacity) {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %s books.", checkedBooks);


        }

    }
}
