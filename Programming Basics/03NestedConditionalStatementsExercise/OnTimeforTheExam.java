package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class OnTimeforTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine()) * 60;
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine()) * 60;
        int arriveMinutes = Integer.parseInt(scanner.nextLine());


        int differenceInTimes = (examHour + examMinutes) - (arriveHour + arriveMinutes);

        int hours = differenceInTimes / 60;
        int minutes = differenceInTimes % 60;


        if (differenceInTimes >= 0 && differenceInTimes <= 30) {
            //On Time
            if (differenceInTimes == 0) {
                System.out.println("On time");
            } else {
                System.out.printf("On time%n%d minutes before the start", minutes);
            }
        } else if (differenceInTimes > 30) {
            //Early
            if (hours == 0) {
                System.out.printf("Early%n%d minutes before the start", minutes);
            } else {
                if (minutes < 10) {
                    System.out.printf("Early%n%d:%02d hours before the start", hours, minutes);
                } else {
                    System.out.printf("Early%n%d:%d hours before the start", hours, minutes);
                }
            }
        } else {
            //Late
            if (hours == 0) {
                System.out.printf("Late%n%d minutes after the start", Math.abs(minutes));
            } else {
                if (minutes < 10) {
                    System.out.printf("Late%n%d:%02d hours after the start", Math.abs(hours), Math.abs(minutes));
                } else {
                    System.out.printf("Late%n%d:%d hours after the start", Math.abs(hours), Math.abs(minutes));
                }
            }
        }
    }
}
