package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceOfFlat = 0;
        double priceOfStudio = 0;

        if (month.equals("May")|| month.equals("October")){
            priceOfFlat = 65*nights;
            priceOfStudio = 50*nights;
            if (nights > 7 && nights <= 14){
                priceOfStudio = priceOfStudio*0.95;
            }else if (nights>14 ){
                priceOfStudio = priceOfStudio*0.7;
            }

        }else if (month.equals("June")|| month.equals("September")){
            priceOfFlat = 68.7*nights;
            priceOfStudio = 75.2*nights;
            if (nights > 14){
                priceOfStudio = priceOfStudio*0.8;
            }

        }else if (month.equals("July")|| month.equals("August")){
            priceOfFlat = 77*nights;
            priceOfStudio = 76*nights;

        }if (nights > 14){
            priceOfFlat = priceOfFlat*0.9;
        }

        System.out.printf("Apartment: %.2f lv.", priceOfFlat);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", priceOfStudio);


    }
}
