package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double area = 0.0;
        switch (type){
            case("square"):
                double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
            break;
        }
        switch(type){
            case("rectangle"):

            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
            break;
        }
        switch(type){
                case("circle"):
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
            break;

        }switch(type){
            case("triangle"):

            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b / 2;
        }
            System.out.printf("%.3f", area);
        }
    }

