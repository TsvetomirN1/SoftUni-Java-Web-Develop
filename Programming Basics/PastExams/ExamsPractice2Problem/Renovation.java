package ExamsPractice2;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double widthFloor = Double.parseDouble(scanner.nextLine());
        double longFloor = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleH = Double.parseDouble(scanner.nextLine());
        double onePlochkaPrice = Double.parseDouble(scanner.nextLine());
        double sumForMaistor = Double.parseDouble(scanner.nextLine());

        double ploshtFloor = widthFloor*longFloor;
        double trianglePlosht = triangleSide*triangleH/2;
        double triangleNeeded = Math.ceil(ploshtFloor/trianglePlosht)+5;
        double totalPrice = triangleNeeded*onePlochkaPrice + sumForMaistor;

        if (budget>=totalPrice){
            System.out.printf("%.02f lv left.", budget-totalPrice);
        }else {
            System.out.printf("You'll need %.02f lv more.", totalPrice-budget);
        }
    }
}
