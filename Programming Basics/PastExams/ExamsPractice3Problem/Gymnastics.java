package ExamsPractice3;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String ured = scanner.nextLine();

        double difficulty = 0;
        double izpalnenie = 0;

        if (country.equals("Russia")) {

            switch (ured) {
                case "ribbon":
                    difficulty = 9.100;
                    izpalnenie = 9.400;
                    break;
                case "hoop":
                    difficulty = 9.300;
                    izpalnenie = 9.800;
                    break;
                case "rope":
                    difficulty = 9.600;
                    izpalnenie = 9.000;
                    break;

            }
        } else if (country.equals("Bulgaria")) {
            switch (ured) {
                case "ribbon":
                    difficulty = 9.600;
                    izpalnenie = 9.400;
                    break;
                case "hoop":
                    difficulty = 9.550;
                    izpalnenie = 9.750;
                    break;
                case "rope":
                    difficulty = 9.500;
                    izpalnenie = 9.400;
                    break;
            }

        } else if (country.equals("Italy")) {
            switch (ured) {
                case "ribbon":
                    difficulty = 9.200;
                    izpalnenie = 9.500;
                    break;
                case "hoop":
                    difficulty = 9.450;
                    izpalnenie = 9.350;
                    break;
                case "rope":
                    difficulty = 9.700;
                    izpalnenie = 9.150;
                    break;
            }
        }
        double ocenka = difficulty + izpalnenie;
        double ostavat = 20 - ocenka;
        double percentage = (ostavat / 20) * 100;

        System.out.printf("The team of %s get %.03f on %s.%n", country, ocenka, ured);
        System.out.printf("%.02f%%", percentage);
    }
}
