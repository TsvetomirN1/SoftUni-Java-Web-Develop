package ExamsPractice2;

import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodDogOnePerDay = Double.parseDouble(scanner.nextLine());
        double foodDogTwoPerDay = Double.parseDouble(scanner.nextLine());
        double foodDogThreePerDay = Double.parseDouble(scanner.nextLine());

        double neededFood = (foodDogOnePerDay * days) + (foodDogTwoPerDay * days) + (foodDogThreePerDay * days);

        if (neededFood<foodLeft) {
            System.out.printf("%.0f more kilos of food are needed.", Math.abs(neededFood - foodLeft));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft - neededFood));

        }


    }
}
