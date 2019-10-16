package ProgramingBasics.SimpleOperations;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aquariumLength = Integer.parseInt(scanner.nextLine());
        int aquariumWidth = Integer.parseInt(scanner.nextLine());
        int aquariumHeight = Integer.parseInt(scanner.nextLine());
        double sandPercent = Double.parseDouble(scanner.nextLine());

        int aquariumVolume = aquariumLength * aquariumWidth * aquariumHeight;
        double aquariumVolumeInDecimeters = aquariumVolume * 0.001;
        double percent = sandPercent * 0.01;
        double result = aquariumVolumeInDecimeters * (1 - percent);
        System.out.printf("%.3f",result);

    }
}
