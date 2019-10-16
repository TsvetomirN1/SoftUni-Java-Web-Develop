package SimpleOperationsExercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double ProfitCakes = cakes * 45;
        double ProfitWaffles = waffles * 5.80;
        double ProfitPancakes = pancakes * 3.20;

        double TotalProfit = (ProfitCakes + ProfitWaffles + ProfitPancakes) * chefs*days;
        double finalProfit = TotalProfit - (TotalProfit*(0.125));

        System.out.printf("%.2f", finalProfit);





    }
}
