package ExamsPractice1;

import java.util.Scanner;

public class TrekkingEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int carabiners = Integer.parseInt(scanner.nextLine());
        int ropes = Integer.parseInt(scanner.nextLine());
        int pickels = Integer.parseInt(scanner.nextLine());

        double totalPrice = (carabiners * 36 + ropes *3.60+pickels*19.80)*people;
        double priceWithDDS =  totalPrice+(totalPrice*20/100);
        System.out.printf("%.02f",priceWithDDS);
    }
}
