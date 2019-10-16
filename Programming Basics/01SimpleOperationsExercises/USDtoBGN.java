package SimpleOperationsExercises;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD = Double.parseDouble(scanner.nextLine());
        Double BGN = USD * 1.79549;
        System.out.printf("%.2f", BGN);


    }
}
