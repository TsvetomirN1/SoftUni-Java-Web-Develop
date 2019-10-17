package ExamsPractice6;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String numInStr = n + "";
        int lastNumber = Integer.parseInt((numInStr).charAt(2)+ "");
        int secondNumber = Integer.parseInt((numInStr).charAt(1)+ "");
        int firstNumber = Integer.parseInt((numInStr).charAt(0)+ "");


        for (int i = 1 ; i <= lastNumber; i++) {
            for (int j = 1; j <= secondNumber ; j++) {
                for (int k =1 ; k <= firstNumber; k++) {
                    int sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, sum);
                }
            }

        }
    }
}
