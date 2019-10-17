package ExamsPractice2;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double sumtobeEarned = Double.parseDouble(scanner.nextLine());

        double shortiPrice = tshirtPrice*0.75;
        double ChorapiPrice = shortiPrice*0.20;
        double butonkiPrice = (tshirtPrice+shortiPrice)*2;
        double totalsum = tshirtPrice+shortiPrice+butonkiPrice+ChorapiPrice;
        double discount = totalsum*0.15;
        double SumAfterDiscount = totalsum-discount;

        if (SumAfterDiscount>=sumtobeEarned){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.02f lv.", SumAfterDiscount);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.02f lv. more.",sumtobeEarned-SumAfterDiscount);
        }
    }
}
