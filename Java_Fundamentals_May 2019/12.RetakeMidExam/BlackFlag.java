package RetakeMidExam;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;
        for (int i = 1; i <= days; i++) {

            if (i % 3 == 0) {
                totalPlunder += dailyPlunder+ (dailyPlunder * 0.5);
            }else if (i %3 !=0){
                totalPlunder+=dailyPlunder;
            }
            if (i % 5 == 0) {
                totalPlunder = totalPlunder * 0.7;
            }


        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        }
        if (totalPlunder < expectedPlunder) {

            double percentageLeft = (totalPlunder / expectedPlunder) * 100.00;
            System.out.printf("Collected only %.2f%% of the plunder.", percentageLeft);
        }

    }
}
