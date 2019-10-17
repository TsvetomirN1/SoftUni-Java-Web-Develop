package ExamsPractice1;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double HallLength = Double.parseDouble(scanner.nextLine());
        double HallWidth = Double.parseDouble(scanner.nextLine());
        double BarSide = Double.parseDouble(scanner.nextLine());

        double HallArea = HallLength * HallWidth;
        double BarArea = BarSide * BarSide;
        double DancingArea = HallArea * 0.19;
        double FreeSpace =  HallArea - BarArea - DancingArea;
        double TotalGuests =  FreeSpace / 3.2;


        System.out.printf("%.0f", Math.ceil(TotalGuests));

    }
}
