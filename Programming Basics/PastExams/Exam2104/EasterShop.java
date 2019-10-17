package Exam2104;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int buyCounter = 0;


        while (!"Close".equals(command)) {
            int eggsNum = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                eggs -= eggsNum;
                buyCounter += eggsNum;
                if (eggs < 0) {
                    eggs = eggs + eggsNum;
                    break;
                }

            } else if (command.equals("Fill")) {
                eggs += eggsNum;

            }

            command = scanner.nextLine();
        }

        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", buyCounter);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggs);
        }
    }
}
