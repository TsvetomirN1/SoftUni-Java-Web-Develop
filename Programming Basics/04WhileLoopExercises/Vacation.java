package WhileLoopExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());

        int daysCounter =0;
        int spendingCounter=0;
        boolean prahosnica = false;


        while(moneyNeeded>moneyAvailable){
            daysCounter++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (command.equals("spend")){
                spendingCounter++;
                if (moneyAvailable-money<0){
                    moneyAvailable=0;
                }else {
                    moneyAvailable-=money;
                }

            }else if (command.equals("save")){
                spendingCounter=0;
                moneyAvailable+=money;
            }


            if (spendingCounter==5){
                prahosnica=true;
                break;
            }
        }

        if (prahosnica){
            System.out.println("You can't save the money.");
            System.out.printf("%s",daysCounter);
        }else  {
            System.out.printf("You saved the money for %d days.",daysCounter);
        }




    }
}
