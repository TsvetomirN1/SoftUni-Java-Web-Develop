package ExamsPractice4;

import java.util.Scanner;

public class PuppyCare {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int buyFood = Integer.parseInt(scanner.nextLine());
            int foodInGrams = buyFood * 1000;
            int diff = foodInGrams;

            String end = scanner.nextLine();
            while (!end.equals("Adopted")){
                int endInInt = Integer.parseInt(end);
                diff -= endInInt;
                end = scanner.nextLine();
            }
            if (diff >= 0){
                System.out.printf("Food is enough! Leftovers: %d grams.",diff);
            }
            else {
                System.out.printf("Food is not enough. You need %d grams more.",Math.abs(diff));
            }
        }
    }


