package ExamsPractice3;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int souvenirsNum = Integer.parseInt(scanner.nextLine());

        double price = 0;
        boolean invalidCountry = false;
        boolean invalidStock = false;


        if (team.equals("Argentina")) {
            if (souvenirs.equals("flags")) {
                price = souvenirsNum * 3.25;
            } else if (souvenirs.equals("caps")) {
                price = souvenirsNum * 7.20;
            } else if (souvenirs.equals("posters")) {
                price = souvenirsNum * 5.10;
            } else if (souvenirs.equals("stickers")) {
                price = souvenirsNum * 1.25;
            }
        } else if (team.equals("Brazil")) {
            if (souvenirs.equals("flags")) {
                price = souvenirsNum * 4.20;
            } else if (souvenirs.equals("caps")) {
                price = souvenirsNum * 8.50;
            } else if (souvenirs.equals("posters")) {
                price = souvenirsNum * 5.35;
            } else if (souvenirs.equals("stickers")) {
                price = souvenirsNum * 1.20;
            }

        } else if (team.equals("Croatia")) {
            if (souvenirs.equals("flags")) {
                price = souvenirsNum * 2.75;
            } else if (souvenirs.equals("caps")) {
                price = souvenirsNum * 6.90;
            } else if (souvenirs.equals("posters")) {
                price = souvenirsNum * 4.95;
            } else if (souvenirs.equals("stickers")) {
                price = souvenirsNum * 1.10;
            }

        } else if (team.equals("Denmark")) {
            if (souvenirs.equals("flags")) {
                price = souvenirsNum * 3.10;
            } else if (souvenirs.equals("caps")) {
                price = souvenirsNum * 6.50;
            } else if (souvenirs.equals("posters")) {
                price = souvenirsNum * 4.80;
            } else if (souvenirs.equals("stickers")) {
                price = souvenirsNum * 0.90;
            }

        }else {
            invalidStock = true;
            System.out.println("Invalid Stock");
        }
        if (invalidCountry){
            invalidCountry = true;
            System.out.println("Invalid country!");
        }


        if (team.equals("Argentina") || team.equals("Brazil") ||
                team.equals("Croatia") || team.equals("Denmark"))
                 {

            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirsNum, souvenirs, team, price);

        }
    }
}

