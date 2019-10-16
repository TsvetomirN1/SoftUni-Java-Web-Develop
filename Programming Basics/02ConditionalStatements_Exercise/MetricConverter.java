package ConditionalStatements_Exercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metric = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();
        double metersMultiplier = 0;

        if (from.equalsIgnoreCase("mm")){
            metersMultiplier = metric/1000.0;
        }else if (from.equalsIgnoreCase("cm")){
            metersMultiplier = metric/100.0;

        }else if (from.equalsIgnoreCase("m")){
            metersMultiplier = metric;
        }

        double result = 0;
            if (to.equalsIgnoreCase("mm")){
               result = metersMultiplier*1000;
            }
            else if (to.equalsIgnoreCase("cm")){
                result = metersMultiplier*100;

            }
            else if (to.equalsIgnoreCase("m")){
                result =metersMultiplier;}


            System.out.printf("%.3f", result);
        }

    }


