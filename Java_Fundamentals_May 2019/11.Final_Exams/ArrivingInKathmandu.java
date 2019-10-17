package FinalExamTests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coordinates = null;

        String line = scanner.nextLine();

        while (!line.equals("Last note")) {

            Pattern pattern = Pattern.compile("^([A-Za-z0-9!@#$?]+)=([0-9]+)<<(.+)$");
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String peak = matcher.group(1);
                int length = Integer.parseInt(matcher.group(2));
                String geoHashCode = matcher.group(3);
                String resultName = "";

                if (length == geoHashCode.length()) {
                    for (int i = 0; i < peak.length(); i++) {

                        if (Character.isLetterOrDigit(peak.charAt(i))) {
                            resultName += peak.charAt(i);

                        }
                    }

                    System.out.printf("Coordinates found! %s -> %s%n", resultName, geoHashCode);

                } else {
                    System.out.println("Nothing found!");
                }
            } else {
                System.out.println("Nothing found!");
            }
            line = scanner.nextLine();
        }
    }
}