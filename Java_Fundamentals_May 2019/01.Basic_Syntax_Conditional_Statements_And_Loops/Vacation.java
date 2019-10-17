package BasicsSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (typePeople) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;

                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }

                break;
        }
        double totalPrice = people * price;
        if (typePeople.equals("Students")) {
            if (people >= 30) {
                totalPrice = totalPrice * 0.85;
            }
        } else if (typePeople.equals("Business")) {
            if (people >= 100) {
                totalPrice = (people-10)*price;
            }
        } else if (typePeople.equals("Regular")) {
            if (people >= 10 && people <= 20) {
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }

}

