package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours*60 + minutes;
        int totalMinutesAfter15Minutes = totalMinutes + 15;
        int currentHour = (totalMinutesAfter15Minutes /60)%24;
        int currentMinutes = totalMinutesAfter15Minutes%60;

        System.out.printf("%d:%02d",currentHour,currentMinutes);

    }
}
