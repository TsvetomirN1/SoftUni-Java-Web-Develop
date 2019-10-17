package DefiningClasses.CarSalesman;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new LinkedList<>();
        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            Engine engine = createEngine(data);
            engineList.add(engine);
        }

        int M = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new LinkedList<>();
        while (M-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            Car car = createCar(data,engineList);
            carList.add(car);
        }

        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    static Engine createEngine(String[] data) {
        String model = data[0];
        int power = Integer.parseInt(data[1]);
        Engine engine = new Engine(model, power);

        if (data.length == 3 && Character.isDigit(data[2].charAt(0))) {
            String displacement = data[2];
            engine.setDisplacement(displacement);
        } else if (data.length == 3 && !Character.isDigit(data[2].charAt(0))) {
            String efficiency = data[2];
            engine.setEfficiency(efficiency);
        } else if (data.length == 4) {
            String displacement = data[2];
            String efficiency = data[3];
            engine.setDisplacement(displacement);
            engine.setEfficiency(efficiency);
        }

        return engine;
    }

    static Car createCar(String[] data, List<Engine> engineList) {
        String model = data[0];
        String engineModel = data[1];
        Car car = new Car();
        for (Engine engine : engineList) {
            if (engine.getModel().equals(engineModel)) {
                car = new Car(model, engine);
            }
        }

        if (data.length == 3 && Character.isDigit(data[2].charAt(0))) {
            String weight = data[2];
            car.setWeight(weight);
        } else if (data.length == 3 && !Character.isDigit(data[2].charAt(0))) {
            String color = data[2];
            car.setColor(color);
        } else if (data.length == 4) {
            String weight = data[2];
            String color = data[3];
            car.setWeight(weight);
            car.setColor(color);
        }
        return car;
    }
}
