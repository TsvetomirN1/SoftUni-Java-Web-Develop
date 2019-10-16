package NestedConditionalStatements;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String evalution = scanner.nextLine();

        double price = 0.0;
        double discount = 0.0;

        if (type.equals("apartment")){
            price = (days-1)*25.00;

            if (days<10){
                discount = price*0.3;

            }else if (days>=10 &&days<=15){
               discount = price*0.35;

            }else {
                discount = price*0.5;
            }
            price = price - discount;
        }else if (type.equals("president apartment")){
            price = (days-1)*35;
            if (days<10){
                discount=price*0.10;

            }else if (days<=10 && days<=15){
                discount = price*0.15;

            }else {
                discount=price*0.2;
            }
            price = price-discount;
        }else {
            price = (days-1)*18;
        }

        if (evalution.equals("positive")){
            price = price * 1.25;
        }else {
            price = price*0.9;
        }
        System.out.printf("%.2f", price);

    }
}
