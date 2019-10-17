package Exam2104;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int partides = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (size.equals("Large")){
            switch (color){
                case "Red":
                    price =16;break;
                case "Green":
                    price=12;break;
                case "Yellow":
                    price=9;break;
            }
        }else if (size.equals("Medium")){
            switch (color){
                case "Red":
                    price =13;break;
                case "Green":
                    price=9;break;
                case "Yellow":
                    price=7;break;
            }
        }else if (size.equals("Small")){
            switch (color){
                case "Red":
                    price =9;break;
                case "Green":
                    price=8;break;
                case "Yellow":
                    price=5;break;
            }
        }

        double totalPrice = partides*price;
        double razhod = totalPrice*0.35;
        double finalPrice = totalPrice-razhod;
        System.out.printf("%.2f leva.",finalPrice);
    }
}
