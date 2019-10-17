package MIDEXAMS.Mid_Exam10March.Mid_Exam10March;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeTheFire {
    private static boolean checkWater(int water, int cellValue) {
        if (water - cellValue >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\#");
        int water = Integer.parseInt(scanner.nextLine());
        double effort = 0;
        double totalFire = 0;

        List<Integer> putOutCells = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split(" = ");
            String type = tokens[0];
            int cellValue = Integer.parseInt(tokens[1]);

            switch (tokens[0]) {
                case "High":
                    if (cellValue >= 81 && cellValue <= 125 && checkWater(water, cellValue)) {
                        water -= cellValue;
                        effort += cellValue * 0.25;
                        putOutCells.add(cellValue);
                        totalFire += cellValue;

                        break;
                    }
                case "Medium":
                    if (cellValue >= 51 && cellValue <= 80 && checkWater(water, cellValue)) {
                        water -= cellValue;
                        effort += cellValue * 0.25;
                        putOutCells.add(cellValue);
                        totalFire += cellValue;

                        break;
                    }

                case "Low":
                    if (cellValue >= 1 && cellValue <= 50 && checkWater(water, cellValue)) {
                        water -= cellValue;
                        effort += cellValue * 0.25;
                        putOutCells.add(cellValue);
                        totalFire += cellValue;

                        break;
                    }

            }

        }
        System.out.println("Cells:");
        for (int e : putOutCells) {
            System.out.printf("- %d%n", e);
        }
        System.out.printf("Effort: %.2f%n", effort);
        System.out.printf("Total Fire: %.0f", totalFire);
    }

}

