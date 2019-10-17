package BasicsSyntax;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double passed = Double.parseDouble(scanner.nextLine());

        if (passed>=3){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");

        }
    }
}
