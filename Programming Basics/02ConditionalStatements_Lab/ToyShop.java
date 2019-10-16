package ConditionalStatements;
import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ExcursionsPrice = Double.parseDouble(scanner.nextLine());
        int Puzzles = Integer.parseInt(scanner.nextLine());
        int TalkingDolls = Integer.parseInt(scanner.nextLine());
        int Bear = Integer.parseInt(scanner.nextLine());
        int Minions = Integer.parseInt(scanner.nextLine());
        int Trucks = Integer.parseInt(scanner.nextLine());

        double Price = Puzzles*2.6 + TalkingDolls*3 + Bear* 4.10 +
                Minions*8.20+ Trucks*2;
        int sumToys = Puzzles + TalkingDolls+ Bear+Minions+Trucks;
        if (sumToys>=50){
            Price = Price-Price*0.25;
        }
        double TotalMoney = Price- Price*0.10;
        double diff = Math.abs(ExcursionsPrice - TotalMoney);
        if(TotalMoney>=ExcursionsPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else {

            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
