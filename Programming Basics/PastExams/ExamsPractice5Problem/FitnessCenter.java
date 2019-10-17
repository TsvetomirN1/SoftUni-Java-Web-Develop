package ExamsPractice5;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int shakeCounter = 0;
        int barCounter = 0;

        for (int i = 0; i < people; i++) {
            String command = scanner.nextLine();
            if (command.equals("Back")){
                backCounter++;
            }else if (command.equals("Chest")){
                chestCounter++;
            }else if (command.equals("Legs")){
                legsCounter++;
            }else if (command.equals("Abs")){
                absCounter++;
            }else if (command.equals("Protein shake")){
                shakeCounter++;
            }else if (command.equals("Protein bar")){
                barCounter++;
            }
        }
        double totalVisitors = chestCounter+backCounter+legsCounter+absCounter;
        double totalPercentage = totalVisitors*100/people;
        double totalEat = barCounter+shakeCounter;
        double eatPercentage = (totalEat*100)/people;

        System.out.printf("%d - back%n", backCounter);
        System.out.printf("%d - chest%n", chestCounter);
        System.out.printf("%d - legs%n", legsCounter);
        System.out.printf("%d - abs%n", absCounter);
        System.out.printf("%d - protein shake%n", shakeCounter);
        System.out.printf("%d - protein bar%n", barCounter);
        System.out.printf("%.02f%% - work out%n", totalPercentage);
        System.out.printf("%.02f%% - protein", eatPercentage);
    }
}
