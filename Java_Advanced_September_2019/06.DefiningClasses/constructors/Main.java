package DefiningClasses.constructors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cars; i++) {

            String[] carInfo = scanner.nextLine().split(" ");
            Car current;
            if (carInfo.length == 1) {
                current = new Car(carInfo[0]);
            } else {
                int horsepower = Integer.parseInt(carInfo[2]);
                current = new Car(carInfo[0], carInfo[1], horsepower);
            }


            System.out.println(current.toString());
        }

    }
}
