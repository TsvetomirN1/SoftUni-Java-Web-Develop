package ExamsPractice1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = tax * 0.6;
        double equipPrice = sneakersPrice * 0.8;
        double ballPrice = equipPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.20;

        double totalPrice = tax+ sneakersPrice + equipPrice + ballPrice + accessoriesPrice;
        System.out.printf("%.02f", totalPrice);

    }
}
