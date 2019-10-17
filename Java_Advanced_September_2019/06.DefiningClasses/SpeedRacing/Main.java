package DefiningClasses.SpeedRacing;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new LinkedList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuelAmount = Integer.parseInt(tokens[1]);
            double fuelCostPerKm = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerKm);
            cars.add(car);
        }

        String command = "";
        while (!"End".equals(command = scanner.nextLine())) {
            String[] tokens = command.split("\\s+");
            String model = tokens[1];
            double amountOfKm = Integer.parseInt(tokens[2]);

            for (Car car : cars) {
                if (model.equals(car.getModel())){
                    if (car.drive(amountOfKm)){
                        car.setFuelAmount(amountOfKm);
                        car.addDistance(amountOfKm);
                    }else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }

        }

        cars.forEach(e -> System.out.print(e.toString()));
    }
}
