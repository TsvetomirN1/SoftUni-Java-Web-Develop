package ConditionalStatements_Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int TotalTime = timeFirst+ timeSecond+ timeThird;
        int TotalTimeInMinutes = TotalTime/60;
        int TotalTimeInSeconds = TotalTime%60;


            System.out.printf("%d:%02d",TotalTimeInMinutes, TotalTimeInSeconds);



    }
}
