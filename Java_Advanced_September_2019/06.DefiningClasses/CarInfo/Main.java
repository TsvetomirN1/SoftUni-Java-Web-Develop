package DefiningClasses.carInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cars; i++) {
            Car current = new Car();
            String[] carParts = scanner.nextLine().split(" ");
            current.setMake(carParts[0]);
            current.setModel(carParts[1]);
            int horsePower = Integer.parseInt(carParts[2]);
            current.setHorsePower(horsePower);

            System.out.println(current.carInfo());
        }
    }
}
