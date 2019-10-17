package ExamsPractice4;

import java.util.Scanner;

public class OwnBusines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int totalSpace = w * l * h;

        int computerCounter = 0;
        while (!command.equals("Done")) {

            int computerNum = Integer.parseInt(command);
            computerCounter += computerNum;

            if (totalSpace < computerCounter) {
                break;

            }

            command = scanner.nextLine();
        }
        if (computerCounter <= totalSpace) {
            System.out.printf("%d Cubic meters left.", totalSpace - computerCounter);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",
                    Math.abs(computerCounter - totalSpace));
        }
    }
}

