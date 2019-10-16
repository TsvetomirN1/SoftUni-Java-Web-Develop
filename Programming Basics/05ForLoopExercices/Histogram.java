package ForLoopExercices;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1++;
            }else if (number >= 200 && number <= 399) {
                p2++;
            }else if (number >= 400 && number <= 599) {
                p3++;
            }else if (number>=600 && number <= 799){
                p4++;
            }else if (number>=800){
                p5++;
            }
        }
        double p1Percentage = p1 / n * 100;
        double p2Percentage = p2 / n * 100;
        double p3Percentage = p3 / n * 100;
        double p4Percentage = p4 / n * 100;
        double p5Percentage = p5 / n * 100;

        System.out.printf("%.2f%%", p1Percentage);
        System.out.println();
        System.out.printf("%.2f%%", p2Percentage);
        System.out.println();
        System.out.printf("%.2f%%", p3Percentage);
        System.out.println();
        System.out.printf("%.2f%%", p4Percentage);
        System.out.println();
        System.out.printf("%.2f%%", p5Percentage);
    }
}
