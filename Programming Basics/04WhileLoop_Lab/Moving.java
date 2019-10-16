package WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int houseVolume = w * l * h;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxCount = Integer.parseInt(input);
            houseVolume -= boxCount;
            if (houseVolume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(houseVolume));
                break;
            }
            input = scanner.nextLine();


        }
        if (houseVolume > 0) {
            System.out.printf("%d Cubic meters left.", houseVolume);

        }
    }
}
