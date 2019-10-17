package ExamsPractice2;

import java.util.Scanner;

public class GoingHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        double razhodbenzinkm = Double.parseDouble(scanner.nextLine());
        double benzinPriceforLiter = Double.parseDouble(scanner.nextLine());
        double totalmoney = Double.parseDouble(scanner.nextLine());

        double razhodKola = distance*razhodbenzinkm/100;
        double totalrazhod = razhodKola*benzinPriceforLiter;
        double moneyleft = totalmoney-totalrazhod;
        double nedostig = totalrazhod-totalmoney;
        double part = totalmoney/5;

        if (totalmoney>=totalrazhod){
            System.out.printf("You can go home. %.02f money left.",moneyleft);
        } else {
            System.out.printf("Sorry, you cannot go home. Each will receive %.02f money.",part);

        }

    }
}
