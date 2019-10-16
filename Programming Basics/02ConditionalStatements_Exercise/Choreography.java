package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double percentStepsPerDay = (Math.ceil((steps/days))/steps)*100;
        double PercentStepsForEveryDancer = (percentStepsPerDay/dancers);

        if ( percentStepsPerDay <= 13) {

            System.out.printf("Yes, they will succeed in that goal! %.02f%%.", PercentStepsForEveryDancer);

        } else {
            System.out.printf("No, they will not succeed in that goal! Required %.02f%% steps to be learned per day.",
                    PercentStepsForEveryDancer);
        }
    }}

