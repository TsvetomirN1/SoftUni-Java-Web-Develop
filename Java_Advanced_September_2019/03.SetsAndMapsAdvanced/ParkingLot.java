package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        HashSet<String> carNumbers = new HashSet<>();
        String line = scanner.nextLine();

        while (!line.equals("END")) {
            String[] commandParts = line.split(", ");
            String command = commandParts[0];
            String registrationNumbers = commandParts[1];
            switch (command) {
                case "IN":
                    carNumbers.add(registrationNumbers);
                    break;

                case "OUT":
                    carNumbers.remove(registrationNumbers);
                    break;
            }

            line = scanner.nextLine();
        }

        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }
}


