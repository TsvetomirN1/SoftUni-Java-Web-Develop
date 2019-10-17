package ExamsPractice5;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfComputers = Integer.parseInt(scanner.nextLine());
        int i = 0;
        double sales = 0;
        double salesProbability = 0;
        double averageRating = 0.0;

        while (i < numberOfComputers) {
            i++;
            int input = Integer.parseInt(scanner.nextLine());
            int rating = input%10;
            sales = Math.floor(input/10);
            averageRating += rating;
            switch(rating) {
                case 2:
                    salesProbability += sales * 0;
                    break;
                case 3:
                    salesProbability += sales * 0.5;
                    break;
                case 4:
                    salesProbability += sales * 0.7;
                    break;
                case 5:
                    salesProbability += sales * 0.85;
                    break;
                case 6:
                    salesProbability += sales;
                    break;
            }
        }
        System.out.printf("%.2f", salesProbability);
        System.out.println();
        System.out.printf("%.2f", averageRating/numberOfComputers);


    }
}