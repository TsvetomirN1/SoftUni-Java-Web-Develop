package FinalExamTests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsleOfMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coordinates = null;

        while (coordinates == null) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile("(^[#$%*&])([A-Za-z]+)\\1=(\\d+)!!(.+)$");
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String name = matcher.group(2);
                int length = Integer.parseInt(matcher.group(3));
                String geohashCode = matcher.group(4);

                if (length == geohashCode.length()) {
                    coordinates = name + " -> " + encrypt(geohashCode, length);
                    break;
                }
            }
            System.out.println("Nothing found!");

        }
        System.out.println("Coordinates found! " + coordinates);

    }

    private static String encrypt(String geohashCode, int length) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < geohashCode.length(); i++) {
            char ch = geohashCode.charAt(i);
            char encryptedCH = (char) (ch + length);
            encrypted.append(encryptedCH);

        }
        return encrypted.toString();
    }
}
