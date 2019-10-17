package ExamsPractice4;
import java.util.Scanner;

public class WeddingDecoration {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double balloonPrice = 0.1;
            double flowerPrice = 1.5;
            double candlePrice = 0.5;
            double ribbonPrice = 2;

            double totalPrice = 0;

            int balloonsCount = 0;
            int flowersCount = 0;
            int candlesCount = 0;
            int ribbonsCount = 0;

            double budget = Double.parseDouble(scanner.nextLine());

            double moneyLeft = budget;

            while (budget > totalPrice){

                String item = scanner.nextLine();

                if (item.equalsIgnoreCase("stop")){
                    System.out.printf("Spend money: %.2f%n", totalPrice);
                    System.out.printf("Money left: %.2f%n", moneyLeft);
                    System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.",
                            balloonsCount, ribbonsCount, flowersCount, candlesCount);
                    return;
                }

                int count = Integer.parseInt(scanner.nextLine());

                double currentPrice = 0;
                switch (item){
                    case "balloons":
                        currentPrice += count * balloonPrice;
                        balloonsCount += count;
                        break;
                    case "flowers":
                        currentPrice += count * flowerPrice;
                        flowersCount += count;
                        break;
                    case "candles":
                        currentPrice += count * candlePrice;
                        candlesCount += count;
                        break;
                    case "ribbon":
                        currentPrice += count * ribbonPrice;
                        ribbonsCount += count;
                        break;
                }

                totalPrice += currentPrice;
                moneyLeft -= currentPrice;
            }

            System.out.printf("All money is spent!%n");
            System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.",
                    balloonsCount, ribbonsCount, flowersCount, candlesCount);

        }
    }

