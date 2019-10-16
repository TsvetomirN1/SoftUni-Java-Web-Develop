package SimpleOperationsExercises;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AllTables = Integer.parseInt(scanner.nextLine());
        double tablesLength = Double.parseDouble(scanner.nextLine());
        double tablesWidth = Double.parseDouble(scanner.nextLine());

        double widthCover = tablesWidth + 0.3 * 2;
        double lengthCover = tablesLength + 0.3 * 2;

        double areaofCover = widthCover * lengthCover;
        double squareSide = tablesLength / 2;
        double squarearea = Math.pow(squareSide, 2);

        double priceofCoverinUSD = areaofCover * 7;
        double priceofsquareinUSD = squarearea * 9;
        double TotalpriceOfCoversinUSD = priceofCoverinUSD * AllTables;
        double TotalpriceOfSquareinUSD = priceofsquareinUSD * AllTables;
        double TotalCostinUSD = TotalpriceOfCoversinUSD + TotalpriceOfSquareinUSD;
        double TotalCostinBGN = TotalCostinUSD * 1.85;

        System.out.printf("%.2f USD", TotalCostinUSD);
        System.out.println();
        System.out.printf("%.2f BGN", TotalCostinBGN);


        }








    }

