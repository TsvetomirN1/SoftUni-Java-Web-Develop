package FinalExam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("^(\\$|%)([A-Z][a-z]{2,})\\1: \\[(\\d+)\\]\\|\\[(\\d+)\\]\\|\\[(\\d+)\\]\\|$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String name = matcher.group(2);
                int one = Integer.parseInt( matcher.group(3));
                int two = Integer.parseInt( matcher.group(4));
                int three = Integer.parseInt( matcher.group(5));

                if (name.length() >= 3) {

                    StringBuilder message = new StringBuilder();
                    message.append((char) one);
                    message.append((char) two);
                    message.append((char) three);
                    System.out.println(name + ":" + " " + message);

                } else {
                    System.out.println("Valid message not found!");
                }

            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
